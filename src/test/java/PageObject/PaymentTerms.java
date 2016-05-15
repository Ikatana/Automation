package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentTerms {

    public WebDriver driver;

    public PaymentTerms(WebDriver driver) {
        this.driver = driver;
    }

    public void paymentTermsSection() throws Exception {

        //Add text in Payment Terms section
        driver.findElement(By.name("paymentTermsText")).sendKeys("Testing of Payment Terms section !@#$%^&*()_+");
    }
}