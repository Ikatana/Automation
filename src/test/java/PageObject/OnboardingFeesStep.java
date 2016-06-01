package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnboardingFeesStep {

    public WebDriver driver;

    public OnboardingFeesStep(WebDriver driver) {
        this.driver = driver;
    }

    public void feeInfo() throws Exception {

        //User can select 1 or 2 fees: "Cleaning fee" or/and "Pet fee"
        driver.findElement(By.id("rates-onboarding-fees-cleaning")).click();
        driver.findElement(By.id("rates-onboarding-fees-cleaning")).sendKeys("205.1");
        driver.findElement(By.id("rates-onboarding-fees-pet_fee-yes")).click();
        driver.findElement(By.id("rates-onboarding-fees-pet_fee")).clear();
        driver.findElement(By.id("rates-onboarding-fees-pet_fee")).sendKeys("50");
        //driver.findElement(By.id("rates-onboarding-fees-pet_fee-taxable")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
    }
}
