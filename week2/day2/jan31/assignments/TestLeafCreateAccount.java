package week2.day2.jan31.assignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafCreateAccount {

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
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Rammmm");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        // Select "ComputerSoftware" as the industry.
        WebElement industryElement = driver.findElement(By.name("industryEnumId"));
        Select industryDropdown = new Select(industryElement);
        industryDropdown.selectByIndex(3);
        
        // Select "S-Corporation" as ownership using SelectByVisibleText.
        WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
        Select ownershipDropdown = new Select(ownershipElement);
        ownershipDropdown.selectByVisibleText("S-Corporation");
        
        // Select "Employee" as the source using SelectByValue
        WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
        Select sourceDropdown = new Select(sourceElement);
        sourceDropdown.selectByValue("LEAD_EMPLOYEE");
        
        // Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
        WebElement campaignElement = driver.findElement(By.id("marketingCampaignId"));
        Select campaignDropdown = new Select(campaignElement);
        campaignDropdown.selectByIndex(6);
        
        // Select "Texas" as the state/province using SelectByValue.
        WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select stateDropdown = new Select(stateElement);
        stateDropdown.selectByValue("TX");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        // Verify that the account name is displayed correctly
        List<WebElement> outputElementsList = driver.findElements(By.className("tabletext"));
        
        for (Iterator<WebElement> iterator = outputElementsList.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			if (webElement.getText().contains("Rammmm")) {
				System.out.println("Account Name Exists !");
				break;
			} else {
				System.out.println("Account Name Not Exists !");
			}
		}
	}

}
