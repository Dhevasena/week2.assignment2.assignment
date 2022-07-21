package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// call webdriver manager
		WebDriverManager.chromedriver().setup();
		//Launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Open URL
		driver.get("https://www.zoomcar.com/in/bangalore");
		//Maximize
		driver.manage().window().maximize();
		//click the placeholder
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//div[contains(text(),'Pick Up City, Airport, Address or Hotel')]")).click();
	
	//First Suggested city
	driver.findElement(By.xpath("//h3[text()='Suggested Pick Up Locations']//following::div[2]")).click();
	
	//Click on Calendate date 
	driver.findElement(By.xpath("//div[@class='ride-time']/a")).click();
	
	//click on date twice
	driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
	
	driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
	
	//Click continue
	driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();	
	//Find cars
	driver.findElement(By.xpath("//button[contains(text(),'Find cars')]")).click();
	
	//Price of swift desire
	String element = driver.findElement(By.xpath("//h3[contains(text(),'Maruti Swift Dzire')]//following::div[@class='price-book-ctr']/div/div")).getText();
	System.out.println(element);
	}

}
