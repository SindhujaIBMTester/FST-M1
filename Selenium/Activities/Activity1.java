package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title:"+pageTitle);
        driver.findElement(By.id("about-link")).click();
        String newPageTitle =driver.getTitle();
        System.out.println("New Page Title:"+newPageTitle);
        Thread.sleep(2000);
        driver.close();
    }

    }
