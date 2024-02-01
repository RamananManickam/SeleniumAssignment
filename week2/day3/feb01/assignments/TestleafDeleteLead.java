package week2.day3.feb01.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestleafDeleteLead {

	public static void main(String[] args) {
		// Setup the driver and launch
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        // Click on the "Phone" tab.
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        // Enter the phone number.
        driver.findElement(By.name("phoneNumber")).sendKeys("100");
        // Click the "Find leads" button.
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //  Capture the lead ID of the first resulting lead.
        String firstLeadId = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
        System.out.println("First LeadId : " + firstLeadId);
        //  Click the first resulting lead.
        try {
        	driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
        	driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		}
        
        //  Capture the lead ID of the first resulting lead.
        String leadString = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        String aa = "asdasdasd (1234)";
		int fIndex = leadString.indexOf("(");
		int lIndex = leadString.indexOf(")");
		String firstLead = leadString.substring(fIndex+1, lIndex);
        
        System.out.println("First LeadId : " + firstLead);
        
        
        //  Click the first resulting lead.
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        
        // Click "Find leads" again
        driver.findElement(By.linkText("Find Leads")).click();
        
        // Enter the captured lead ID.
        driver.findElement(By.name("id")).sendKeys(firstLead);
        
        // Click the "Find leads" button.
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        // Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
        WebElement verificationElement = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
        String deletedLeadId = verificationElement.getText();
        System.out.println(deletedLeadId);
        System.out.println(deletedLeadId == "No records to display");
        System.out.println(deletedLeadId.equals("No records to display"));
        if(deletedLeadId.contains("No records to display")) {
        	System.out.println("Lead Id deleted successfully");
        	//driver.close();
        } else {
        	System.out.println("Lead Id not deleted");
        }
	}

}
