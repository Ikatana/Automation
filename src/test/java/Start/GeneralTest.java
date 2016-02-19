
package Start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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


            //Navigate to Rates page
            NavigateToRatePage navigateToRatePage = new NavigateToRatePage (driver);
            navigateToRatePage.navToRates ();

            //Add standard, seasonal and event pricing
            RatesPricing ratesPricing = new RatesPricing (driver);
            ratesPricing.ratesPricingSection ();

            //Add Tax
            Tax tax = new Tax (driver);
            tax.taxSection ();

            //Add RDD
            RDD rdd = new RDD (driver);
            rdd.rddSection ();

            //Select Payment option
            PaymentTerms paymentTerms = new PaymentTerms (driver);
            paymentTerms.paymentTermsSection ();

            //Add Note
            Note note = new Note (driver);
            note.notesSection();
    }

         @After
         public void closeWindow () {
               driver.quit();
            }
}


