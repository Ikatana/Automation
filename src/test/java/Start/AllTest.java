package Start;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.fail;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.By;


/**
 * Created by aiak on 12/7/2015.
 */
public class AllTest {

    public WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp () throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://test.homeaway.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void LoginTest () throws Exception {
        //Login
        driver.get(baseUrl + "/");
        driver.findElement(By.cssSelector("div.js-interactionOverlay.interaction-overlay")).click();
        driver.findElement(By.id("login-drop")).click();
        driver.findElement(By.linkText("Owner Login")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("forAutomation@devmail.wvrgroup.internal");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("simplePass1");
        driver.findElement(By.id("form-submit")).click();
        //driver.findElement(By.id("answer")).clear();
        //driver.findElement(By.id("answer")).sendKeys("test");
        //driver.findElement(By.id("form-submit")).click();
        //}

        //NavigateToRatesLE
        driver.findElement(By.id("gdEditListing")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Rates")).click();
        WebElement myDynamicElement = (new WebDriverWait(driver, 50))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='rates-wrapper']/div[9]/div[1]/h2")));

        //Click on DropDown
        driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn']/a/span")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Add standard pricing
        driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn_o_0']")).click();
        driver.findElement(By.xpath(".//*[@id='baseForm_minStay_chzn']/a/div/b")).click();
        driver.findElement(By.id("baseForm_minStay_chzn_o_1")).click();
        driver.findElement(By.id("baseForm_nightlyRate")).sendKeys("150");
        driver.findElement(By.id("baseForm_weeklyRate")).sendKeys("777");
        driver.findElement(By.id("baseForm_monthlyRate")).sendKeys("3000");
        driver.findElement(By.id("baseForm_add")).click();

        //Add seasonal pricing
        driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn']/a/span")).click();
        driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn_o_0']")).click();
        driver.findElement(By.id("seasonalForm_rateName")).sendKeys("Season 1");
        driver.findElement(By.id("season-start")).click();
        driver.findElement(By.className("nextmonth")).click();
        driver.findElement(By.xpath(".//*[@id='calendar4']/table/tbody/tr[1]/td[6]/a")).click();
        driver.findElement(By.xpath(".//*[@id='calendar5']/table/tbody/tr[2]/td[7]/a")).click();
        driver.findElement(By.xpath(".//*[@id='seasonalForm_minStay_chzn']/a/span")).click();
        driver.findElement(By.id("seasonalForm_minStay_chzn_o_3")).click();
        driver.findElement(By.id("seasonalForm_nightlyRate")).sendKeys("175");
        driver.findElement(By.id("seasonalForm_weeklyRate")).sendKeys("1000");
        driver.findElement(By.id("seasonalForm_monthlyRate")).sendKeys("3333");
        driver.findElement(By.id("seasonalForm_add")).click();

        //Add event pricing
        //driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn']/a/span")).click();
        //driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn_o_1']")).click();
        //driver.findElement(By.id("eventForm_rateName")).sendKeys("Event 1");
        //driver.findElement(By.id("event-start")).click();
        //driver.findElement(By.className("nextmonth")).click();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.findElement(By.xpath(".//*[@id='calendar1']/table/tbody/tr[4]/td[1]/a")).click();
        //driver.findElement(By.xpath(".//*[@id='calendar1']/table/tbody/tr[4]/td[4]/a")).click();
        //driver.findElement(By.id("eventForm_eventRate")).sendKeys("333");
        //driver.findElement(By.id("seasonalForm_add")).click();

        //Add Tax
        driver.findElement(By.xpath(".//*[@id='taxRateForm']/div[2]/div[1]/div/div")).click();
        driver.findElement(By.id("taxRate")).sendKeys("15.1");

        //Add RDD
        driver.findElement(By.xpath(".//*[@id='protectionWrapper']/div[2]/div/div[2]/div/span/div[1]")).click();
        driver.findElement(By.id("rddAmount")).sendKeys("254.89");

        //Add text in Payment Terms section
        driver.findElement(By.name("paymentTermsText")).sendKeys("Testing of Payment Terms section !@#$%^&*()_+");

        //Add note
        driver.findElement(By.name("notesText")).sendKeys("Testing of Notes section");
    }
        @After
        public void closeWindow()
        {
            driver.quit();

        }
    }










