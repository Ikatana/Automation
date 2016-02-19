package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public WebDriver driver;
    public String baseUrl = "https://test.homeaway.com/";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void loginPage (String username, String password){

        driver.get(baseUrl + "/haod");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("forAutomation@devmail.wvrgroup.internal");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("simplePass1");
        driver.findElement(By.id("form-submit")).click();

    }
}

