package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        /** Open the URL */
        driver.get("https://alchemy.hguy.co/jobs");
        /** Click on jobs */
        driver.findElement(By.xpath("//*/li[1]/a")).click();
       // driver.wait(2000);
        /**Enter the search value */
        driver.findElement(By.id("search_keywords")).clear();
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");

        /** Click on search button */
        driver.findElement(By.xpath("//*/input[@type = 'submit']")).click();
        /** Click on any one search value */
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div[@class = 'job_listings']/ul/li[1]/a/div"))).click();
        //driver.findElement(By.xpath("//*/div[@class = 'job_listings']/ul/li[1]/a/div")).click();
        /** Apply for the job */
        driver.findElement(By.xpath("//*/input[@value = 'Apply for job']")).click();
        /**Print email to console */
        System.out.println("Printing email to console:"+driver.findElement(By.xpath("//*/div/p/a")).getText());
        /** Close the browser */
        driver.close();

    }
}
