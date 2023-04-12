package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        /** Open the URL */
        driver.get("https://alchemy.hguy.co/jobs");
        /** Click on Post a job */
        driver.findElement(By.xpath("//*/li[3]/a")).click();
        /**Enter mandatory details */
        driver.findElement(By.id("create_account_email")).sendKeys("Java@gmail.com");
        driver.findElement(By.id("job_title")).sendKeys("JavaAutomation Tester");
        Select jobType = new Select(driver.findElement(By.name("job_type")));
        jobType.selectByVisibleText("Full Time");
        driver.findElement(By.id("job_description_ifr")).sendKeys("JavaTesting Jobs");
        driver.findElement(By.id("application")).sendKeys("JavaTestingJobs@gmail.com");
        driver.findElement(By.id("company_name")).sendKeys("JavaTesting");

        driver.findElement(By.xpath("//*/input[@value='Preview']")).click();

        driver.findElement(By.id("job_preview_submit_button")).click();

        /** Click on jobs */
        driver.findElement(By.xpath("//*/div[@class = 'main-navigation']/ul/li[1]/a")).click();
        /**Enter the search value */
        driver.findElement(By.id("search_keywords")).sendKeys("JavaTesting");

        /** Click on search button */
        driver.findElement(By.xpath("//*/input[@value= 'Search Jobs']")).click();

        String textVal = driver.findElement(By.xpath("//*/ul/li/a/div/div")).getText();
        if(textVal.equals("JavaTesting"))
            System.out.println("Job is listed");
        else
            System.out.println("Job is not listed");

        driver.close();
    }

}
