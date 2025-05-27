package com.fnp.framework.utils;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.junit.Assert;
import com.fnp.framework.config.ConfigLoader;
import com.fnp.framework.driver.DriverManager;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FrameworkUtils {

    private WebDriver driver;
    private WebDriverWait wait;

    public FrameworkUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    
    public static void closePopupIfPresent(WebDriver driver) {
        try {
            Thread.sleep(2000); // Small wait for popup to load
            By popupCloseButton = By.cssSelector(".close-reveal-modal, .popup-close, .modal-close, .close"); // Update as needed

            WebElement closeBtn = driver.findElement(popupCloseButton);
            if (closeBtn.isDisplayed()) {
                closeBtn.click();
                System.out.println("Popup closed from Utils.");
            }
        } catch (Exception e) {
            System.out.println("No popup found or already closed.");
        }
    }
    public void closeWebEngagePopupIfPresent() {
        try {
            Thread.sleep(2000); // Slight wait for popup to render
            By overlayCloseBtn = By.cssSelector(".wzrk-button-close"); // Common close button selector for WebEngage

            List<WebElement> closeButtons = driver.findElements(overlayCloseBtn);
            if (!closeButtons.isEmpty() && closeButtons.get(0).isDisplayed()) {
                closeButtons.get(0).click();
                System.out.println("WebEngage popup closed.");
            }
        } catch (Exception e) {
            System.out.println("WebEngage popup not found or already closed.");
        }
    }
    
    public static void pressEscape() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void switchToLastTab(WebDriver driver) {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }
    public void waitForOverlayToDisappear() {
        try {
            By overlay = By.cssSelector(".wzrk-overlay");
            new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.invisibilityOfElementLocated(overlay));
            System.out.println("Overlay disappeared.");
        } catch (TimeoutException e) {
            System.out.println("Overlay still present after timeout.");
        }
    }
    public void removeOverlayUsingJS() {
        try {
            By overlay = By.cssSelector(".wzrk-overlay");
            WebElement overlayElement = driver.findElement(overlay);
            
            if (overlayElement != null) {
                JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
                jsExecutor.executeScript("arguments[0].style.display='none';", overlayElement); // Hide the overlay
                System.out.println("Overlay removed using JS.");
            }
        } catch (Exception e) {
            System.out.println("No overlay to remove using JS or error occurred.");
        }
    }
    public void forceClickUsingJS(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].click();", element); // Force click using JS
            System.out.println("Clicked element using JavaScript.");
        } catch (Exception e) {
            System.out.println("Error while clicking using JS: " + e.getMessage());
        }
    }
    public void userEntersPincodeAndPressesEnter() {
        String pincode = ConfigLoader.get("pincode");  // Read pincode from property file

        if (pincode != null && !pincode.isEmpty()) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".wzrk-overlay")));

            WebElement pincodeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pincode-location-input']")));
            pincodeInput.clear();
            pincodeInput.sendKeys(pincode);

            try {
                // Wait 1–2 seconds to allow suggestions to appear
                Thread.sleep(1500); // Adjust time if needed (e.g., 1000–2000ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Now press ENTER to select the suggestion
            pincodeInput.sendKeys(Keys.ENTER);
            System.out.println("Pincode entered and Enter key pressed.");
        } else {
            throw new RuntimeException("Pincode not found in config file.");
        }
    }


    public void handleDeliveryOptionAndClickCalendar(By availableOptionsText, By handDelivery, By calendarSlot) {
        try {
            if (isElementVisible(availableOptionsText)) {
                // Click Hand Delivery if "Available options" is visible
                click(handDelivery);
                System.out.println("✅ Clicked on Hand Delivery.");
            } else {
                System.out.println("ℹ️ Available options not visible, skipping Hand Delivery.");
            }

            // In both cases, click the calendar slot
            click(calendarSlot);
            System.out.println("✅ Clicked on Calendar.");

        } catch (Exception e) {
            System.out.println("❌ Error in handleDeliveryOptionAndClickCalendar: " + e.getMessage());
        }
    }

    // --------------------------------------------
    // Selenium Actions
    // --------------------------------------------
    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    

    // --------------------------------------------
    // Selenium Actions
    // --------------------------------------------
    public String  get_Text(By locator) {
       String text= wait.until(ExpectedConditions.elementToBeClickable(locator)).getText();
       return text;
    }
    
    public boolean verifyTextVisible(By locator, String expectedText) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            String actualText = element.getText().trim();
            System.out.println("Actual text found: " + actualText);
            return actualText.equals(expectedText); // Or use contains if needed
        } catch (TimeoutException e) {
            System.out.println("Element not visible for text verification.");
            return false;
        }
    }
      public void type(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }
      public boolean isElementVisible(By locator) {
    	    try {
    	        return driver.findElement(locator).isDisplayed();
    	    } catch (NoSuchElementException e) {
    	        return false;
    	    }
    	}

    public String getText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    public boolean isDisplayed(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void selectByVisibleText(By locator, String visibleText) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        new Select(dropdown).selectByVisibleText(visibleText);
    }

    public void hover(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        new Actions(driver).moveToElement(element).perform();
    }
    public void verifyEarliestByTodayAndTodayDateClickable() {
        // Assert the visibility of "Earliest by Today" text
        WebElement earliestText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='Earliest by Today']")));
        Assert.assertTrue("'Earliest by Today' text is not visible", earliestText.isDisplayed());

        // Assert if today's date is clickable
        String today = String.valueOf(java.time.LocalDate.now().getDayOfMonth());
        WebElement todayDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='" + today + "']")));
        Assert.assertTrue("Today's date is not clickable in the calendar", todayDate.isEnabled());

        System.out.println("✅ Both assertions passed: 'Earliest by Today' is visible and today's date is clickable.");
    }

    // --------------------------------------------
    // Wait Utilities
    // --------------------------------------------
    public void waitForVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForClickability(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void scrollToBottomOfPage(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long previousHeight = (long) js.executeScript("return document.body.scrollHeight");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(1000); // Wait for lazy-loaded content to load
            long newHeight = (long) js.executeScript("return document.body.scrollHeight");

            if (newHeight == previousHeight) {
                break;
            }
            previousHeight = newHeight;
        }
    }

    public static void switchToDefaultContent(WebDriver driver) {
        driver.switchTo().defaultContent();
    }
    public static void switchToTargetIframe(WebDriver driver) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='zoid-component-frame zoid-visible']")));
                driver.switchTo().frame(iframe);
                return; // Success
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
        throw new RuntimeException("Failed to switch to iframe after retries due to stale element.");
    }

    public void clickTodayDateInCalendar() {
        try {
            // Ensure the calendar is open before attempting to click
            Thread.sleep(1000); // Optional: wait for animation/rendering

            // Get today's date as a number (e.g., "14")
            String today = String.valueOf(LocalDate.now().getDayOfMonth());

            // Try multiple formats: adjust based on your calendar DOM
            By todayLocator = By.xpath("//div[contains(@class,'cursor-pointer') and normalize-space(text())='" + LocalDate.now().getDayOfMonth() + "']");

            WebElement todayDate = wait.until(ExpectedConditions.elementToBeClickable(todayLocator));
            todayDate.click();

            System.out.println("✅ Clicked on today's date: " + today);
        } catch (TimeoutException e) {
            System.out.println("❌ Today's date is not clickable or not found.");
        } catch (Exception e) {
            System.out.println("❌ Error clicking today's date: " + e.getMessage());
        }
    }
    public void clickTomorrowDateInCalendar() {
        try {
            // Ensure the calendar is open before attempting to click
            Thread.sleep(1000); // Optional: wait for animation/rendering

            // Get tomorrow's date as a number (e.g., "15")
            LocalDate tomorrow = LocalDate.now().plusDays(1);
            String tomorrowDay = String.valueOf(tomorrow.getDayOfMonth());

            // Try multiple formats: adjust based on your calendar DOM
            By tomorrowLocator = By.xpath("//div[contains(@class,'cursor-pointer') and normalize-space(text())='" + tomorrowDay + "']");

            WebElement tomorrowDate = wait.until(ExpectedConditions.elementToBeClickable(tomorrowLocator));
            tomorrowDate.click();

            System.out.println("✅ Clicked on tomorrow's date: " + tomorrowDay);
        } catch (TimeoutException e) {
            System.out.println("❌ Tomorrow's date is not clickable or not found.");
        } catch (Exception e) {
            System.out.println("❌ Error clicking tomorrow's date: " + e.getMessage());
        }
    }

    public void sendKeys(By locator, String value) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(value);
    }
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void waitForTextInElement(By locator, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }
    public void pressEnterKey() {
        try {
            Robot robot = new Robot();
            Thread.sleep(3000); // Wait for popup to appear
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void waitForPageLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(
            wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        
    }
    public void handlePopupIfPresent(By popupLocator, By buttonLocator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(popupLocator));
            WebElement popup = driver.findElement(popupLocator);
            if (popup.isDisplayed()) {
                WebElement button = driver.findElement(buttonLocator);
                button.click();
                System.out.println("Popup handled successfully.");
            }
        } catch (TimeoutException e) {
            System.out.println("Popup did not appear within wait time.");
        } catch (NoSuchElementException e) {
            System.out.println("Popup or button not found in DOM.");
        } catch (Exception e) {
            System.out.println("Unexpected error while handling popup: " + e.getMessage());
        }
    }
    public static void closePaypalIframe(WebDriver driver) {
        // Switch to PayPal iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe[@title='PayPal Checkout Overlay']"));
        driver.switchTo().frame(iframe);

        // Click the close button using JavaScript
        WebElement closeButton = driver.findElement(By.xpath("//a[@aria-label='close']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeButton);

        // Switch back to main content
        driver.switchTo().defaultContent();
    }
}

