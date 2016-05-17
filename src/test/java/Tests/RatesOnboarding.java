package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObject.*;

    public class RatesOnboarding extends Start {

    @Test
    public void ownerConfiguresRatePlan () throws Exception {
      loginAndGoToRates();

        //Add Standard and Seasonal pricings
        OnboardingRates onboardingRates = new OnboardingRates(driver);
        onboardingRates.ratePricings ();

        //Assert.assertEquals("175.00", driver.findElement(By.id("rates-onboarding-base-rate-amount")).getAttribute("value"));

        //Add Tax info
        OnboardingTaxes onboardingTaxes = new OnboardingTaxes(driver);
        onboardingTaxes.taxInfo ();

        //Assert.assertEquals("17.500", driver.findElement(By.id("rates-onboarding-tax-rate")).getAttribute("value"));

        //Add Fee info
        OnboardingFees onboardingFees = new OnboardingFees(driver);
        onboardingFees.feeInfo ();

        //Assert.assertEquals("205.10", driver.findElement(By.id("rates-onboarding-fees-cleaning")).getAttribute("value"));
        //Assert.assertEquals("50.00", driver.findElement(By.id("rates-onboarding-fees-pet_fee")).getAttribute("value"));

        //Add Complete info
        OnboardingComplete onboardingComplete = new OnboardingComplete(driver);
        onboardingComplete.completeInfo ();

        //Assert.assertEquals("You have finished setting up your rates!", driver.findElement(By.linkText("You have finished setting up your rates!")).getAttribute("value"));
        //driver.findElement(By.linkText("You have finished setting up your rates!")).clear();
    }

}
