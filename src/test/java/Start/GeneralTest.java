
package Start;

import TestData.Start;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class GeneralTest extends Start {

        @Test
        public void ownerConfiguresRatePlan () throws Exception {
            loginAndGoToRates();

            //Add standard, seasonal and event pricing
            RatesPricing ratesPricing = new RatesPricing (driver);
            ratesPricing.ratesPricingSection ();

            //Assert.assertTrue(driver.findElement(By.id("ratesTableTitles")).isDisplayed());

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


}


