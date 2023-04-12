package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9 {
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

        /** Click on jobs from left hand pane */
        driver.findElement(By.id("menu-posts-job_listing")).click();
        driver.findElement((By.xpath("//*/a[@class = 'page-title-action']"))).click();
        driver.findElement(By.id("post-title-0")).sendKeys("JobBoard-Automation");

        driver.findElement(By.xpath("//*/div[@class = 'edit-post-header__settings']/button[2]")).click();
        driver.findElement(By.xpath("//*/div[@class = 'editor-post-publish-panel']/div/div/button")).click();
        driver.findElement(By.xpath("//*/div[@class = 'post-publish-panel__postpublish-buttons']/a")).click();

        String publishedJob = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")).getText();
        if(publishedJob.equals("JobBoard-Automation"))
            System.out.println("Job is Published");
        else
            System.out.println("Job is not published");

    }
}
