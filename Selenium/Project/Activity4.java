package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs");

        String secondHead = driver.findElement(By.xpath("//*/div/h2")).getText();
        if(secondHead.equals("Quia quis non")) {
            System.out.println("Second Heading is same as expected");
            driver.close();
        }
        else
            System.out.println("Second Heading is not same as expected");

    }
}
