package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Signup {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Web driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://en-gb.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(2000);

        //Title
        String title=driver.getTitle();
        System.out.println(title);

        //Fill Details
        driver.findElement(By.name("firstname")).sendKeys("Siva");
        driver.findElement(By.name("lastname")).sendKeys("Ragul");
        driver.findElement(By.name("reg_email__")).sendKeys("testuser@example.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@1234");

        // Date of birth dropdowns
        new Select(driver.findElement(By.id("day"))).selectByVisibleText("10");
        new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jan");
        new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");

        // Gender radio button
        driver.findElement(By.xpath("//label[text()='Male']")).click();

        // Optional: Close browser
        driver.quit();
    }
}
