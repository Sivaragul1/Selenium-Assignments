package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Select 'Your most favourite browser' from the radio buttons
        WebElement button = driver.findElement(By.xpath("(//div[@class ='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[9]"));
        driver.executeScript("arguments[0].click();",button);

        // Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’
        WebElement select = driver.findElement(By.xpath("(//div[@class ='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[12]"));
        driver.executeScript("arguments[0].click();",select);

        WebElement deselect = driver.findElement(By.xpath("(//div[@class ='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[12]"));
        driver.executeScript("arguments[0].click();",deselect);

        // Identify the radio button that is initially selected by default
        WebElement verify =driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]"));
        verify.click();

        System.out.println(verify.isEnabled());

        // Check and select the age group (21-40 Years) if not already selected.
        WebElement verif = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[5]"));
        verif.click();

        System.out.println(verif.isSelected());

        // close the browser
        driver.quit();

    }

}