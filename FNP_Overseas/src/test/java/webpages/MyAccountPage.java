package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='medium-4 large-4 columns']/div/div[2]/table/tbody/tr[3]/td/a")
	private WebElement ClickOnMyRemainder;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement EnterName;
	@FindBy(xpath = "//input[@name='occasion']")
	private WebElement EnterOccasion;

	@FindBy(xpath="//input[@name='occasionDate']")
	private WebElement ClickOnPickDate;
	
//	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a")
//	private WebElement SelectOccasionDate;
//	
	@FindBy(xpath="//input[@name='reqType']")
	private WebElement ClickOnSaveOccasion;
	
	@FindBy(xpath="//img[@class='edit icon']")
	private WebElement ClickOnEdit;
	
	//div[@class='inputdiv']/input
	

	@FindBy(xpath="//div[@class='inputdiv']/input")
	private WebElement EditName;
	
	//form[@id='editProfile']//tbody/tr[2]/td//input
	 
	@FindBy(xpath="//form[@id='editProfile']//tbody/tr[2]/td//input")
	private WebElement EditMoNumber;
	
	//input[@id='submit']
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement ClickOnSave;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/thead[1]/tr[1]/th[1]/a[2]/img[1]")
	private WebElement ClickOnDeleteOccasion;
	
	@FindBy(xpath="//table[@id='myaccountlink']/tbody/tr[7]/td/a")
	private WebElement signoutFromMyAccount;
	
	
	
	
	
	public WebElement getClickOnMyRemainder() {
		return ClickOnMyRemainder;
	}

	public WebElement getEnterName() {
		return EnterName;
	}

	public WebElement getEnterOccasion() {
		return EnterOccasion;
	}

	public WebElement getClickOnOccasionDate() {
		return ClickOnPickDate;
	}

	public WebElement getClickOnPickDate() {
		return ClickOnPickDate;
	}

	public WebElement getClickOnSaveOccasion()  {
	
		return ClickOnSaveOccasion;
	}

	public WebElement getClickOnDeleteOccasion()  {
	
		return ClickOnDeleteOccasion;
	}

	public WebElement getClickOnEdit() {
		return ClickOnEdit;
	}

	public WebElement getEditName() {
		return EditName;
	}

	public WebElement getEditMoNumber() {
		return EditMoNumber;
	}

	public WebElement getClickOnSave() {
		return ClickOnSave;
	}
	public WebElement getSignoutFromMyAccount() {
		return signoutFromMyAccount;
	}
	
	}


