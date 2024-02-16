package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutNormalLogin {
	public checkoutNormalLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='loginformEmailId']")
	private WebElement EnterCheckoutEmail;

	@FindBy(xpath="//span[contains(text(),'CONTINUE')]")
	private WebElement ClickOnContinue;
	
	@FindBy(xpath="//input[@id='loginPassword']")
	private WebElement EnterPassword;
	
	@FindBy(xpath="//input[@id='reg_name']")
	private WebElement EnterNameForNewUser;
	
	@FindBy(xpath="//input[@id='reg_mobile']")
	private WebElement EnterMobileNoForNewUser;
	
	@FindBy(xpath="//input[@id='regPassword']")
	private WebElement EnterNewUserPassword;
	
	@FindBy(xpath="//button[@id='submit-check']/span/span")
	private WebElement ClickOnNewUserContinue;
	
	public WebElement getEnterCheckoutEmail() {
		return EnterCheckoutEmail;
		
	}

	public WebElement getClickOnContinue() throws InterruptedException {
		Thread.sleep(2000);
		return ClickOnContinue;
	}

	public WebElement getEnterPassword()  {
	
		return EnterPassword;
	}

	public WebElement getEnterNameForNewUser() {
		return EnterNameForNewUser;
	}

	public WebElement getEnterMobileNoForNewUser() {
		return EnterMobileNoForNewUser;
	}

	public WebElement getEnterNewUserPassword() {
		return EnterNewUserPassword;
	}

	public WebElement getClickOnNewUserContinue() {
		return ClickOnNewUserContinue;
	}

}
