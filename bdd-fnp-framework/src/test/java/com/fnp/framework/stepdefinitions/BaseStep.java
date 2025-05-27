package com.fnp.framework.stepdefinitions;

import com.fnp.framework.driver.DriverManager;
import com.fnp.framework.utils.FrameworkUtils;
import org.openqa.selenium.WebDriver;

public class BaseStep {
    protected WebDriver driver = DriverManager.getDriver();
    protected FrameworkUtils utils = new FrameworkUtils(driver);
}
