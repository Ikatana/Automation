package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RatesPricing {

    public WebDriver driver;

    public RatesPricing(WebDriver driver) {this.driver = driver; }

    public void ratesPricingSection() throws Exception {

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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Add seasonal pricing
        driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn']/a/span")).click();
        driver.findElement(By.xpath(".//*[@id='add_rate_type_chzn_o_0']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("seasonalForm_rateName")).sendKeys("Season 1");
        driver.findElement(By.id("season-start")).click();
        driver.findElement(By.className("nextyear")).click();
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
    }
}