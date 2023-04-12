package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs");

        //driver.findElement(By.xpath("//*/span[@class = 'menu-toggle-icon']")).click();
        driver.findElement(By.partialLinkText("Jobs")).click();

        String pageTitle = driver.getTitle();
        System.out.println("Print Page Title:" + pageTitle);

        if(pageTitle.equals("Alchemy Jobs – Job Board Application")) {
            System.out.println("Page title is as expected");
            driver.close();
        }
        else
            System.out.println("Page title is not as expected");
    }
}
