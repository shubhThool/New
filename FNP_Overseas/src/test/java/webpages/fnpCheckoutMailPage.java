package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fnpCheckoutMailPage {
	public fnpCheckoutMailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='google-login']")
	private WebElement googleIconClick;
	@FindBy(id = "loginformEmailId")
	private WebElement EnterEmail;
	@FindBy(xpath = "//span[@class='content background-color-ff9212  ']")
	private WebElement ContinueClick;
	@FindBy(id = "loginPassword")
	private WebElement EnterPassWord;
	@FindBy(xpath = "//span[@class='jss132']/span")
	private WebElement PassContinueCLick;
	public WebElement getCLickNext;

	public WebElement getEnterEmail() {
		return EnterEmail;

	}

	public WebElement getContinueClick() {
		return ContinueClick;
	}

	public WebElement getEnterPassWord() {
		return EnterPassWord;
	}

	public WebElement getPassContinueCLick() {
		return PassContinueCLick;
	}

	public WebElement getGoogleIconClick() {
		return googleIconClick;
	}
}
