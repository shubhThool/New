package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeStaticPages {
	public homeStaticPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "accountbtn")
	private WebElement AccountIcon;

	@FindBy(id = "login-link")
	private WebElement LoginButton;

	@FindBy(xpath = "//footer[@data-ga-category='Footer']/div/div/div[2]/div/div/ul/li/a")
	private WebElement ClickOnAboutUs;

	@FindBy(xpath = "//footer[@data-ga-category='Footer']/div/div/div[2]/div/div/ul/li[2]/a")
	private WebElement ClickOnContactUs;

	@FindBy(id = "help")
	private WebElement ClickOnHelp;

	public WebElement getAccountIcon() {

		return AccountIcon;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getClickOnAboutUs() {
		return ClickOnAboutUs;
	}

	public WebElement getClickOnContactUs() {
		return ClickOnContactUs;
	}

	public WebElement getClickOnHelp() {
		return ClickOnHelp;
	}

}
