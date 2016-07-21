package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnboardingFeesStep extends BasePage {

    public OnboardingFeesStep (WebDriver driver) {
        super(driver);
    }

    ////User can select 1 or 2 fees: "Cleaning fee" or/and "Pet fee". User can continue without fees

    public void setValidCleaningFee(String expected_valid_cleaning_fee) {

        By cleaning_fee_valid_amount = By.id("rates-onboarding-fees-cleaning");
        sendKeys(cleaning_fee_valid_amount, expected_valid_cleaning_fee);
    }

    public void setValidPetsFee(String expected_valid_pets_fee) {

        By pets_fee_Yes_radio_button = By.id("rates-onboarding-fees-pet_fee-yes");
        click(pets_fee_Yes_radio_button);

        By pets_fee_valid_amount = By.id("rates-onboarding-fees-pet_fee");
        sendKeys(pets_fee_valid_amount, expected_valid_pets_fee);

        By pets_fee_taxable_checkbox = By.id("rates-onboarding-fees-pet_fee-taxable");
        click(pets_fee_taxable_checkbox);
    }

    public void clickOnNextButton () {
        By next_button = By.xpath("//*[contains(text(),'Next')]");
        click(next_button);
    }


}
