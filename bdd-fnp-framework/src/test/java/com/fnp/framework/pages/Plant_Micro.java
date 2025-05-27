package com.fnp.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Plant_Micro {
    private WebDriver driver;

    public Plant_Micro(WebDriver driver) {
        this.driver = driver;
    }

     
    public boolean isPlantMicroPageLoaded() {
        return driver.getCurrentUrl().toLowerCase().contains("plants");
    }
    public static final By PLANT_CATEGORY = By.xpath("//a[@href='/plants-bestsellers-lp?promo=plants_micro_desk_icon_pos_1']");
  //div[@class='p-1 pr-4']
    public static final By Close_Popup = By.xpath("//div[@class='p-1 pr-4']");

}
