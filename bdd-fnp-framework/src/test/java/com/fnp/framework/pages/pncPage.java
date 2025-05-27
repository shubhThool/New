package com.fnp.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pncPage {
	
	public void assertPaymentNotConfirmed(WebDriver driver) {
	    String actualText = driver.findElement(By.xpath("//*[normalize-space()='Payment Not Confirmed. Order']")).getText();
	    Assert.assertEquals("Payment confirmation message mismatch", "Payment Not Confirmed. Order", actualText);
	}

}
