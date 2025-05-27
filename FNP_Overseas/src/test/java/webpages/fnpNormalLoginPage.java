package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fnpNormalLoginPage {
	public fnpNormalLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//form[@class='google-form ng-pristine ng-valid']")
	private WebElement clickOnGoogleIcon;

	@FindBy(id = "email-input")
	private WebElement EnterMail;

	@FindBy(xpath = "//button[@id='continue']/span")
	private WebElement ClickOnContinue;

	@FindBy(id = "password-input")
	private WebElement EnterPPassWord;
	@FindBy(xpath = "//*[@id=\"continue\"]/span[1]")
	private WebElement ClickpassContinue;

	@FindBy(xpath = "//input[@id=\"name-input\"]")
	private WebElement EnterNormalFlowNameForNewUser;

	@FindBy(xpath = "//input[@id=\"mobile-input\"]")
	private WebElement EnterNormalFlowMobileNoForNewUser;

	@FindBy(xpath = "//input[@id=\"createpassword-input\"]")
	private WebElement EnterNormalFlowNewUserPassword;

	public WebElement getClickOnGoogleIcon() {
		return clickOnGoogleIcon;
	}

	public WebElement getEnterMail() {

		return EnterMail;

	}

	public WebElement getClickOnContinue() throws InterruptedException {
		Thread.sleep(2000);
		return ClickOnContinue;
	}

	public WebElement getEnterPPassWord() throws InterruptedException {
		Thread.sleep(2000);
		return EnterPPassWord;
	}

	public WebElement getClickpassContinue() {

		return ClickpassContinue;
	}

	public WebElement getEnterNormalFlowNameForNewUser() {
		return EnterNormalFlowNameForNewUser;
	}

	public WebElement getEnterNormalFlowMobileNoForNewUser() {
		return EnterNormalFlowMobileNoForNewUser;
	}

	public WebElement getEnterNormalFlowNewUserPassword() {
		return EnterNormalFlowNewUserPassword;
	}
}