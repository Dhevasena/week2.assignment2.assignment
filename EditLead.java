package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
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
				//Click on CRM/SFS
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Click Create lead link
				driver.findElement(By.linkText("Create Lead")).click();
				//Enter Company Name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
				//Enter first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhevasena");
				//Enter Surname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravikumar");
				//Enter the Firstname Local
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dhevasena");
				//Enter the department
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer science");
				//Enter the Description
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead of Computer science department");
				//Enter the Email
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhevasnkr@gmail.com");
				//Select the province
				WebElement element2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				//convert to select
				Select select1=new Select(element2);
				select1.selectByVisibleText("New York");
		        //Submit
				driver.findElement(By.className("smallSubmit")).click();
				//Page title
				String title = driver.getTitle();
				//Print title
				System.out.println(title);
		        //Click on Duplicate button
				driver.findElement(By.linkText("Duplicate Lead")).click();
				//Clear the CompanyName Field using .clear() And Enter new CompanyName
				//Enter Company Name
						 WebElement element3 = driver.findElement(By.id("createLeadForm_companyName"));
						 element3.clear();
						 element3.sendKeys("Google");
						//Enter first name
						WebElement element4 = driver.findElement(By.id("createLeadForm_firstName"));
						element4.clear();
						element4.sendKeys("Dhevasena");
						//Enter Surname
						WebElement element5 = driver.findElement(By.id("createLeadForm_lastName"));
						element5.clear();
						element5.sendKeys("Ravikumar");
						//Submit
						driver.findElement(By.className("smallSubmit")).click();
						//Page title
						String title2 = driver.getTitle();
						//Print title
						System.out.println(title2);

	}

}
