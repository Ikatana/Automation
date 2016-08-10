package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class OnboardingCancellationPolicy extends BasePage {
    public OnboardingCancellationPolicy(WebDriver driver) {
        super(driver);
    }

    //Select one of the options for CancellationPolicy
    public void selectRelaxedOption() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        By relaxedOption = By.xpath("//label[contains(text(),'Relaxed')]");
        click(relaxedOption);
    }


    public void clickOnNextButton () {
        By next_button = By.xpath("//*[contains(text(),'Next')]");
        click(next_button);
    }
}
