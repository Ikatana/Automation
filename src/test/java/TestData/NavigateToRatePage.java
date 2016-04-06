package TestData;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class NavigateToRatePage {

public WebDriver driver;

public NavigateToRatePage(WebDriver driver) {this.driver = driver; }

    public void navToRates () throws Exception {

        driver.findElement(By.id("gdEditListing")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Rates")).click();
        WebElement myDynamicElement = (new WebDriverWait(driver, 50))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='rates-wrapper']/div[9]/div[1]/h2")));
    }

}

