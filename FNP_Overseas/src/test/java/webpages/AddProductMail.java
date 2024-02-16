package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductMail {
	public  AddProductMail(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="identifierId")
	private WebElement AddEmail;

	@FindBy(xpath="//div[@class='dqyqtf']/div/div")
	private WebElement CLickNext;
	@FindBy(xpath="//input[@name='Passwd']")
	private WebElement AddPass;
	@FindBy(xpath="//div[@class='dqyqtf']/div/div")
	private WebElement ClickPassNext;
	public WebElement getAddEmail() {
		return AddEmail;
	}
	public WebElement getCLickNext() {
		return CLickNext;
	}
	public WebElement getAddPass() throws InterruptedException {
		Thread.sleep(2000);
		return AddPass;
	}
	public WebElement getClickPassNext() {
		return ClickPassNext;
	}

}
