package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		        // call webdriver manager
				WebDriverManager.chromedriver().setup();
				//Launch chrome browser
				ChromeDriver driver=new ChromeDriver();
				//Open URL
				driver.get("https://en-gb.facebook.com/");
				//Maximize
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			    //click on creaate account
				driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
				//Enter the first name
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dhevas");
				//Enter the last name
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ravi");
				//Enter the mobile number
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9038492384");
				//Enter the password
				driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ruthika$14");
				//select Day
				WebElement element = driver.findElement(By.id("day"));
				Select select=new Select(element);
				select.selectByVisibleText("25");
				//select Month
				WebElement element2 = driver.findElement(By.id("month"));
				Select select1=new Select(element2);
	            select1.selectByVisibleText("Mar");
	            WebElement element3 = driver.findElement(By.id("year"));
	            Select select2=new Select(element3);	
	            select2.selectByVisibleText("1989");
	            //select the radio button
	            driver.findElement(By.xpath("//input[@name='sex']")).click();
	            //Click on Sign upButton
	            driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	            //check successful login
	            String  title = driver.getTitle();
	            System.out.println(title);
	}

}
