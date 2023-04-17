package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/target-practice");
        System.out.println("Title:" + driver.getTitle());
        System.out.println("Third Header title:" + driver.findElement(By.xpath("//h3[text()= \"Third header\"]")).getText());

        System.out.println("Fifth Header Color:" + driver.findElement(By.xpath("//h5[text()= \"Fifth header\"]")).getCssValue("color"));

        System.out.println("Violet Button Class:" + driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class"));
        System.out.println("Grey button text:" + driver.findElement(By.xpath("//button[text()='Grey']")).getText());

        driver.close();
    }
}
