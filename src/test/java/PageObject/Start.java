package PageObject;

import org.openqa.selenium.WebDriver;

        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import java.util.concurrent.TimeUnit;

public class Start {
    public WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void loginAndGoToRates() throws Exception {
        Login login = new Login(driver);
        login.loginPage("forAutomation@devmail.wvrgroup.internal", "simplePass1");

        Assert.assertTrue(driver.findElement(By.id("gdEditListing")).isDisplayed());

        //Navigate to Rates page
        GoToRatesOnboarding goToRatesOnboarding = new GoToRatesOnboarding (driver);
        goToRatesOnboarding.navToRates ();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void closeWindow () {
        driver.quit();
    }
}