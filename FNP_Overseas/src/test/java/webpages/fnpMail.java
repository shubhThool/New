package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fnpMail {
	public fnpMail(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='whsOnd zHQkBf']")
	private WebElement EnterEmail;

	@FindBy(xpath = "//div[@class='Z6Ep7d']/div/div/div")
	private WebElement ClickOnNext;

	@FindBy(xpath = "//input[@class='whsOnd zHQkBf']")
	private WebElement EnterPass;

	@FindBy(xpath = "//div[@class='dqyqtf']/div/div")
	private WebElement Next;

	public WebElement getEnterEmail() throws InterruptedException {
		Thread.sleep(1000);

		return EnterEmail;
	}

	public WebElement getClickOnNext() throws InterruptedException {
		Thread.sleep(1000);
		return ClickOnNext;
	}

	public WebElement getEnterPass() throws InterruptedException {
		Thread.sleep(2000);
		return EnterPass;
	}

	public WebElement getNext() {
		return Next;
	}

}
