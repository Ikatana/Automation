package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static PageObject.BasePage.click;

public class OnboardingCompleteStep {

    public WebDriver driver;

    public OnboardingCompleteStep(WebDriver driver) {
        this.driver = driver;
    }

    public void completeInfo() throws Exception {

    }

    public void clickOnCompleteButton () {
        By next_button = By.xpath("//*[contains(text(),'Continue')]");
        click(next_button);
    }
}