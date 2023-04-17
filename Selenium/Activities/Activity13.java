package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/tables");
        System.out.println("Home page title: " + driver.getTitle());

        List<WebElement> rowLength = driver.findElements(By.xpath("//*/table[@class = 'ui celled striped table']/tbody/tr"));
        System.out.println("Number of Rows:"+rowLength.size());

        List<WebElement> colLength = driver.findElements(By.xpath("//*/table[@class = 'ui celled striped table']/tbody/tr[1]/td"));
        System.out.println("Number of Columns:"+colLength.size());

        List<WebElement> thirdVal = driver.findElements(By.xpath("//*/table/tbody/tr[3]"));
        System.out.println("Print length of thirdVal:"+thirdVal.size());
        for(int i = 1;i< thirdVal.size();i++) {
            System.out.println("Print third row and column values:"+driver.findElement(By.xpath("//*/table/tbody/tr[3]/td["+i+"]")).getText());
        }

        System.out.println("Print second column value:"+driver
                .findElement(By.xpath("//*/table/tbody/tr[2]/td[2]")).getText());

        driver.close();


    }
}
