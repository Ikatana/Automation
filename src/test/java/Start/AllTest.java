package Start;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.fail;


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

        //Click on DropDown
        driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn']/a/span")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Add seasonal pricing
        driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn_o_1']")).click();
        driver.findElement(By.id("seasonalForm_rateName")).sendKeys("Season 1");
        driver.findElement(By.xpath(".//*[@id='seasonalForm_minStay_chzn']/a/span")).click();
        driver.findElement(By.id("seasonalForm_minStay_chzn_o_3")).click();
        driver.findElement(By.id("season-start")).click();
        driver.findElement(By.className("nextmonth")).click();
        driver.findElement(By.xpath(".//*[@id='calendar4']/table/tbody/tr[1]/td[6]/a")).click();
        driver.findElement(By.xpath(".//*[@id='calendar5']/table/tbody/tr[2]/td[7]/a")).click();

        driver.findElement(By.id("seasonalForm_nightlyRate")).sendKeys("150");
        driver.findElement(By.id("seasonalForm_weeklyRate")).sendKeys("777");
        driver.findElement(By.id("seasonalForm_monthlyRate")).sendKeys("3000");





        //driver.findElement(By.id("baseForm_nightlyRate")).sendKeys("150");
        //driver.findElement(By.id("baseForm_weeklyRate")).sendKeys("777");
        //driver.findElement(By.id("baseForm_monthlyRate")).sendKeys("3000");


        //Add note
        driver.findElement(By.name("notesText")).sendKeys("Testing of Notes section");
    }

    }


        //driver.findElement(By.id("add_rate_type_chzn")).sendKeys("Seasonal pricing");
        //driver.findElement(By.id("seasonalForm_rateName")).sendKeys("Season 1");
        //driver.findElement(By.id("seasonalForm_nightlyRate")).sendKeys("150");
        //driver.findElement(By.id("seasonalForm_weeklyRate")).sendKeys("777");
        //driver.findElement(By.id("seasonalForm_monthlyRate")).sendKeys("3000");
        //driver.findElement(By.id("seasonalForm_minStay_chzn")).sendKeys("2");








