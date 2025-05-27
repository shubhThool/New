package com.fnp.framework.pages;

import org.openqa.selenium.By;

public class homePage {
    public static final By PLANT_CATEGORY = By.xpath("//span[contains(@class,'text-12 font-500 text-black-900 hover:text-green-100 xl:text-14')][normalize-space()='Plants']");

    public static final By click_WhereTo_Location= By.xpath("//span[contains(text(),'Where to deliver?')]");
    public static final By Click_pincode_Field= By.xpath("//input[@id='pincode-location-input']");
    
    public static final By Continue_Shopping= By.xpath("//div[contains(text(),'Continue Shopping')]");
    
  //div[contains(text(),'Continue Shopping')]
}
