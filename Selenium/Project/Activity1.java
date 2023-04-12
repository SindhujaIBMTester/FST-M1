package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity1 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs");
        String pageTitle = driver.getTitle().substring(0,12);
        System.out.println("Page Title:"+pageTitle);
        String pagetitleEql = driver.findElement(By.xpath("//*/div[@itemscope = 'itemscope']/div/h1")).getText();
        System.out.println("Page Title Equal:"+pagetitleEql);
        if(pageTitle.equals(pagetitleEql)) {
            System.out.println("Title is equal");
            driver.close();
        }
        else
            System.out.println("Title is not equal");



    }
}
