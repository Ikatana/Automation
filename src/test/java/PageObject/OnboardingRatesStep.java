package PageObject;

import org.openqa.selenium.By;

public class OnboardingRatesStep extends BasePage {


    //Set up VALID amount to Standard (Base) rate input field
    public void setValidBaseRateAmount(String expected_price) {

        By standard_nightly_rate_field_valid_value = By.id("rates-onboarding-base-rate-amount");
        clear(standard_nightly_rate_field_valid_value);
        sendKeys(standard_nightly_rate_field_valid_value, expected_price);
    }

    //Set up NEGATIVE amount to Standard (Base) rate input field
    public void setNegativeBaseRateAmount (String expected_negative_price){
        By standard_nightly_rate_field_negative_value = By.id("rates-onboarding-base-rate-amount");
        clear(standard_nightly_rate_field_negative_value);
        sendKeys(standard_nightly_rate_field_negative_value, expected_negative_price);
    }

    //Set up ZERO as amount to Standard (Base) rate input field
    public void setZeroBaseRateAmount (String expected_zero_price){
        By standard_nightly_rate_field_zero_value = By.id("rates-onboarding-base-rate-amount");
        sendKeys(standard_nightly_rate_field_zero_value, expected_zero_price);
    }

    public void clickOnAdditionalRatePeriodLink () {
        By additional_Rate_Periods_link = By.xpath("//*[contains(text(),'Additional Rate Periods')]");
        click(additional_Rate_Periods_link);
    }

    public void selectStartDate (String expected_start_date) {
        By rate_period_start_date_icon = By.id("rate-period-start-date");
        clear(rate_period_start_date_icon);
        sendKeys(rate_period_start_date_icon, expected_start_date);
    }

    public  void  selectEndDate (String expected_end_date){
        By rate_period_end_date_icon = By.id("rate-period-nightly-rate");
        clear(rate_period_end_date_icon);
        sendKeys(rate_period_end_date_icon, expected_end_date);
    }

    //Enter VALID amount to Seasonal rate input field
    public  void enterValidSeasonalRateAmount1(String expected_valid_price_seasonal1) {
        By seasonal_nightly_rate_field_valid_value = By.id("rate-period-nightly-rate");
        clear(seasonal_nightly_rate_field_valid_value);
        sendKeys(seasonal_nightly_rate_field_valid_value, expected_valid_price_seasonal1);
    }

    //Enter NEGATIVE amount to Seasonal rate input field
    public  void enterNegativeSeasonalRateAmount1(String expected_negative_price_seasonal1) {
        By seasonal_nightly_rate_field_negative_value = By.id("rate-period-nightly-rate");
        clear(seasonal_nightly_rate_field_negative_value);
        sendKeys(seasonal_nightly_rate_field_negative_value, expected_negative_price_seasonal1);
    }

    //Enter ZERO as amount to Seasonal rate input field
    public  void enterZeroSeasonalRateAmount1(String expected_zero_price_seasonal1) {
        By seasonal_nightly_rate_field_zero_value = By.id("rate-period-nightly-rate");
        clear(seasonal_nightly_rate_field_zero_value);
        sendKeys(seasonal_nightly_rate_field_zero_value, expected_zero_price_seasonal1);
    }

    public void select_Min_Stay (){
        By min_Stay = By.id("rate-period-min-stay");
        click(min_Stay);
    }

    public void enterValidSeasonalPeriodName (String expected_valid_name){
        By seasonal_rate_period_name_valid_value = By.id("rate-period-name");
        clear(seasonal_rate_period_name_valid_value);
        sendKeys(seasonal_rate_period_name_valid_value, expected_valid_name);
    }

    public void clickOnAddButton (){
        By add_button = By.xpath("//*[contains(@id,'rates-onboarding-desktop-add-edit')]//button[contains(text(),'Add')]");
        click(add_button);
    }

    public void clickOnNextButton () {
        By next_button = By.xpath("//*[contains(text(),'Next')]");
        click(next_button);
    }
}

/*
       //User can add 1 Standard and several (need to confirm) Seasonal pricings

        //driver.findElement(By.id("rates-onboarding-base-rate-amount")).clear();
        driver.findElement(By.id("rates-onboarding-base-rate-amount")).sendKeys("175");
        //driver.findElement(By.xpath("//*[contains(text(),'Additional Rate Periods')]")).click();
        //driver.findElement(By.id("rate-period-start-date")).click();
        driver.findElement(By.id("rate-period-start-date")).sendKeys("9/16/2016");
        //driver.findElement(By.id("rate-period-end-date")).click();
        driver.findElement(By.id("2016-09-30_2016-09")).click();
        //driver.findElement(By.id("rate-period-nightly-rate")).click();
        driver.findElement(By.id("rate-period-nightly-rate")).sendKeys("155");
        //driver.findElement(By.id("rate-period-min-stay")).sendKeys("2");
        //verify MinStay12
        //driver.findElement(By.id("rate-period-name")).clear();
        driver.findElement(By.id("rate-period-name")).sendKeys("testName1234567890-=");
        //driver.findElement(By.xpath("//*[contains(@id,'rates-onboarding-desktop-add-edit')]//button[contains(text(),'Add')]")).click();
        //driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();

    }




*/
