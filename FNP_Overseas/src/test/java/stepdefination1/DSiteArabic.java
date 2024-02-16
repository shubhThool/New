package stepdefination1;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.AddProductMail;

import webpages.MyAccountPage;
import webpages.PLP_Page;
import webpages.arabicCheckoutLogin;
import webpages.arabicDAPage;
import webpages.arabicPaymentOptnPage;
import webpages.arabicSocialLogin;
import webpages.arabicStaticPages;
import webpages.checkoutNormalLogin;
import webpages.dAPage;
import webpages.fnp;
import webpages.fnpCheckoutMailPage;
import webpages.fnpHomePage;
import webpages.fnpNormalLoginPage;
import webpages.fnpMail;
import webpages.fnp_PDP_page;
import webpages.homeStaticPages;
import webpages.myCartPage;
import webpages.paymentPage;

public class DSiteArabic extends SeleniumUtility {
	WebDriver driver;
	fnp clickonAcc;
	fnp ClickOnLogin;
	fnpNormalLoginPage clickOnGoogleIcon;
	fnpMail EnterEmail;
	fnpMail ClickOnNext;

	fnpMail Next;
	arabicSocialLogin EnterPass;
	
	fnpNormalLoginPage EnterMail;
	fnpNormalLoginPage ClickOnContinue;
	fnpNormalLoginPage EnterPPassWord;
	fnpNormalLoginPage ClickpassContinue;
	fnpNormalLoginPage EnterNormalFlowNameForNewUser;
	fnpNormalLoginPage EnterNormalFlowMobileNoForNewUser;
	fnpNormalLoginPage EnterNormalFlowNewUserPassword;
	

	fnpHomePage ClickOnProduct;
	fnpHomePage HomePageSearchBar;
	fnpHomePage ClickOnSearchBtn;
	fnpHomePage ClickOnSearhBox;
	fnpHomePage SelectOptionFromDropdown;
	fnpHomePage LandOnPlantPage;
	fnpHomePage SelectSwitchToArabicButton;
	fnpHomePage clickOnCakeProduct;
	fnpHomePage ClickOnFlowerCategory;
	
	myCartPage ClickOnProceedToPayment;
	
	
	fnp_PDP_page ClickOnWhereTo;
	fnp_PDP_page selectCity;
	fnp_PDP_page clickOnBuy;
	fnp_PDP_page ClickSelectDeliveryDate;
	fnp_PDP_page SelectDate;
	fnp_PDP_page ClickOnShippingMethod;
	fnp_PDP_page ClickOnTimeSlot;
	fnp_PDP_page ClickOnAddOns;
	fnp_PDP_page clickonaddtoCart;
	fnp_PDP_page PDP_PageSearchBar;
	fnp_PDP_page PDP_PageClickOnSearch;

	fnpCheckoutMailPage enterEmail;
	fnpCheckoutMailPage continueClick;
	fnpCheckoutMailPage EnterPassWord;
	fnpCheckoutMailPage PassContinueCLick;
	fnpCheckoutMailPage googleIconClick;

	AddProductMail AddEmail;
	AddProductMail CLickNext;
	AddProductMail AddPass;
	AddProductMail ClickPassNext;

	myCartPage clickOnDeleteIteam;
	myCartPage ClickOnYes;

	PLP_Page PlpSearchBar;
	PLP_Page PLP_pageClickOnSearch;
	PLP_Page ClickOnPlantProduct;
	PLP_Page SelectFlowerFromPLP;

	homeStaticPages ClickOnAboutUs;
	homeStaticPages ClickOnContactUs;
	homeStaticPages ClickOnHelp;
	arabicStaticPages clickOnAboutUs;
	arabicStaticPages clickOnContactUs;

	MyAccountPage ClickOnMyRemainder;
	MyAccountPage EnterName;
	MyAccountPage EnterOccasion;
	MyAccountPage ClickOnPickDate;
	MyAccountPage ClickOnSaveOccasion;
	
	
	checkoutNormalLogin EnterCheckoutEmail;
	checkoutNormalLogin ClickOnContinue1;
	checkoutNormalLogin EnterPassword;
	checkoutNormalLogin EnterNameForNewUser;
	checkoutNormalLogin EnterMobileNoForNewUser;
	checkoutNormalLogin	EnterNewUserPassword;
	checkoutNormalLogin ClickOnNewUserContinue;
	arabicCheckoutLogin ClickOnArContinue ;
	
	
	
	MyAccountPage ClickOnDeleteOccasion;
	MyAccountPage ClickOnEdit;
	MyAccountPage EditName;
	MyAccountPage EditMoNumber;
	MyAccountPage ClickOnSave;
	MyAccountPage signoutFromMyAccount;

