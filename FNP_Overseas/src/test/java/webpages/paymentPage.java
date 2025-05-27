package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentPage {
	public paymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[normalize-space()='Cash On Delivery']")
	private WebElement SelectCODPaymentOptn;

	@FindBy(xpath = "//div[@class='payment-options']/div[3]/div[5]/div")
	private WebElement ClickOnPayPal;

	@FindBy(xpath = "//div[@class='relative amex-ezeclick-pay-btn']/button")
	private WebElement ClickOnBuy;

	// p[normalize-space()='Tamara: Split in 3, interest free']

	@FindBy(xpath = "//div[@class='payment-options']/div[3]/div[4]/div")
	private WebElement ClickOnTamara;

	@FindBy(xpath = "//div[@id='paypalPay']/div")
	private WebElement ClickOnPayPalCheckout;

	@FindBy(xpath = "//div[@class='payment-options']/div[3]/div[1]/div")
	private WebElement SelectCreditCardPayOPTn;

	// input[@id='card-number--cc']
	@FindBy(xpath = "//input[@name='cardnumber']")
	private WebElement EnterCreditCardNumber;

	@FindBy(xpath = "//div[@class='card-form--wrapper ']/div/div[2]//input")
	private WebElement EnterCreditCardName;

	@FindBy(xpath = "//input[@id='checkout-frames-expiry-date']")
	private WebElement EnterMonthAndYear;

	@FindBy(xpath = "//input[@id='checkout-frames-cvv']")
	private WebElement EnterCVV;

	@FindBy(xpath = "//button[@id='pay-button']")
	private WebElement clickOnPay;

	@FindBy(xpath = "//div[@class='columns proddetail giftaddons cartinfo']")
	private WebElement ElementVisible;

	@FindBy(xpath = "//div[@id='paypal-overlay-uid_b4a4ffa9a2_mta6mzy6mda']/a")
	private WebElement closePayPalPopupWindow;

	public WebElement getSelectCODPaymentOptn() {
		return SelectCODPaymentOptn;
	}

	public WebElement getClickOnBuy() {
		return ClickOnBuy;
	}

	public WebElement getClickOnPayPal() {
		return ClickOnPayPal;
	}

	public WebElement getClickOnPayPalCheckout() {
		return ClickOnPayPalCheckout;
	}

	public WebElement getClickOnTamara() {
		return ClickOnTamara;
	}

	public WebElement getEnterCreditCardNumber() {
		return EnterCreditCardNumber;
	}

	public WebElement getEnterCreditCardName() {
		return EnterCreditCardName;
	}

//	public WebElement getClickOnmonth() {
//		return clickOnmonth;
//	}
//
//
//	public WebElement getSelectMonth() {
//		return SelectMonth;
//	}
//
//
//	public WebElement getClickOnYear() {
//		return ClickOnYear;
//	}
//
//
//	public WebElement getSelectYear() {
//		return SelectYear;
//	}

	public WebElement getEnterCVV() {
		return EnterCVV;
	}

	public WebElement getClickOnPay() {
		return clickOnPay;
	}

	public WebElement getElementVisible() {
		return ElementVisible;
	}

	public WebElement getClosePayPalPopupWindow() {
		return closePayPalPopupWindow;
	}

	public WebElement getSelectCreditCardPayOPTn() {
		return SelectCreditCardPayOPTn;
	}

	public WebElement getEnterMonthAndYear() {
		return EnterMonthAndYear;
	}

}
