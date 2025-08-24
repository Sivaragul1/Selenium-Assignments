package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/checkbox.xhtml");
        driver.manage().window().maximize();

        // Add an implicit wait to ensure the web page elements are fully loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click on the "Basic Checkbox"
        driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();

        // Click on the "Notification Checkbox"
        driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();

        // Verify that the expected message is displayed
        WebElement el = driver.findElement(By.xpath("//span[text()='Checked']"));
        String get = el.getText();
        System.out.println(get);

        // Click on your favorite language (assuming it's related to checkboxes)
        driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();

        // Click on the "Tri-State Checkbox"
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();

        // Verify which tri-state option has been chosen
        WebElement element = driver.findElement(By.xpath("//span[text()='State has been changed.']"));
        String text1=element.getText();
        System.out.println(text1);

        // Click on the "Toggle Switch"
        driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();

        // Verify that the expected message is displayed
        WebElement eleme = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
        String text2 = eleme.getText();
        System.out.println(text2);

        // Verify if the Checkbox is disabled.
        WebElement ele = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
        String text = ele.getText();
        System.out.println(text);

        // Select multiple options on the page (details may be needed)
        driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();

        // select london
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();

        // select istanbull
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();

        // select Barcelona
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[9]")).click();

        // select multi options button
        driver.findElement(By.id("layout-config-button")).click();

        // select menu color as dark
        driver.findElement(By.xpath("//label[text()='Dark']")).click();

        // Close the web browser when done
        driver.close();

    }

}
