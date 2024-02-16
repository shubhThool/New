package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PLP_Page {
	public PLP_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "fnpsearch")
	private WebElement PlpSearchBar;
	@FindBy(id = "searchbtn")
	private WebElement PLP_pageClickOnSearch;
	
	@FindBy(xpath="//ul[@id='searchProductListing']/li[3]/a")
	private WebElement ClickOnPlantProduct;
	
	@FindBy(xpath="//ul[@id='searchProductListing']/li/a")
	private WebElement SelectFlowerFromPLP;
	

	public WebElement getPlpSearchBar() {
		return PlpSearchBar;
	}

	public WebElement getPLP_pageClickOnSearch() {
		return PLP_pageClickOnSearch;
	}

	public WebElement getClickOnPlantProduct() throws InterruptedException {
		Thread.sleep(2000);
		return ClickOnPlantProduct;
	}
	public WebElement getSelectFlowerFromPLP() {
		return SelectFlowerFromPLP;
}
}