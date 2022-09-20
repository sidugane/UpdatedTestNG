package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	WebDriver driver;
	
	@BeforeMethod(description="Lanunching the browser")
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod(description="Closing the all windows")
	public void teardown()
	{
		driver.quit();
	}
	
	
	//Test--1
	//Locators--ID,NAME and XPATH
	
	@Test
	public void locator()
	{
	WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("Admin");
			
	WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		//Click on Login Button
		
		WebElement Login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Login.click();
		
		WebElement actual = driver.findElement(By.xpath("//a[normalize-space()='Employee List']"));
		String acttext = actual.getText();
		if(acttext.equals("Employee List"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
	}
	
	
}
