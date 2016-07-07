package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OnboardingTaxesStep extends BasePage {

    public OnboardingTaxesStep(WebDriver driver) {
        super(driver);
    }


    //User can select 1 of 2 options: "Enter your tax rate" or "Do not include taxes"

    public void setValidTaxPercent(String expected_valid_tax) {

        By tax_rate_radio_button = By.id("rates-onboarding-tax-taxCalculation-percentage");
        click(tax_rate_radio_button);
        By tax_percentage_valid_amount = By.id("rates-onboarding-tax-rate");
        sendKeys(tax_percentage_valid_amount, expected_valid_tax);
        click(tax_rate_radio_button);

        By next_button = By.xpath("//*[contains(text(),'Next')]");
        click(next_button);

           }
}