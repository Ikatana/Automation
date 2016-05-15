package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Note {

    public WebDriver driver;

    public Note(WebDriver driver) {
        this.driver = driver;
    }

    public void notesSection() throws Exception {
        //Add note
        driver.findElement(By.name("notesText")).sendKeys("Testing of Notes section");
    }
}