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

    @Test
    public void ownerAddsRatePricings () throws Exception {
        loginAndGoToRates();

        //Add Valid Standard pricing

        OnboardingRatesStep onboardingRatesStep = new OnboardingRatesStep(driver);
        onboardingRatesStep.setValidBaseRateAmount("176");

        onboardingRatesStep.clickOnAdditionalRatePeriodLink();

        Assert.assertEquals("176.00", driver.findElement(By.id("rates-onboarding-base-rate-amount")).getAttribute("value"));
        Assert.assertEquals("1", driver.findElement(By.id("rates-onboarding-base-rate-minstay")).getAttribute("value"));

        onboardingRatesStep.clickOnNextButton();

        //Add Valid Tax

        OnboardingTaxesStep onboardingTaxesStep = new OnboardingTaxesStep(driver);
        onboardingTaxesStep.clickOnTaxRateRadioButton();

        onboardingTaxesStep.setValidTaxPercent("18.3");

        onboardingTaxesStep.clickOnTaxRateRadioButton();

        Assert.assertEquals("18.300", driver.findElement(By.id("rates-onboarding-tax-rate")).getAttribute("value"));

        onboardingTaxesStep.clickOnNextButton();

        //Add Valid Cleaning Fee

        OnboardingFeesStep onboardingFeesStep = new OnboardingFeesStep(driver);
        onboardingFeesStep.setValidCleaningFee("178.6");

        //Add Valid Pets Fee
        OnboardingFeesStep onboardingFeesStep1 = new OnboardingFeesStep(driver);
        onboardingFeesStep1.setValidPetsFee("25");

        Assert.assertEquals("178.60", driver.findElement(By.id("rates-onboarding-fees-cleaning")).getAttribute("value"));
        Assert.assertEquals("25.00", driver.findElement(By.id("rates-onboarding-fees-pet_fee")).getAttribute("value"));

        onboardingFeesStep.clickOnNextButton();



    }


}