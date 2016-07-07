package Tests;

import PageObject.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class SetUpRatePricings extends Start {

//    @Before
//    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }

    @Test
    public void ownerAddsRatePricings () throws Exception {
        loginAndGoToRates();

        //Add Valid Standard pricing

        OnboardingRatesStep onboardingRatesStep = new OnboardingRatesStep(driver);
        onboardingRatesStep.setValidBaseRateAmount("175");

        Assert.assertEquals("175.00", driver.findElement(By.id("rates-onboarding-base-rate-amount")).getAttribute("value"));
        Assert.assertEquals("1", driver.findElement(By.id("rates-onboarding-base-rate-minstay")).getAttribute("value"));

        onboardingRatesStep.clickOnNextButton();

        //Add Valid Tax

        OnboardingTaxesStep onboardingTaxesStep = new OnboardingTaxesStep(driver);
        onboardingTaxesStep.setValidTaxPercent("18.3");

        Assert.assertEquals("18.300", driver.findElement(By.id("rates-onboarding-tax-rate")).getAttribute("value"));









        //base_rate_amount_valid = sendKeys(By.id("rates-onboarding-base-rate-amount"));

    }


}