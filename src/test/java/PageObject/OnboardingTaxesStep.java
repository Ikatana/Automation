package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OnboardingTaxesStep {

    public WebDriver driver;

    public OnboardingTaxesStep(WebDriver driver) {
        this.driver = driver;
    }

    public void taxInfo() throws Exception {

        //User can select 1 of 2 options: "Enter your tax rate" or "Do not include taxes"
        driver.findElement(By.id("rates-onboarding-tax-taxCalculation-percentage")).click();
        driver.findElement(By.id("rates-onboarding-tax-rate")).clear();
        driver.findElement(By.id("rates-onboarding-tax-rate")).sendKeys("17.5");
        driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
    }
}