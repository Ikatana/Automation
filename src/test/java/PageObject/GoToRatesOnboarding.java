package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToRatesOnboarding {

    public WebDriver driver;

    public GoToRatesOnboarding(WebDriver driver) {
        this.driver = driver;
    }

    public void navToRates() throws Exception {

        driver.get("https://test.homeaway.com/gd/rates/onboarding/121.7089039.6098645/rates");

    }
}