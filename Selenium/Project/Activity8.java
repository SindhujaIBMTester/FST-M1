package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        /** Open the URL */
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        /** Enter Credentials and login */
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

        driver.findElement(By.id("wp-submit")).click();

        /** Verify login */
        String username = driver.findElement(By.xpath("//*/ul[2]/li/a/span[@class = 'display-name']")).getText();
        if (username.equals("root"))
            System.out.println("Logged in as Root");
        else
            System.out.println("Logged in as another user");

        driver.close();
    }
}
