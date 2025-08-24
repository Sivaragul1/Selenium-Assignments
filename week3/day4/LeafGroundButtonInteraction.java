package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();

        // Add an implicit wait to ensure the web page elements are fully loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click on the button with the text ‘Click and Confirm title‘
        driver.findElement(By.xpath("//span[text()='Click']")).click();

        // Verify that the title of the page is "dashboard"
        WebElement element = driver.findElement(By.className("route-bar-breadcrumb"));
        String text = element.getText();
        System.out.println(text);

        // back to main page
        driver.navigate().back();

        // Check if the button with the text ‘Confirm if the button is disabled‘ is disabled
        boolean isDisabled= driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
        System.out.println(isDisabled

        );

        // Find and print the position of the button with the text ‘Submit’
        WebElement el = driver.findElement(By.xpath("//span[text()='Submit']"));
        Point position = el.getLocation();
        int x = position.getX();
        int y = position.getY();
        System.out.println("Position X:"+x+" Position Y:"+y);

        // Find and print the background color of the button with the text ‘Find the Save button color’
        WebElement elem =driver.findElement(By.name("j_idt88:j_idt96"));
        String color = elem.getCssValue("background");
        System.out.println(color);

        // Find and print the height and width of the button with the text ‘Find the height and width of this button’
        WebElement eleme = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
        Rectangle button =eleme.getRect();
        Dimension dim =  button.getDimension();
        int height = dim.getHeight();
        int width =dim.getWidth();
        System.out.println("Height of the button is :"+height);
        System.out.println("Width of the button is :"+width);

        // Close the browser window
        driver.close();

    }

}