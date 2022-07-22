package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// call webdriver manager
		WebDriverManager.chromedriver().setup();
		//Launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Open URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize
		driver.manage().window().maximize();
		//find and Enter Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//find and Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Check Correct Page
		WebElement webElemen = driver.findElement(By.className("decorativeSubmit"));
		//get attribute and print it
		String attribute = webElemen.getAttribute("value");
		//Print the attribute
		System.out.println(attribute);
		if(attribute.equalsIgnoreCase("logout"));
		//print if it is successful login
		System.out.println("Logged in successfully");
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//click on Find Leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//Click on Phone
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//Enter the phone number
		driver.findElement(By.id("ext-gen262")).clear();
		driver.findElement(By.id("ext-gen262")).sendKeys("1");
		driver.findElement(By.id("ext-gen266")).sendKeys("12");
		driver.findElement(By.id("ext-gen270")).sendKeys("9655664166");
//		10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		11	Capture lead ID of First Resulting lead
		Thread.sleep(3000);
		String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).getText();
		System.out.println("The first resulting lead id is:"+leadID);
//		12	Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
//		13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
//		14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//		15	Enter captured lead ID
		driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadID);
//		16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		Thread.sleep(3000);
		 String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if (message.equals("No records to display")) {
			System.out.println("The lead is deleted");	
		}
		else {
			System.out.println("The lead is not deleted");
		}
//		18	Close the browser (Do not log out)
		driver.quit();
		
		
	}
}