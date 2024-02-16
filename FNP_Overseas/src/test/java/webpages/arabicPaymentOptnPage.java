package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class arabicPaymentOptnPage {
	public  arabicPaymentOptnPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='payment-process']/div[3]/div/div[6]/div")
	private WebElement ClickOnCODPayOptn;
	public WebElement getClickOnCODPayOptn() {
		return ClickOnCODPayOptn;
	}
}
