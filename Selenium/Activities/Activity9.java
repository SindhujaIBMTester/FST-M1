package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/ajax");
        System.out.println("Title:" + driver.getTitle());
        driver.findElement(By.xpath("//*/button[@class = 'ui violet button']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div/h1")));

        System.out.println("Text Initial value:"+driver.findElement(By.xpath("//*/div/h3")).getText());
        System.out.println("Text final value:"+driver.findElement(By.xpath("//*/div/h3")).getText());

        driver.close();
    }
}
