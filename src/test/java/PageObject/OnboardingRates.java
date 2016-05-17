package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OnboardingRates {

    public WebDriver driver;

    public OnboardingRates(WebDriver driver) {this.driver = driver;}

    public void ratePricings () throws Exception {

        //User can add 1 Standard and several (need to confirm) Seasonal pricings
        driver.findElement(By.id("rates-onboarding-base-rate-amount")).clear();
        driver.findElement(By.id("rates-onboarding-base-rate-amount")).sendKeys("175");
        driver.findElement(By.xpath("//*[contains(text(),'Additional Rate Periods')]")).click();
        driver.findElement(By.id("rate-period-start-date")).click();
        driver.findElement(By.id("rate-period-start-date")).sendKeys("9/16/2016");
        driver.findElement(By.id("rate-period-end-date")).click();
        driver.findElement(By.id("2016-09-30_2016-09")).click();
        driver.findElement(By.id("rate-period-nightly-rate")).click();
        driver.findElement(By.id("rate-period-nightly-rate")).sendKeys("155");
        driver.findElement(By.id("rate-period-min-stay")).sendKeys("2");
        //verify MinStay12
        driver.findElement(By.id("rate-period-name")).clear();
        driver.findElement(By.id("rate-period-name")).sendKeys("testName1234567890-=");
        driver.findElement(By.xpath("//*[contains(@id,'rates-onboarding-desktop-add-edit')]//button[contains(text(),'Add')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();

    }


}
