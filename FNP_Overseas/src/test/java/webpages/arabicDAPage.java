package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class arabicDAPage {
	public arabicDAPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='proceed-to-checkout']/span/span")
	private WebElement ClickOnProceedToPayment;

	@FindBy(xpath = "//div[@class='gift-items-sec']/div/div[3]/div/div")
	private WebElement ClickOnFreeMsgCard;

	public WebElement getClickOnProceedToPayment() {
		return ClickOnProceedToPayment;
	}

	public WebElement getClickOnFreeMsgCard() {
		return ClickOnFreeMsgCard;
	}
}
