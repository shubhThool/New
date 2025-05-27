package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fnp {
	public fnp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='accountbtn']")
	private WebElement clickonAcc;
	@FindBy(xpath = "//span[@id='login-link']/a")
	private WebElement ClickOnLogin;

	public WebElement getClickonAcc() {
		return clickonAcc;
	}

	public WebElement getClickOnLogin() {
		return ClickOnLogin;
	}

	public void setClickOnLogin(WebElement clickOnLogin) {
		ClickOnLogin = clickOnLogin;
	}

}
