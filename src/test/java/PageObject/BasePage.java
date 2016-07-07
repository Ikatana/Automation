package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }



    public static By click(final By locator) {
        driver.findElement(locator).click();
        return locator;
    }

    public static String getElementText(final By locator) {
        return driver.findElement(locator).getText();
    }

    public String getElementValue(final By locator) {
        return driver.findElement(locator).getAttribute("value");
    }

    public void clear(final By locator) {
        driver.findElement(locator).clear();
    }

    public void sendKeys(final By locator, String keys) {
        clear(locator);
        driver.findElement(locator).sendKeys(keys);
    }


    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}