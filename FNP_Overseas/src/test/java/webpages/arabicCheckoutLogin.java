package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class arabicCheckoutLogin {
	public arabicCheckoutLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='submit-check']/span/span")
	private WebElement ClickOnArContinue;

	public WebElement getClickOnArContinue() {
		return ClickOnArContinue;
	}
}
