package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
	public static WebDriver driver;
	protected Properties properties;
	protected Actions action;
	protected FileInputStream fis;
	protected static String filePath;
	protected static WebDriverWait wait;

	/**
	 *
	 * using this method we can load our property and also open desired browser
	 */
//static{
//filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testData\\testAppData.properties";
//}

	public WebDriver setUp(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(appUrl);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public void typeInput(WebElement element, String input) {
		waitForElementDisplayed(element);
		element.clear();
		element.sendKeys(input);
	}

	public void typeInputWithSpace(WebElement element, String input) {
		waitForElementDisplayed(element);
		element.clear();
		element.sendKeys(" " + input);
	}

	public void typeInputWithComma(WebElement element, String input) {
		waitForElementDisplayed(element);
		element.clear();
		element.sendKeys("," + input);
	}

	public String getTextFromElement(WebElement element) {
		waitForElementDisplayed(element);
		return element.getText();
	}

	public String getAttributeValueFromElement(WebElement element, String attributeName) {
		waitForElementDisplayed(element);
		return element.getAttribute(attributeName);
	}

	public void clickOnElement(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
	}

	public static void clickElementWithJavaScript(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);
	}

	public void performMouseOverOperation(WebElement element) {
		action.moveToElement(element).perform();
	}

	public void performRightClickOperation(WebElement element) {
		action.moveToElement(element).contextClick().build().perform();
	}

	public void performDragAndDrop(WebElement source, WebElement target) {
		action.dragAndDrop(source, target).build().perform();
	}

	public void takeScreenShotOfThePage(String location) {
// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
// save the screenshot taken in destination path
			FileUtils.copyFile(file, new File(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to get the title of current page
	 */
	public String getCurrentTitleOfApplication() {
		return driver.getTitle();
	}

	/**
	 * Method to get the title of current page
	 */
	public String getCurrentTitleOfApplication(String title) {
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	/**
	 * Method to get the current url of the application
	 */
	public String getCurrentUrlOfApplication() {
		return driver.getCurrentUrl();
	}

	public boolean isElementExist(WebElement element) {
		waitForElementDisplayed(element);
		return element.isDisplayed();
	}

	public boolean isCheckBoxSelected(WebElement element) {
		waitForElementDisplayed(element);
		return element.isSelected();
	}

	public boolean isElementFunctional(WebElement element) {
		waitForElementDisplayed(element);
		return element.isEnabled();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected void handleHtmlDropdownListWithVisibleText(WebElement element, String visibileText) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		select.selectByVisibleText(visibileText);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected void handleHtmlDropdownListWithIndex(WebElement element, int index) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public WebElement getActiveElement() {
		return driver.switchTo().activeElement();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getHtmlDropdownListSize(WebElement element) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getOptions();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected WebElement getFirstSelectedOptionFromHtmlDropdownList(WebElement element) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getAllSelectedOptionFromMultiSelectDropdownList(WebElement element) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithWebElement(WebElement element) {
		waitForElementDisplayed(element);
		driver.switchTo().frame(element);
	}

	protected void WindowHandles(int i) {
		driver.getWindowHandle();
		Set<String> AllWindow = driver.getWindowHandles();

		List<String> WindowIdList = new ArrayList();

		driver.switchTo().window(WindowIdList.get(1));
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithIndex(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchFromIFrameToMainPage() {

		driver.switchTo().defaultContent();
	}

	/**
	 * This is sleep method from java only use it when uttermost required
	 *
	 * @param millis time in mili seconds
	 */
	protected void setSleepTime(long millis) {

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {

		}
	}

	/**
	 * Method to refresh Page
	 */
	protected void refreshPage() {

		driver.navigate().refresh();

	}

	/**
	 * Method to wait for an element till it's not display .
	 *
	 * @param by
	 */
	public void waitForElementDisplayed(WebElement element) {

		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Method to wait for an element till it's not clickable.
	 *
	 * @param by
	 */
	public void waitForElementToBeClickable(WebElement element) {

		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(element));
	}

	public WebElement getActiveElementFromUI() {
		return driver.switchTo().activeElement();
	}

	public void cleanUp() {
		driver.close();
	}

	public static void waitForPageLoad(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"));
	}

	public static void performKeyPress(int... keyCodes) {
		Robot robot = null;
		try {
			// Create a Robot instance
			robot = new Robot();
			robot.setAutoWaitForIdle(true);
			robot.setAutoDelay(0);

			// Perform keypress simulation for each key code
			for (int keyCode : keyCodes) {
				robot.keyPress(keyCode);
			}

			// Release all keys
			for (int keyCode : keyCodes) {
				robot.keyRelease(keyCode);
			}

			// Perform other actions if needed
		} catch (AWTException e) {
			// Exception occurred, handle it gracefully
			e.printStackTrace();

		}
	}

	public static void pressAltEsc() throws AWTException {
		Robot robot = new Robot();

		// Press Alt
		robot.keyPress(KeyEvent.VK_ALT);

		// Press Esc
		robot.keyPress(KeyEvent.VK_ESCAPE);

		// Release Esc
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		// Release Alt
		robot.keyRelease(KeyEvent.VK_ALT);
	}

	public static void pressTabEnter(int numTabs) throws AWTException {
		Robot robot = new Robot();

		// Press Tab 'numTabs' times
		for (int i = 0; i < numTabs; i++) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public int RandomInt() {
		Random random = new Random();
		int a = random.nextInt(1009);
		int b = random.nextInt(106);
		int c = a + b;
		return c;
	}
}
