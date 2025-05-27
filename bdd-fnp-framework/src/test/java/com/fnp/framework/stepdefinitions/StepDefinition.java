
package com.fnp.framework.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

import com.fnp.framework.config.ConfigLoader;
import com.fnp.framework.driver.DriverManager;
import com.fnp.framework.pages.DA_Page;
import com.fnp.framework.pages.PdpPage;
import com.fnp.framework.pages.Plant_Micro;
import com.fnp.framework.pages.add_ons_page;
import com.fnp.framework.pages.add_to_cart;
import com.fnp.framework.pages.homePage;
import com.fnp.framework.pages.loginPage;
import com.fnp.framework.pages.paymentPage;
import com.fnp.framework.pages.plant_PLP;
import com.fnp.framework.pages.pncPage;
import com.fnp.framework.utils.FrameworkUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseStep {

	protected WebDriver driver = DriverManager.getDriver();
	protected FrameworkUtils utils = new FrameworkUtils(driver);

	@Given("the user is on FNP homepage")
	public void userOnHomepage() {
		System.out.println("Current URL: " + DriverManager.getDriver().getCurrentUrl());

	}

	@When("user click on where to location")
	public void user_click_on_where_to_location() {
		utils.removeOverlayUsingJS();
		utils.click(homePage.click_WhereTo_Location);
	}

	@When("Enter pincode and click on continue")
	public void enter_pincode_and_click_on_continue() throws InterruptedException {
//	   utils.click(homePage.Click_pincode_Field);
//        utils.userEntersPincodeAndPressesEnter();

		utils.userEntersPincodeAndPressesEnter();
		Thread.sleep(3000);
		utils.click(homePage.Continue_Shopping);

	}

	@When("user click on plant category from the home page")
	public void user_click_on_plant_category() throws InterruptedException {
		Thread.sleep(3000);

		// utils.closeWebEngagePopupIfPresent();
		// utils.waitForOverlayToDisappear();

		// utils.removeOverlayUsingJS();

		utils.forceClickUsingJS(homePage.PLANT_CATEGORY);

		Plant_Micro plantmicro = new Plant_Micro(DriverManager.getDriver());
		assertTrue(plantmicro.isPlantMicroPageLoaded(), "User is not on plant Micro page");

	}

	@And("click on best seller plant")
	public void click_on_best_seller_plant() {
//    	utils.click(Plant_Micro.Close_Popup);
		utils.click(Plant_Micro.PLANT_CATEGORY);

	}

	@And("click on first plant product in PLP")
	public void click_on_first_plant_product() {

		utils.click(plant_PLP.plant_product);
	}

//    @And("enter pincode in PDP")
//    public void enter_pincode() {
//    	
//    	utils.switchToLastTab(driver);
//    	utils.userEntersPincodeAndPressesEnter();
//    	
//    	
//    }
	@And("Click on Hand Delivery if available otherwise click on calendar")
	public void clickHandDeliveryOrCalendar() {
		utils.switchToLastTab(driver);
		utils.handleDeliveryOptionAndClickCalendar(PdpPage.availableOptionsText, PdpPage.click_HandDelivery,
				PdpPage.delivery_date_slot);

	}

	@When("select today date from the calender")
	public void select_today_date_from_the_calender() {
		utils.clickTomorrowDateInCalendar();
	}

	@When("Select Delivery Method & Time Slot")
	public void select_delivery_method_time_slot() {

		utils.click(PdpPage.Delivery_Method);
		utils.click(PdpPage.TimeSlot);

	}

	@When("click on add to cart button")
	public void click_on_add_to_cart_button() {
		// utils.click(PdpPage.Add_To_Cart_button);
		utils.forceClickUsingJS(PdpPage.Add_To_Cart_button);
	}

	@When("click on one product from the add-ons window")
	public void click_on_one_product_from_the_add_ons_window() {
		utils.click(add_ons_page.Add_ons_Window);
	}

	@When("Click on continue")
	public void click_on_continue() {
		utils.click(add_ons_page.Add_ons_Continue);

	}

	@Then("verify product is successfully added to the cart")
	public void verify_product_is_successfully_added_to_the_cart() {

	}

	@Then("click on proceed to pay")
	public void click_on_proceed_to_pay() {
		utils.click(add_to_cart.Click_proceed_to_Pay);

	}

	@Then("click on login with google")
	public void click_on_login_with_google() throws InterruptedException {
		Thread.sleep(3000);

		utils.click(loginPage.Click_google_Login);

	}

	@Then("Enter email id")
	public void enter_email_id() {

		String email = ConfigLoader.get("User_email");
		utils.sendKeys(loginPage.Enter_Email, email);
	}

	@Then("Click on next")
	public void click_on_next() throws InterruptedException {
		utils.click(loginPage.click_next);
		Thread.sleep(1000);
	}

	@Then("Enter password")
	public void enter_password() throws InterruptedException {
		Thread.sleep(1000);
		String pass = ConfigLoader.get("User_pass");
		utils.sendKeys(loginPage.Passwd, pass);
	}

	@Then("click on continue btn")
	public void click_on_continue_btn() {

		utils.click(loginPage.Passwd_next);

	}

	@Then("user add delivery address section on DA page and click on proceed to Pay button")
	public void user_add_delivery_address_section_on_DA_page_and_click_on_proceed_to_Pay_button()
			throws InterruptedException {

		String expectedUrl = "https://www.fnp.com/checkout/delivery-address";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expectedUrl));
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals("URL assertion failed!", expectedUrl, actualUrl);

		List<WebElement> addNewAddressButton = DriverManager.getDriver()
				.findElements(By.xpath("//button[normalize-space()='+ Add New Address']"));

		if (!addNewAddressButton.isEmpty() && addNewAddressButton.get(0).isDisplayed()) {
			// If the button is visible, click Proceed to Payment directly
			WebElement proceedToPaymentBtn = DriverManager.getDriver()
					.findElement(By.xpath("//button[@id='proceed-to-pay-btn']//span[@class='MuiButton-label']"));
			proceedToPaymentBtn.click();
		} else {
			// Perform the steps to enter address details

			String recipient_Number = ConfigLoader.get("User_Number");
			utils.sendKeys(DA_Page.Enter_Recipient_Number, recipient_Number);

			String recipient_Flat = ConfigLoader.get("Reciever_address");
			utils.sendKeys(DA_Page.Enter_Reciever_flatNO, recipient_Flat);

			String recipient_Street = ConfigLoader.get("Reciever_Street");
			Thread.sleep(2000);
			utils.sendKeys(DA_Page.Enter_Street_Area, recipient_Street);

			utils.click(DA_Page.Click_save_and_deliver);
		}
	}

	@Then("User select paypal payment option and click on paypal checkout")
	public void user_select_paypal_payment_option_and_click_on_paypal_checkout() throws InterruptedException {
		utils.scrollToBottomOfPage(driver);
		Thread.sleep(2000);
		utils.click(paymentPage.SelectPayPal);
		//Thread.sleep(2000);
		utils.switchToTargetIframe(driver);
		
		//Thread.sleep(2000);
		utils.click(paymentPage.ClickPayPalCheckout);
		driver.switchTo().defaultContent();
		
	}

	@Then("cancel the payment")
	public void cancel_the_payment() throws InterruptedException {
		utils.closePaypalIframe(driver);

	}

	@Then("verify user land on PNC page")
	public void verify_user_land_on_pnc_page() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		// Wait until the element is visible
//		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		    By.xpath("//div[contains(text(), 'Payment Not Confirmed')]")));
//
//		// Assert the text
//		Assert.assertEquals(message.getText(), "Payment Not Confirmed. Order", "Text does not match");
	}

}
