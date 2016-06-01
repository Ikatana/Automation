/*package Tests;

import org.junit.Test;
import PageObject.*;

    public class RatesOnboarding extends Start {

    @Test
    public void ownerConfiguresRatePlan () throws Exception {
      loginAndGoToRates();

        //Add Standard and Seasonal pricings
        OnboardingRatesStep setRates = new OnboardingRatesStep(driver, standard_nightly_rate_field);

        public void loginAndGoToRates() throws Exception {
            Login login = new Login(driver);
            login.loginPage("forAutomation@devmail.wvrgroup.internal", "simplePass1");



        //Assert.assertEquals("175.00", driver.findElement(By.id("rates-onboarding-base-rate-amount")).getAttribute("value"));

        //Add Tax info
        OnboardingTaxesStep onboardingTaxes = new OnboardingTaxesStep(driver);
        onboardingTaxes.taxInfo ();

        //Assert.assertEquals("17.500", driver.findElement(By.id("rates-onboarding-tax-rate")).getAttribute("value"));

        //Add Fee info
        OnboardingFeesStep onboardingFees = new OnboardingFeesStep(driver);
        onboardingFees.feeInfo ();

        //Assert.assertEquals("205.10", driver.findElement(By.id("rates-onboarding-fees-cleaning")).getAttribute("value"));
        //Assert.assertEquals("50.00", driver.findElement(By.id("rates-onboarding-fees-pet_fee")).getAttribute("value"));

        //Add Complete info
        OnboardingCompleteStep onboardingComplete = new OnboardingCompleteStep(driver);
        onboardingComplete.completeInfo ();

        //Assert.assertEquals("You have finished setting up your rates!", driver.findElement(By.linkText("You have finished setting up your rates!")).getAttribute("value"));
        //driver.findElement(By.linkText("You have finished setting up your rates!")).clear();
    }

}
*/