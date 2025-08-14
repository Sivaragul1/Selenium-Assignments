package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Account {

    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Set Chrome options (guest mode)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");

        // Launch Chrome
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the website
            driver.get("http://leaftaps.com/opentaps/");
            driver.manage().window().maximize();

            // Login
            driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
            driver.findElement(By.id("password")).sendKeys("crmsfa");
            driver.findElement(By.className("decorativeSubmit")).click();

            // Navigate through links
            driver.findElement(By.partialLinkText("SFA")).click();
            driver.findElement(By.partialLinkText("Accounts")).click();
            driver.findElement(By.partialLinkText("Create")).click();

            // Fill in account details
            driver.findElement(By.id("accountName")).sendKeys("Siva Ragul");
            driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
            driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
            driver.findElement(By.id("numberEmployees")).sendKeys("1");

            // Submit form
            driver.findElement(By.className("smallSubmit")).click();

            // Print page title
            String title = driver.getTitle();
            System.out.println("Page Title: " + title);

        } catch (Exception e) {
            e.printStackTrace();  // Optional: print exception for debugging
        } finally {
            // Always close the browser
            driver.quit();
            //Thread.sleep(1000);
        }
    }
}
