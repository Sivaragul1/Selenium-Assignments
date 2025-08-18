package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest"); // Use incognito

        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        //Navigate
        driver.findElement(By.partialLinkText("SFA")).click();
        driver.findElement(By.partialLinkText("Leads")).click();
        driver.findElement(By.partialLinkText("Create")).click();

        // Fill
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("STQC");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Siva");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ragul");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Siva");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Testing");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Engineer");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Engineer");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testuser@gmail.com");

        // Select dropdown values
        WebElement selDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select dropdown = new Select(selDD);
        dropdown.selectByVisibleText("New York");

        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();

        WebElement desc = driver.findElement(By.id("updateLeadForm_description"));
        desc.clear();
        desc.sendKeys("Selenium Learner");

        driver.findElement(By.className("smallSubmit")).click();

        String title = driver.getTitle();
        System.out.println("Page Title After Edit: " + title);

        driver.quit(); // close the browser
    }
}
