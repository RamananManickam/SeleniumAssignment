package week2.day3.feb01.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestleafEditLead {

	public static void main(String[] args) {
		// Setup the driver and launch
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ramanan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Manickam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Jel");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description as Computer Science");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jel@gmail.com");
		
		//  Select State/Province as NewYork Using Visible Text.
		WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateDropdown = new Select(stateElement);
        stateDropdown.selectByVisibleText("New York");
        
		//  Click on the Create Button.
        driver.findElement(By.name("submitButton")).click();
		//  Click on the edit button.
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//  Clear the Description Field.
        driver.findElement(By.id("updateLeadForm_description")).clear();
		//  Fill the Important Note Field with Any text.
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Computer Science as Note");
		//  Click on the update button.
        driver.findElement(By.name("submitButton")).click();
		//  Get the Title of the Resulting Page.
        System.out.println(driver.getTitle());
		//  Close the browser window.
        driver.close();
        
	}

}
