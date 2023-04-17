package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title:" + driver.getTitle());

        Actions builder = new Actions(driver);

        builder.click().pause(2000).build().perform();
        System.out.println("Print left click:"+driver.findElement(By.className("active")).getText());

        builder.contextClick().pause(3000).build().perform();
        System.out.println("Print Right click:"+driver.findElement(By.className("active")).getText());

        // Close the browser
        driver.close();
    }
}
