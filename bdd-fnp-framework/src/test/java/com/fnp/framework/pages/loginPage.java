package com.fnp.framework.pages;

import org.openqa.selenium.By;

public class loginPage {
	
	public static final By Click_google_Login =By.xpath("//button[@class=' flex w-full h-auto px-10 py-12 items-center gap-2.5 text-xs bg-white border border-primary-green100 text-primary-green100 justify-center  rounded-lg  ']");
	//div[contains(@class,'flex w-full flex-col flex-wrap rounded-t-3xl bg-white-900 px-16 pb-30 pt-62 md:py-24 md:shadow-none md:px-16')]//div[contains(@class,'w-full')]//div[contains(@class,'flex w-full items-center justify-center')]//button[contains(@aria-label,'button')]
	public static final By Enter_Email =By.xpath("//input[@id='identifierId']");

	public static final By click_next =By.xpath("//*[contains(text(),'Next')]");
	
	public static final By Passwd =By.xpath("//input[@name='Passwd']");
	public static final By Passwd_next =By.xpath("//span[text()='Next']");

}
//span[text()='Next']