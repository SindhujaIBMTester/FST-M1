package activities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1Testng {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://www.training-support.net");
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

    @Test
    public void testcase() {
        String title = driver.getTitle();
        assertEquals("Training Support",title);

        driver.findElement(By.id("about-link")).click();
        System.out.println("New page title is: " + driver.getTitle());
        assertEquals(driver.getTitle(), "About Training Support");
    }
}
