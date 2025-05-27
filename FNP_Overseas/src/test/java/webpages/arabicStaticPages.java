package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class arabicStaticPages {
	public arabicStaticPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@id='morelinks']/li/a")
	private WebElement clickOnAboutUs;

	// ul[@id='morelinks']/li[5]/a
	@FindBy(xpath = "//ul[@id='morelinks']/li[5]/a")
	private WebElement clickOnContactUs;

	public WebElement getClickOnAboutUs() {
		return clickOnAboutUs;
	}

	public WebElement getClickOnContactUs() {
		return clickOnContactUs;
	}
}
