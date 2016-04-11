package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RDD {

    public WebDriver driver;

    public RDD(WebDriver driver) {
        this.driver = driver;
    }

    public void rddSection() throws Exception {

        //Add RDD
        driver.findElement(By.xpath(".//*[@id='protectionWrapper']/div[2]/div/div[2]/div/span/div[1]")).click();
        driver.findElement(By.id("rddAmount")).sendKeys("254.8");
    }
}