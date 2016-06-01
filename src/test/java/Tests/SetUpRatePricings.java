package Tests;

import PageObject.*;
import org.junit.Test;

public class SetUpRatePricings extends Start {

    @Test
    public void ownerAddsRatePricings () throws Exception {
        loginAndGoToRates();

        //Add Standard and Seasonal pricings

        OnboardingRatesStep onboardingRatesStep = new OnboardingRatesStep();
        onboardingRatesStep.setValidBaseRateAmount("175");






        //base_rate_amount_valid = sendKeys(By.id("rates-onboarding-base-rate-amount"));

    }


}