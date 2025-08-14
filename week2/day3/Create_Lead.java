package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Lead {


	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options); //Initialize the Webdriver(ChromeDriver)
		driver.get("http://leaftaps.com/opentaps/control/main");// load  the Url
		driver.manage().window().maximize();// Maximize the browser window.
		driver.getTitle();

		//Login
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Navigate through links
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		// Fill in account details
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Siva"); 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ragul");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
		
		//Click the "Create Lead" button.
				driver.findElement(By.name("submitButton")).click();
		
		//Enter a Title . 
		String title = driver.getTitle();
		//Print theTitle.
		System.out.println(title);
		//Close the browser window.
		driver.close();

	}
}