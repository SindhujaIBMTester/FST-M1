package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title:" + pageTitle);

        String headerText = driver.findElement(By.xpath("//*/h1[@class = 'entry-title']")).getText();
        if (headerText.equals("Welcome to Alchemy Jobs")) {
            System.out.println("Heading of the Webpage is as expected");
            driver.close();
        }
    }
}