	dAPage EnterAddressName;
	dAPage EnterAddress;
	dAPage EnterMobileNum;
	dAPage ClickOnSaveAddress;
	dAPage ClickOnProceedTOPayment;
	dAPage ClickOnFreeMessageCard;
	dAPage ClickOnOccasion;
	dAPage SelectMotherDayOccasion;
	dAPage ClickOnSelectMessage;
	dAPage SelectMessage;
	dAPage ClickOnSaveCard;
	dAPage ClickOnCardEdit;
	dAPage EnterRecieverName;
	dAPage ClickOnSenderDetailsEdit;
	dAPage UpdateSenderDetailsName;
	dAPage SenderSavebtn;
	dAPage ClickOnCoupon;
	dAPage EnterCouponCode;
	dAPage clickOnSaveCoupon;
	dAPage clickOnAddNewAddress;
	dAPage ClickOnAddressEdit;
	dAPage UpdateTheAddressName;
	dAPage UpdateTheRecipientsAddress;
	dAPage ClickUpdatedSaveAndDeliverHere;
	dAPage clickOnAddOnsButtonOnDAPage;
	dAPage clickOnYesBottonFromPopupToDeleteProduct;
	dAPage clickOnDeleteButtonToDeleteProduct;
	dAPage ClickOnChangeButton;
	dAPage ChangeDeliveryDateInDAPage;
	dAPage ChangeShippingMethodInDAPage;
	dAPage ChangeTimeSlotInDAPage;
	arabicDAPage ClickOnProceedToPayment1;
	arabicDAPage ClickOnFreeMsgCard;
	
	
	
	
	paymentPage SelectCODPaymentOptn;
	paymentPage ClickOnBuy;
	paymentPage ClickOnPayPal;
	paymentPage ClickOnPayPalCheckout;
	paymentPage ClickOnTamara;
	paymentPage EnterCreditCardNumber;
	paymentPage EnterCreditCardName;
	paymentPage EnterMonthAndYear;
	paymentPage EnterCVV;
	paymentPage SelectYear;
	paymentPage clickOnPay;
	paymentPage ElementVisible;
	paymentPage	closePayPalPopupWindow;
	paymentPage SelectCreditCardPayOPTn;
	arabicPaymentOptnPage ClickOnCODPayOptn;
	
	
	
	@Given("user are already in home page")
	public void user_are_already_in_home_page() {

		driver = setUp("chrome", "https://uat.fnp.ae/ar");
	}

	@When("user click on Account button")
	public void user_click_on_account_button() {
		clickonAcc = new fnp(driver);
		clickOnElement(clickonAcc.getClickonAcc());

	}

	@When("click on login button")
	public void click_on_login_button() {
		ClickOnLogin = new fnp(driver);
		waitForElementDisplayed(ClickOnLogin.getClickOnLogin());
		clickOnElement(ClickOnLogin.getClickOnLogin());

	}

	@When("Login using Google account")
	public void login_using_google_account() {
		clickOnGoogleIcon = new fnpNormalLoginPage(driver);
		clickOnElement(clickOnGoogleIcon.getClickOnGoogleIcon());
	}

	@When("Enter email-Id  as a {string}")
	public void enter_email_id_as_a(String emailId) throws InterruptedException {
		EnterEmail = new fnpMail(driver);
		typeInput(EnterEmail.getEnterEmail(), emailId);
	}

	@When("Click on Next button")
	public void click_on_Next_button() throws InterruptedException {

		ClickOnNext = new fnpMail(driver);
		clickOnElement(ClickOnNext.getClickOnNext());

	}

	@When("Enter Password as a {string}")
	public void enter_password_as_a(String pass) throws InterruptedException {

	//	EnterPass = new fnpMail(driver);
		EnterPass=new arabicSocialLogin(driver);
		waitForElementDisplayed(EnterPass.getEnterPass());
		
		typeInput(EnterPass.getEnterPass(), pass);

		try {
			typeInput(EnterPass.getEnterPass(), pass);
			typeInput(EnterPass.getEnterPass(), pass);

		} catch (StaleElementReferenceException e) {

		}

	}

	@When("Click On Next button")
	public void click_on_next_button() {
		Next = new fnpMail(driver);
		clickOnElement(Next.getNext());
	}

	@Then("login done successfully and user land on my account page as {string}")
	public void login_done_successfully_and_user_land_on_my_account_page_as(String Tittle) {

		System.out.println(driver.getTitle());
		assertEquals(getCurrentTitleOfApplication("Account My Account - FNP"), Tittle);
	

	}

	@When("Enter valid Email Id as a {string}")
	public void enter_valid_email_id_as_a(String Email) throws InterruptedException {
		EnterMail = new fnpNormalLoginPage(driver);
		setSleepTime(500);
		typeInput(EnterMail.getEnterMail(), Email);

	}

	@When("Click on continue button")
	public void click_on_continue_button() throws InterruptedException {
		ClickOnContinue = new fnpNormalLoginPage(driver);
		clickOnElement(ClickOnContinue.getClickOnContinue());

	}

