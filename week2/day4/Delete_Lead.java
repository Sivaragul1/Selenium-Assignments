package week2.day4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Delete_Lead {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Open Chrome browser in guest mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);
        //Load the URL
        driver.get("http://leaftaps.com/opentaps/");
        //Maximize the browser window
        driver.manage().window().maximize();

        //Enter a username and password
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        //Navigate
        driver.findElement(By.partialLinkText("SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();

        //Click on the "Phone" tab
        driver.findElement(By.linkText("Phone")).click();
        driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
        driver.findElement(By.name("phoneNumber")).sendKeys("6374279620");
        driver.findElement(By.linkText("Find Leads")).click();

        //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("12712")).click();

        //Click the "Delete" button
        driver.findElement(By.linkText("Delete")).click();

        //Click "Find leads" again
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys("12712");

        //Click the "Find leads" button
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.partialLinkText("Name and ID")).click();
        driver.findElement(By.name("id")).sendKeys("12712");
        WebElement findleads1=driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findleads1.click();

        //Close the browser driver.close();
        driver.close();

    }

}