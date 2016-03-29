
package Start;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class GeneralTest {
    public WebDriver driver;

        @Before
        public void setUp () throws Exception {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @Test
        public void ownerConfiguresRatePlan () throws Exception {
            Login login = new Login(driver);
            login.loginPage("forAutomation@devmail.wvrgroup.internal", "simplePass1");

            Assert.assertTrue(driver.findElement(By.id("gdEditListing")).isDisplayed());

            //Navigate to Rates page
            NavigateToRatePage navigateToRatePage = new NavigateToRatePage (driver);
            navigateToRatePage.navToRates ();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            Assert.assertTrue(driver.findElement(By.linkText("Rates")).isDisplayed());

            //Add standard, seasonal and event pricing
            RatesPricing ratesPricing = new RatesPricing (driver);
            ratesPricing.ratesPricingSection ();

            Assert.assertTrue(driver.findElement(By.id("ratesTableTitles")).isDisplayed());
           
            //Add Tax
            Tax tax = new Tax (driver);
            tax.taxSection ();

            Assert.assertEquals("15.1", driver.findElement(By.id("taxRate")).getAttribute("value"));

            //Add RDD
            RDD rdd = new RDD (driver);
            rdd.rddSection ();

            Assert.assertEquals("254.8", driver.findElement(By.id("rddAmount")).getAttribute("value"));

            //Select Payment option
            PaymentTerms paymentTerms = new PaymentTerms (driver);
            paymentTerms.paymentTermsSection ();

            Assert.assertEquals("Testing of Payment Terms section !@#$%^&*()_+", driver.findElement(By.name("paymentTermsText")).getAttribute("value"));

            //Add Note
            Note note = new Note (driver);
            note.notesSection();

            Assert.assertEquals("Testing of Notes section", driver.findElement(By.name("notesText")).getAttribute("value"));

            //Verification of the digit formatting (proper amount of decimal places)
            Assert.assertEquals("15.100", driver.findElement(By.id("taxRate")).getAttribute("value"));
            Assert.assertEquals("254.80", driver.findElement(By.id("rddAmount")).getAttribute("value"));

        }


         @After
         public void closeWindow () {
               driver.quit();
            }
}


