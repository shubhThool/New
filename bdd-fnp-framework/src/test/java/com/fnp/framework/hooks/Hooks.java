package com.fnp.framework.hooks;

import com.fnp.framework.driver.DriverManager;
import com.fnp.framework.config.ConfigLoader;
import com.fnp.framework.utils.FrameworkUtils; // ✅ Import utility class

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
        try {
            DriverManager.initDriver();
            WebDriver driver = DriverManager.getDriver();
            driver.manage().window().maximize();

            String baseUrl = ConfigLoader.get("base.url");
            System.out.println("Navigating to: " + baseUrl);

            if (baseUrl == null || baseUrl.isEmpty()) {
                throw new IllegalArgumentException("Base URL not set in the config file.");
            }

            driver.get(baseUrl);

            //Automatically close popup if it appears
            
            FrameworkUtils.closePopupIfPresent(driver);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error during setup: " + e.getMessage(), e);
        }
    }

    @After
    public void tearDown() {
        try {
            DriverManager.quitDriver(); // Re-enable this if previously commented
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
