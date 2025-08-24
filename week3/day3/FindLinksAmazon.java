package week3.day3;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindLinksAmazon {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofDays(20));
    }
}
