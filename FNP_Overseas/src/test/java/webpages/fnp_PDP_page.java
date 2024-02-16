package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fnp_PDP_page {
	public  fnp_PDP_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='destlookup']")
	private WebElement ClickOnWhereTo;
	@FindBy(id="dubai_locality")
	
	private WebElement selectCity;
	@FindBy(id="datetimelink")
	
	private WebElement ClickSelectDeliveryDate;
	@FindBy(xpath="//div[@class='slider-item slick-slide slick-current slick-active']/div[2]/div/table/tbody/tr[4]/td[5]")
	private WebElement SelectDate;
	
	@FindBy(xpath="//label[@for='EXPRESS_DELIVERY']")
	private WebElement ClickOnShippingMethod;
	
	@FindBy(xpath="//button[@class='call2axn addonsbmt']")
	private WebElement ClickOnAddOns;
	
	@FindBy(xpath="//div[@id='modalshiping']/div[2]//ul//ul/li/a/label")
	private WebElement ClickOnTimeSlot;
	
	@FindBy(id="buynow")
	private WebElement clickOnBuy;
	
	@FindBy(id="addToCart")
	private WebElement addtoCart;
	
	@FindBy(id="fnpsearch")
	private WebElement PDP_PageSearchBar;
	@FindBy(id="searchbtn")
	private WebElement PDP_PageClickOnSearch;
	
	
	
	public WebElement getClickOnWhereTo() {
		return ClickOnWhereTo;
	}
	public WebElement getSelectCity() {
		return selectCity;
	}
	public WebElement getClickOnBuy() {
		return clickOnBuy;
	}
	public WebElement getClickSelectDeliveryDate() throws InterruptedException {
		Thread.sleep(1000);
		return ClickSelectDeliveryDate;
	}
	public WebElement getSelectDate() {
		return SelectDate;
	}
	public WebElement getClickOnShippingMethod() {
		return ClickOnShippingMethod;
	}
	public WebElement getClickOnTimeSlot() {
		return ClickOnTimeSlot;
	}
	public WebElement getClickOnAddOns() throws InterruptedException {
		Thread.sleep(2000);
		return ClickOnAddOns;
	}
	public WebElement getAddtoCart() {
		return addtoCart;
	}
	public WebElement getPDP_PageSearchBar() {
		return PDP_PageSearchBar;
	}
	public WebElement getPDP_PageClickOnSearch() {
		return PDP_PageClickOnSearch;
	}
	

}