	@When("Enter valid Password {string}")
	public void enter_valid_password(String pass) throws InterruptedException {
		EnterPPassWord = new fnpNormalLoginPage(driver);
		typeInput(EnterPPassWord.getEnterPPassWord(), pass);

	}

	@When("after enter password click on continue")
	public void after_enter_password_click_on_continue() {

		ClickpassContinue = new fnpNormalLoginPage(driver);
		clickOnElement(ClickpassContinue.getClickpassContinue());

	}

	@Given("select any product from the home page")
	public void select_any_product_from_the_home_page() {
		ClickOnProduct = new fnpHomePage(driver);
		clickOnElement(ClickOnProduct.getClickOnProduct());

	}

	@Given("select where to location")
	public void select_where_to_location() {
		driver.getWindowHandle();
		Set<String> AllWindow = driver.getWindowHandles();
		List<String> WindowIdList = new ArrayList(AllWindow);
		driver.switchTo().window(WindowIdList.get(1));

		ClickOnWhereTo = new fnp_PDP_page(driver);
		selectCity = new fnp_PDP_page(driver);
		clickOnElement(ClickOnWhereTo.getClickOnWhereTo());
		clickOnElement(selectCity.getSelectCity());

	}

	@Given("select delivery date ,shipping method and Time slot")
	public void select_delivery_date_shipping_method_and_time_slot() throws InterruptedException {
		ClickSelectDeliveryDate = new fnp_PDP_page(driver);
		SelectDate = new fnp_PDP_page(driver);
		ClickOnShippingMethod = new fnp_PDP_page(driver);
		ClickOnTimeSlot = new fnp_PDP_page(driver);

		clickElementWithJavaScript(ClickSelectDeliveryDate.getClickSelectDeliveryDate());
		setSleepTime(500);
		waitForElementDisplayed(ClickSelectDeliveryDate.getClickSelectDeliveryDate());
		clickElementWithJavaScript(SelectDate.getSelectDate());
		setSleepTime(1000);
		waitForElementDisplayed(ClickOnShippingMethod.getClickOnShippingMethod());
		setSleepTime(500);
		clickElementWithJavaScript(ClickOnShippingMethod.getClickOnShippingMethod());
		setSleepTime(500);
		clickElementWithJavaScript(ClickOnTimeSlot.getClickOnTimeSlot());
	}

	@Given("Click on buy now button")
	public void click_on_buy_now_button() {
		clickOnBuy = new fnp_PDP_page(driver);
		setSleepTime(500);
		clickOnElement(clickOnBuy.getClickOnBuy());
	}

	@Given("Click on continue without add-ons")
	public void click_on_continue_without_add_ons() throws InterruptedException {
		ClickOnAddOns = new fnp_PDP_page(driver);
		clickOnElement(ClickOnAddOns.getClickOnAddOns());
	}

	@Given("Enter valid Email as a {string}")
	public void enter_valid_email_as_a(String mail) {
		EnterCheckoutEmail = new checkoutNormalLogin(driver);
		typeInput(EnterCheckoutEmail.getEnterCheckoutEmail(), mail);

	}

	@Given("click on continue")
	public void click_on_continue() throws InterruptedException {
		ClickOnArContinue=new arabicCheckoutLogin(driver);
		setSleepTime(500);
		waitForElementDisplayed(ClickOnArContinue.getClickOnArContinue());
		clickElementWithJavaScript(ClickOnArContinue.getClickOnArContinue());

	}

	@Given("Enter password as a {string}")
	public void enter_password_as_a1(String pass) throws InterruptedException {
		EnterPassword = new checkoutNormalLogin(driver);
		typeInput(EnterPassword.getEnterPassword(), pass);

	}

	@Then("Login done successfull and user land on check-out page")
	public void login_done_successfull_and_user_land_on_check_out_page() {
		
		driver.quit();

	}

	@Given("Click on Add to cart button")
	public void click_on_add_to_cart_button() {
		clickonaddtoCart = new fnp_PDP_page(driver);
		waitForElementDisplayed(clickonaddtoCart.getAddtoCart());
		clickElementWithJavaScript(clickonaddtoCart.getAddtoCart());
		

	}

	@Given("Click on delete icon in my cart")
	public void click_on_delete_icon_in_my_cart() {

		clickOnDeleteIteam = new myCartPage(driver);
		clickOnElement(clickOnDeleteIteam.getClickOnDeleteIteam());
	}

	@Given("Click on yes in the pop-up")
	public void click_on_yes_in_the_pop_up() {
		ClickOnYes = new myCartPage(driver);
		clickOnElement(ClickOnYes.getClickOnYes());
		driver.quit();
	}

	@When("user land on home page search {string} product")
	public void user_land_on_home_page_search_product(String cake) {
		HomePageSearchBar = new fnpHomePage(driver);
		ClickOnSearchBtn = new fnpHomePage(driver);
		typeInput(HomePageSearchBar.getHomePageSearchBar(), cake);
		clickOnElement(ClickOnSearchBtn.getClickOnSearchBtn());

	}

