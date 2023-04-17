package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("Title:" + driver.getTitle());

        Actions builder = new Actions(driver);
        builder.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).pause(1000).release().build().perform();
        builder.clickAndHold(driver.findElement(By.id("droppable"))).moveToElement(driver.findElement(By.id("dropzone2"))).pause(1000).release().build().perform();

        driver.close();


    }
}
