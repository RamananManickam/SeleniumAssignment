package week2.day3.feb01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXPath {

	public static void main(String[] args) {
		// Setup the driver and launch
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
	}

}
