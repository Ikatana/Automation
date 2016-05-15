package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tax {

    public WebDriver driver;

    public Tax(WebDriver driver) {
        this.driver = driver;
    }

    public void taxSection() throws Exception {

        //Add Tax
        driver.findElement(By.xpath(".//*[@id='taxRateForm']/div[2]/div[1]/div/div")).click();
        driver.findElement(By.id("taxRate")).sendKeys("15.1");
    }
}