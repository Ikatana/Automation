package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OnboardingPaymentTermsStep extends BasePage {

    public OnboardingPaymentTermsStep (WebDriver driver){super(driver);}


    //Select one of the options for PaymentTerms
    public void selectPaymentOption100percents (){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        By paymentOption100percents = By.id("input-payment-terms-single");
        click(paymentOption100percents);
    }

    public void selectPaymentOption50percents(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        By paymentOption50percents = By.id("input-payment-terms-multiple_50");
        click(paymentOption50percents);
    }

    public void selectPaymentOption525percents (){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        By paymentOption25percents = By.id("input-payment-terms-multiple_25");
        click(paymentOption25percents);
    }

    public void clickOnNextButton () {
        By next_button = By.xpath("//*[contains(text(),'Next')]");
        click(next_button);
    }


}
