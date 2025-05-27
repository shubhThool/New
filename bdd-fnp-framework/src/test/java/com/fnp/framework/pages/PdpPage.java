package com.fnp.framework.pages;

import org.openqa.selenium.By;

public class PdpPage {
	
	public static final By click_HandDelivery =By.xpath("//div[normalize-space()='Earliest by Today']");
	
	public static final By delivery_date_slot =By.xpath("//input[@id='delivery_date_slot']");
	
	public static final By availableOptionsText =By.xpath("//h2[@class='text-16 font-600 text-fnp-500']");
	
	public static final By Delivery_Method =By.xpath("//span[normalize-space()='Choose from any 4-hour slot during the day']");
	
	public static final By TimeSlot =By.xpath("//span[normalize-space()='19:00 - 23:00 Hrs']");
	
    public static final By Add_To_Cart_button =By.xpath("//button[@title='Add To Cart']");
	
}