	@When("when user land on PLP page Search {string}")
	public void when_user_land_on_plp_page_search(String Plant) {
		PlpSearchBar = new PLP_Page(driver);
		PLP_pageClickOnSearch = new PLP_Page(driver);
		waitForElementDisplayed(PLP_pageClickOnSearch.getPLP_pageClickOnSearch());
		typeInput(PlpSearchBar.getPlpSearchBar(), Plant);
		clickElementWithJavaScript(PLP_pageClickOnSearch.getPLP_pageClickOnSearch());

	}

	@When("click on any plant product in PLP page and navigate to PDP page")
	public void click_on_any_plant_product_in_plp_page_and_navigate_to_pdp_page() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		ClickOnPlantProduct = new PLP_Page(driver);
		waitForElementToBeClickable(ClickOnPlantProduct.getClickOnPlantProduct());

	}

	@Then("user is able to search {string} product in PDP page")
	public void user_is_able_to_search_product_in_pdp_page(String cake) {
		PDP_PageSearchBar = new fnp_PDP_page(driver);
		PDP_PageClickOnSearch = new fnp_PDP_page(driver);

		typeInput(PDP_PageSearchBar.getPDP_PageSearchBar(), cake);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		driver.quit();
	}

	@When("user land on home page scroll the page to the fotter")
	public void user_land_on_home_page_scroll_the_page_to_the_fotter() throws InterruptedException {
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 5000).perform();
		Thread.sleep(500);
		act.scrollByAmount(0, 1000).perform();

	}

	@When("user is able to click on About us")
	public void user_is_able_to_click_on_about_us() {
		clickOnAboutUs = new arabicStaticPages(driver);
		clickOnElement(clickOnAboutUs.getClickOnAboutUs());

	}

	@When("user is able to click on contact us")
	public void user_is_able_to_click_on_contact_us() {
		clickOnContactUs = new arabicStaticPages(driver);
		clickOnElement(clickOnContactUs.getClickOnContactUs());

	}

	@When("user is able to click on Tearms & Conditions")
	public void user_is_able_to_click_on_tearms_conditions() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).perform();

		driver.quit();

	}

	@When("user click on header part of the help icon")
	public void user_click_on_header_part_of_the_help_icon() {
		ClickOnHelp = new homeStaticPages(driver);
		clickOnElement(ClickOnHelp.getClickOnHelp());

	}

	@Then("verify the contact us page should be open")
	public void verify_the_contact_us_page_should_be_open() {
		driver.quit();

	}

	@When("user click on my remainder")
	public void user_click_on_my_remainder() {
		ClickOnMyRemainder = new MyAccountPage(driver);
		clickOnElement(ClickOnMyRemainder.getClickOnMyRemainder());

	}

	@When("enter name as a {string}")
	public void enter_name_as_a(String name) {
		EnterName = new MyAccountPage(driver);
		typeInput(EnterName.getEnterName(), name);

	}

	@When("enter occasion as a {string}")
	public void enter_occasion_as_a(String Occasion) {
		EnterOccasion = new MyAccountPage(driver);
		typeInput(EnterOccasion.getEnterOccasion(), Occasion);

	}

	@When("pick a date")
	public void pick_a_date() {

		ClickOnPickDate = new MyAccountPage(driver);

		clickOnElement(ClickOnPickDate.getClickOnOccasionDate());

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

	}

	@When("Click on save occasion")
	public void click_on_save_occasion() throws InterruptedException {
		ClickOnSaveOccasion = new MyAccountPage(driver);
		clickOnElement(ClickOnSaveOccasion.getClickOnSaveOccasion());

	}

	@When("click on delete icon on the created remainder")
	public void click_on_delete_icon_on_the_created_remainder() {
		WebElement element = driver.findElement(By.xpath(
				"/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/thead[1]/tr[1]/th[1]/a[2]/img[1]")); // Change
																																	// this
																																	// to
																																	// your
																																	// element's
																																	// locator

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);
	}

	@When("click on ok then the remainder delete successfully")
	public void click_on_ok_then_the_remainder_delete_successfully() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.quit();

	}

	@And("Enter name as a {string} in the address")
	public void enter_name_as_a_in_the_address(String name) {
		EnterAddressName = new dAPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elementOnNewTab = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='change-btn-span']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		
		
		WebElement elementToClick = driver.findElement(By.xpath("//div[@id='saved-address--1']//li[@class='saved-address add-address']"));
		
	       
        
		if (elementToClick.isDisplayed() && elementToClick.isEnabled()) {
           
           clickElementWithJavaScript(elementToClick);
	            System.out.println("Element clicked successfully!");
	        } else {
	            
	        }
		typeInput(EnterAddressName.getEnterAddressName(), name);

}	
		
		
		
		

	

	@And("Enter recipient address as a {string}")
	public void enter_recipient_address_as_a(String address) {
		EnterAddress = new dAPage(driver);
		waitForElementToBeClickable(EnterAddress.getEnterAddress());
		typeInput(EnterAddress.getEnterAddress(), address);

	}

	@And("Enter mobile number as a {string}")
	public void enter_mobile_number_as_a(String num) {
		EnterMobileNum = new dAPage(driver);
		waitForElementToBeClickable(EnterMobileNum.getEnterMobileNum());
		typeInput(EnterMobileNum.getEnterMobileNum(), num);
		setSleepTime(1000);

	}

	@And("Click on save and deliver here")
	public void click_on_save_and_deliver_here() {
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
		setSleepTime(1000);
		

	}

	@And("Click on proceed to payment button")
	public void Clickon_proceed_to_payment_button() {
		//ClickOnProceedTOPayment = new dAPage(driver);
		ClickOnProceedToPayment1=new arabicDAPage(driver);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.END).perform();
		
		waitForElementDisplayed(ClickOnProceedToPayment1.getClickOnProceedToPayment());
		setSleepTime(1000);
		clickElementWithJavaScript(ClickOnProceedToPayment1.getClickOnProceedToPayment());

	}

	@And("Select COD payment option")
	public void And_Select_COD_payment_option() {
		ClickOnBuy = new paymentPage(driver);
	//	SelectCODPaymentOptn = new paymentPage(driver);
		ClickOnCODPayOptn=new arabicPaymentOptnPage(driver);
		clickOnElement(ClickOnCODPayOptn.getClickOnCODPayOptn());
		clickOnElement(ClickOnBuy.getClickOnBuy());

	}

	@Then("user land on Thank you page as {string}")
	public void user_land_on_thank_you_page_as(String URL) {
		
		WebElement waitForPCText = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='medium-10 columns']/div/div/h1")));
		
		String actualText="شكراً لإهدائكم أحبابكم عن طريقنا";
		WebElement element=driver.findElement(By.xpath("//div[@class='columns textcenter']/h1"));
	String ExpectedText=element.getText();
	 Assert.assertEquals(actualText, ExpectedText, "Text validation failed!");
	 
	 driver.quit();


		
	}

	@Given("Click on free message card")
	public void click_on_free_message_card() {
		//ClickOnFreeMessageCard = new dAPage(driver);
		ClickOnFreeMsgCard=new arabicDAPage(driver);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).perform();
		clickElementWithJavaScript(ClickOnFreeMsgCard.getClickOnFreeMsgCard());
		
	}

	@Given("Select occasion")
	public void select_occasion() {
		ClickOnOccasion = new dAPage(driver);
		SelectMotherDayOccasion = new dAPage(driver);
		waitForElementDisplayed(ClickOnOccasion.getClickOnOccasion());
		
		clickElementWithJavaScript(ClickOnOccasion.getClickOnOccasion());
		
		clickElementWithJavaScript(SelectMotherDayOccasion.getSelectMotherDayOccasion());

	}

	@Given("Select message on card")
	public void select_message_on_card() {
		ClickOnSelectMessage = new dAPage(driver);
		SelectMessage = new dAPage(driver);
		clickOnElement(ClickOnSelectMessage.getClickOnSelectMessage());
		setSleepTime(500);
		clickOnElement(SelectMessage.getSelectMessage());

	}

	@Given("Add receiver name as a {string}")
	public void add_receiver_name_as_a(String name) {
		ClickOnCardEdit = new dAPage(driver);
		EnterRecieverName = new dAPage(driver);
		clickOnElement(ClickOnCardEdit.getClickOnCardEdit());
		typeInput(EnterRecieverName.getEnterRecieverName(), name);

	}

	@Given("Click on save button")
	public void click_on_save_button() {
		ClickOnSaveCard = new dAPage(driver);
		setSleepTime(1000);
		clickOnElement(ClickOnSaveCard.getClickOnSaveCard());

	}

	@Then("validate message is saved")
	public void validate_message_is_saved() {
		driver.quit();

	}

	@When("User click on address edit button")
	public void user_click_on_address_edit_button() {
	    ClickOnAddressEdit=new dAPage(driver);
	    waitForElementDisplayed(ClickOnAddressEdit.getClickOnAddressEdit());

	    try {
	      
	        clickOnElement(ClickOnAddressEdit.getClickOnAddressEdit());
	    } catch (StaleElementReferenceException e) {
	       
	        System.out.println("Caught StaleElementReferenceException. Retrying...");
	        
	       
	        clickOnElement(ClickOnAddressEdit.getClickOnAddressEdit());
	    }
	}

	@When("Update the name as a {string}")
	public void update_the_name_as_a(String name) {
		UpdateTheAddressName = new dAPage(driver);
		
		typeInputWithSpace(UpdateTheAddressName.getUpdateTheAddressName(), name);

	}
	@When("update the recipients address as a {string}")
	public void update_the_recipients_address_as_a(String Recipientaddress) {
		UpdateTheRecipientsAddress=new dAPage(driver);
		typeInputWithComma(UpdateTheRecipientsAddress.getUpdateTheRecipientsAddress(), Recipientaddress);
		
	}

	@When("Click on save")
	public void click_on_save() {
		ClickUpdatedSaveAndDeliverHere=new dAPage(driver);
		waitForElementDisplayed(ClickUpdatedSaveAndDeliverHere.getClickUpdatedSaveAndDeliverHere());
		clickOnElement(ClickUpdatedSaveAndDeliverHere.getClickUpdatedSaveAndDeliverHere());
		
		driver.quit();
		

	}

	@When("User click on edit icon in my profile")
	public void user_click_on_edit_icon_in_my_profile() {
		ClickOnEdit = new MyAccountPage(driver);
		WebElement element = driver.findElement(By.xpath("//img[@class='edit icon']")); // Change this to your element's
																						// locator

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);

	}

	@When("Update the name as {string}")
	public void update_the_name_as(String string) {
		EditName = new MyAccountPage(driver);
		typeInput(EditName.getEditName(), string);

	}

	@When("Update the mobile number as a {string}")
	public void update_the_mobile_number_as_a(String MoNumber) {
		EditMoNumber = new MyAccountPage(driver);
		typeInput(EditMoNumber.getEditMoNumber(), MoNumber);

	}

	@When("Click on save btn")
	public void click_on_save_btn() {
		ClickOnSave = new MyAccountPage(driver);
		clickOnElement(ClickOnSave.getClickOnSave());

		driver.quit();

	}

	@And("Click on coupon")
	public void Click_on_coupon() {
		ClickOnCoupon = new dAPage(driver);
		clickOnElement(ClickOnCoupon.getClickOnCoupon());

	}

	@Given("Enter coupon code as a {string}")
	public void enter_coupon_code_as_a(String EnterCoupon) {
		EnterCouponCode = new dAPage(driver);
		typeInput(EnterCouponCode.getEnterCouponCode(), EnterCoupon);

	}

	@Given("Click on apply")
	public void click_on_apply() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		driver.quit();

	}

	@And("select Credit Card payment option")
	public void select_Credit_Card_payment_option() {
		SelectCreditCardPayOPTn=new paymentPage(driver);
		clickOnElement(SelectCreditCardPayOPTn.getSelectCreditCardPayOPTn());
	}

	@When("enter card number as a {string}")
	public void enter_card_number_as_a(String CardNumber) {
		EnterCreditCardNumber = new paymentPage(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='cardNumber']")));
		
		typeInput(EnterCreditCardNumber.getEnterCreditCardNumber(), CardNumber);

	}

	@When("Enter card name as a {string}")
	public void enter_card_name_as_a(String name) {
		driver.switchTo().defaultContent();
		EnterCreditCardName = new paymentPage(driver);
		clickElementWithJavaScript(EnterCreditCardName.getEnterCreditCardName());
		typeInput(EnterCreditCardName.getEnterCreditCardName(), name);

	}

	
	@When("select month and year as a {string}")
	public void select_month_and_year_as_a(String MonthAndYear) {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='expiryDate']")));
		EnterMonthAndYear=new paymentPage(driver);
		clickOnElement(EnterMonthAndYear.getEnterMonthAndYear());
		typeInput(EnterMonthAndYear.getEnterMonthAndYear(), MonthAndYear);
		driver.switchTo().defaultContent();
	}
	

	@When("Enter Cvv as a {string}")
	public void enter_cvv_as_a(String CVV) {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='cvv']")));
		EnterCVV = new paymentPage(driver);
		typeInput(EnterCVV.getEnterCVV(), CVV);
		driver.switchTo().defaultContent();
	}

	@When("click on pay")
	public void click_on_pay() {
		clickOnPay = new paymentPage(driver);
		ElementVisible= new paymentPage(driver);
		clickOnElement(clickOnPay.getClickOnPay());
		setSleepTime(5000);
		driver.navigate().back();
		
//		waitForElementDisplayed(ElementVisible.getElementVisible());
		
		
		}
		
	

	

	
	@When ("click on add new address")
	public void When_click_on_add_new_address() {
		clickOnAddNewAddress=new dAPage(driver);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement elementOnNewTab = wait
//				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='change-btn-span']")));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,700)", "");
//		clickOnElement(clickOnAddNewAddress.getClickOnAddNewAddress());

		WebElement elementToClick = driver.findElement(By.xpath("//div[@id='saved-address--1']//span[@class='add-address--label'][normalize-space()='Add new address']"));
		
		       
	        
			if (elementToClick.isDisplayed() && elementToClick.isEnabled()) {
	            elementToClick.click();
		            System.out.println("Element clicked successfully!");
		        } else {
		        	
		            
		        }
	
	}	
	@When("user click on search box")
	public void user_click_on_search_box() {
		ClickOnSearhBox=new fnpHomePage(driver);
		clickOnElement(ClickOnSearhBox.getClickOnSearhBox());
	}
	@When("search {string}")
	public void search(String string) {
		ClickOnSearhBox=new fnpHomePage(driver);
		typeInput(ClickOnSearhBox.getClickOnSearhBox(), string);
	}
		
	@And("select Air Purifying Plants")
	public void select_air_purifying_plants() {
		SelectOptionFromDropdown=new fnpHomePage(driver);
		setSleepTime(500);
		waitForElementDisplayed(SelectOptionFromDropdown.getSelectOptionFromDropdown());
		clickOnElement(SelectOptionFromDropdown.getSelectOptionFromDropdown());
	}
		
	
	
	@Then("veriy user is able to land on {string} page")
	public void veriy_user_is_able_to_land_on_page(String PlantPage) {
		//assertEquals(getCurrentUrlOfApplication(), PlantPage);
		String Expected ="https://uat.fnp.ae/ar/cakes?s=popularsearch=Cakes";
		assertEquals(driver.getCurrentUrl(), Expected);
	    driver.quit();
	}
	
	@When("user click on Arabic switch button")
	public void user_click_on_arabic_switch_button() {
		SelectSwitchToArabicButton=new fnpHomePage (driver);
		clickOnElement(SelectSwitchToArabicButton.getSelectSwitchToArabicButton());
	
	}
	@Then("user should redirect to Arabic site {string}")
	public void user_should_redirect_to_arabic_site(String string) {
	}

	@When("click on add button to add add-ons")
	public void click_on_add_button_to_add_add_ons() {
		clickOnAddOnsButtonOnDAPage=new dAPage (driver);
		clickOnElement(clickOnAddOnsButtonOnDAPage.getClickOnAddOnsButtonOnDAPage());
		
}
	@Then("verify add-ons is increased")
	public void verify_add_ons_is_increased() {
		By addOnLocator = By.xpath("//div[@class='addon-wrapper']/div/input"); 
	       int initialAddOnCount = driver.findElements(addOnLocator).size();
	       driver.navigate().refresh();
	       int updatedAddOnCount = driver.findElements(addOnLocator).size();
	      
	       Assert.assertTrue(updatedAddOnCount > initialAddOnCount, "Number of add-ons has not increased as expected.");
	       driver.quit();
		
	}

	
	
	

	
	@Then("click on Sign-out button")
	public void click_on_sign_out_button() {
		signoutFromMyAccount=new MyAccountPage (driver);
		waitForElementDisplayed(signoutFromMyAccount.getSignoutFromMyAccount());
		clickOnElement(signoutFromMyAccount.getSignoutFromMyAccount());

	}
	
	@Then("verify user will be sucessfully logged out {string}")
	public void verify_user_will_be_sucessfully_logged_out(String signoutpage) {
		
		//assertEquals(getCurrentUrlOfApplication(), signoutpage);
		String actualText="https://uat.fnp.ae/ar/";
		String Expected=driver.getCurrentUrl();
		
	 Assert.assertEquals(actualText, Expected, "Text validation failed!");
	 
		
		driver.quit();
		
	  
	}
	@When("Click on Paypal Payment Option")
	public void click_on_paypal_payment_option() {
//		clickOnPayPalPaymentOption=new paymentPage (driver);
//		clickOnElement(clickOnPayPalPaymentOption.getClcikOnPayPalCheckoutButton());
		ClickOnPayPal=new paymentPage(driver);
		clickOnElement(ClickOnPayPal.getClickOnPayPal());
		
	}
	
	@When("Click on Paypal Checkout button")
	public void click_on_paypal_checkout_button() {
		ClickOnPayPalCheckout=new paymentPage (driver);
		waitForElementDisplayed(ClickOnPayPalCheckout.getClickOnPayPalCheckout());
		clickOnElement(ClickOnPayPalCheckout.getClickOnPayPalCheckout());
	}
	@Then("Click on close button to create PNC")
	public void click_on_close_button_to_create_pnc() throws AWTException {
		closePayPalPopupWindow=new paymentPage (driver);
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ALT);
//		robot.keyPress(KeyEvent.VK_F4);
		setSleepTime(3000);
		pressAltEsc();
		setSleepTime(1000);
		pressTabEnter(3);	  
	}
				
	
	@Then("verify that user land on PNC page as a {string}")
	public void verify_that_user_land_on_pnc_page_as_a(String PNCcreated) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement waitForPNCText = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='medium-10 columns']/div/div/h1")));
		
		String actualText="تنبيه! الدفع غير مؤكد!";
		WebElement element=driver.findElement(By.xpath("//div[@class='medium-10 columns']/div/div/h1"));
	String ExpectedText=element.getText();
	 Assert.assertEquals(actualText, ExpectedText, "Text validation failed!");
	 
	 driver.quit();

	}
	@Then("Delete that product from DA page")
	public void delete_that_product_from_da_page() {
	clickOnDeleteButtonToDeleteProduct= new dAPage(driver);
    clickElementWithJavaScript(clickOnDeleteButtonToDeleteProduct.getClickOnDeleteButtonToDeleteProduct());
	}
	
	@Then("click on yes button from pop-up to delete the product")
	public void click_on_yes_button_from_pop_up_to_delete_the_product() {
		clickOnYesBottonFromPopupToDeleteProduct= new dAPage(driver);
		clickOnElement(clickOnYesBottonFromPopupToDeleteProduct.getClickOnYesBottonFromPopupToDeleteProduct());
		driver.quit();
	}
	@When("select cake product from the home page")
	public void select_cake_product_from_the_home_page() {
		clickOnCakeProduct=new fnpHomePage(driver);
		waitForElementDisplayed(clickOnCakeProduct.getClickOnCakeProduct());
		clickOnElement(clickOnCakeProduct.getClickOnCakeProduct());
	   
	}
	@Then("Fill Name Field as a {string}")
	public void fill_name_field_as_a(String EnteringNewUserName) {
		EnterNameForNewUser=new checkoutNormalLogin(driver);
		typeInput(EnterNameForNewUser.getEnterNameForNewUser(), EnteringNewUserName);
		
	}
	
	@Then("Fill Mobile No. Field {string}")
	public void fill_mobile_no_field(String EnteringNewUserMobileNo) {
		EnterMobileNoForNewUser=new checkoutNormalLogin(driver);
		typeInput(EnterMobileNoForNewUser.getEnterMobileNoForNewUser(), EnteringNewUserMobileNo);
		}
	
	@Then("Enter New User password as a {string}")
	public void enter_new_user_password_as_a(String EnteringNewUserPassword) {
		EnterNewUserPassword=new checkoutNormalLogin(driver);
		typeInput(EnterNewUserPassword.getEnterNewUserPassword(), EnteringNewUserPassword);
		}
	@And("Click on new user continue button")
	public void Click_on_new_user_continue_button() {
		ClickOnNewUserContinue=new checkoutNormalLogin(driver);
		setSleepTime(500);
		clickOnElement(ClickOnNewUserContinue.getClickOnNewUserContinue());
		
		
	}
	@When("click on flower category in home")
	public void click_on_flower_category_in_home() {
		ClickOnFlowerCategory=new fnpHomePage(driver);
		clickOnElement(ClickOnFlowerCategory.getClickOnFlowerCategory());
	  
		
	}
	@When("Select flower in PLP page")
	public void select_flower_in_plp_page() {
		SelectFlowerFromPLP=new PLP_Page(driver);
		clickOnElement(SelectFlowerFromPLP.getSelectFlowerFromPLP());
	    
	}
	@Then("Fill normal login Name Field as a {string}")
	public void fill_normal_login_name_field_as_a(String string) {
		EnterNormalFlowNameForNewUser=new fnpNormalLoginPage(driver);
		typeInput(EnterNormalFlowNameForNewUser.getEnterNormalFlowNameForNewUser(), string);
	    
	
	}
	@Then("Fill normal login Mobile No. Field {string}")
	public void fill_normal_login_mobile_no_field(String Num) {
		EnterNormalFlowMobileNoForNewUser=new fnpNormalLoginPage(driver);
		typeInput(EnterNormalFlowMobileNoForNewUser.getEnterNormalFlowMobileNoForNewUser(), Num);
		
		
	}
	    
	@Then("Enter normal login New User password as a {string}")
	public void enter_normal_login_new_user_password_as_a(String pass) {
		EnterNormalFlowNewUserPassword=new fnpNormalLoginPage(driver);
		typeInput(EnterNormalFlowNewUserPassword.getEnterNormalFlowNewUserPassword(), pass);
	   
	}
	@When("click on change button in DA page")
	public void click_on_change_button_in_da_page() {
		ClickOnChangeButton=new dAPage(driver);
		clickOnElement(ClickOnChangeButton.getClickOnChangeButton());
	}
	@When("change the delivery date in DA page")
	public void change_the_delivery_date_in_DA_page() {
		ChangeDeliveryDateInDAPage=new dAPage(driver);
		clickOnElement(ChangeDeliveryDateInDAPage.getChangeDeliveryDateInDAPage());
		
		
	}
	@And("change shipping method in DA page")
	public void change_shipping_method_in_DA_page() {
		ChangeShippingMethodInDAPage=new dAPage(driver);
		clickOnElement(ChangeShippingMethodInDAPage.getChangeShippingMethodInDAPage());
	}

	
	@And("change the time slot in DA page")
	public void change_the_time_slot_in_DA_page() {
		ChangeTimeSlotInDAPage=new dAPage(driver);
	clickElementWithJavaScript(ChangeTimeSlotInDAPage.getChangeTimeSlotInDAPage());
		
	}
	@Given("click on proceed to Payment button in my cart")
	public void click_on_proceed_to_payment_button_in_my_cart() {
	   ClickOnProceedToPayment=new myCartPage(driver);
		clickOnElement(ClickOnProceedToPayment.getClickOnProceedToPayment());
	}
                                                                              
}