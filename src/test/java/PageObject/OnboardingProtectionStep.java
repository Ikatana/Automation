package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnboardingProtectionStep extends BasePage {
    public OnboardingProtectionStep (WebDriver driver) {super(driver);}

    //Set up RDD
    public void clickOnRDDcheckBox (){
        By rddCheckBox = By.xpath("//label[contains(text(),'Collect a Refundable Damage Deposit')]");
        click(rddCheckBox);
    }

    public void setValidRDD (String expected_valid_RDD){
        By rddValidAmount = By.id("policies-onboarding-deposit-amount");
        sendKeys(rddValidAmount, expected_valid_RDD);
    }

    public void clickOnNextButton () {
        By next_button = By.xpath("//*[contains(text(),'Next')]");
        click(next_button);
    }
}
