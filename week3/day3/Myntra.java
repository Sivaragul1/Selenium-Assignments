package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.className("desktop-searchBar")).sendKeys("bags",Keys.ENTER);

        driver.findElement(By.xpath("//input[@type='radio']/parent::label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@value='Laptop Bag']/parent::label)[1]")).click();
        Thread.sleep(2000);
        List<WebElement> bags=driver.findElements(By.xpath("//h4[@class='product-product']"));
        List<WebElement> bagName=driver.findElements(By.xpath("//h3[@class='product-brand']"));
        int size = bags.size();
        System.out.println(size);

        WebElement name = bags.get(3);
        String brandName = name.getText();
        System.out.println(brandName);

        WebElement name1=bagName.get(5);
        String nameOfBag=name1.getText();
        System.out.println(nameOfBag);

        List<String> productlist=new ArrayList<String>();
        for (WebElement each : bags) {
            String productName= each.getText();

            productlist.add(productName);
        }
        System.out.println(productlist);
        List<String> productName=new ArrayList<String>();
        for (WebElement each : bagName) {
            String productName1= each.getText();

            productName.add(productName1);
        }
        System.out.println(productName);

    }

}