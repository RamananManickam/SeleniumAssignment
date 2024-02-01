package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
	        
	        
	        // Handling Dropdown.
	        WebElement sourceWebElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
	        // Create an Oject for select class
	        Select sourceDropdown = new Select(sourceWebElement);
	        sourceDropdown.selectByIndex(4);
	        
	        System.out.println(sourceDropdown.getFirstSelectedOption().getText());
	        
	        WebElement marketCampgWebElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	        Select marketCampgDropdown = new Select(marketCampgWebElement);
	        marketCampgDropdown.selectByVisibleText("Automobile");
	                
	        WebElement ownershipWebElement = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	        Select ownershipDropdown = new Select(ownershipWebElement);
	        ownershipDropdown.selectByValue("OWN_CCORP");
	        
	        driver.findElement(By.name("submitButton")).click();
	        
	        String title = driver.getTitle();
	        System.out.println(title);
	        if(title.contains("View Lead | opentaps CRM")) {
	        	System.out.println("Page loaded sucessfully");
	        } else {
	        	System.out.println("Page loading failed");
	        }
	        
	        driver.close();
	}

}
