package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class arabicSocialLogin {
		public  arabicSocialLogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@name='Passwd']")
		private WebElement EnterPass;
		public WebElement getEnterPass() {
			return EnterPass;
		}
	}


