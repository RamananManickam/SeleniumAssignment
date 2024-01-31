package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// Setup the driver and launch
		ChromeDriver driver = new ChromeDriver();
		
		// Setup the driver and launch Edge
		//EdgeDriver edgeDriver = new EdgeDriver();
		
		// Setup the driver and launch Firefox
		//FirefoxDriver firefoxDriver = new FirefoxDriver();
		
		//Load the url
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CITI");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramanan");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manickam");
        driver.findElement(By.name("submitButton")).click();
		//driver.get("https://www.flipkart.com/");
	}

}
