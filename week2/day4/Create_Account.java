package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {
    public static void main(String[] args) {

        // Setup Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);

        // URL and maximize
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Navigate
        driver.findElement(By.partialLinkText("SFA")).click();
        driver.findElement(By.partialLinkText("Accounts")).click();
        driver.findElement(By.partialLinkText("Create")).click();

        // Fill
        driver.findElement(By.id("accountName")).sendKeys("Siva Ragul");
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.id("numberEmployees")).sendKeys("1");

        // Select dropdown values
        WebElement selDD=driver.findElement(By.name("industryEnumId"));
        Select ss = new Select(selDD);
        ss.selectByIndex(3);

        WebElement selDD1=driver.findElement(By.name("ownershipEnumId"));
        Select ss1 = new Select(selDD1);
        ss1.selectByVisibleText("S-Corporation");

        WebElement selDD2=driver.findElement(By.id("dataSourceId"));
        Select ss2 = new Select(selDD2);
        ss2.selectByValue("LEAD_EMPLOYEE");

        WebElement selDD3=driver.findElement(By.id("marketingCampaignId"));
        Select ss3 = new Select(selDD3);
        ss3.selectByIndex(6);

        WebElement selDD4=driver.findElement(By.id("generalStateProvinceGeoId"));
        Select ss4 = new Select(selDD4);
        ss4.selectByValue("TX");

        // Submit the form
        driver.findElement(By.className("smallSubmit")).click();

        // Print title for confirmation
        System.out.println("Page Title After Account Creation: " + driver.getTitle());

        // Close the browser
        //driver.quit();
    }
}
