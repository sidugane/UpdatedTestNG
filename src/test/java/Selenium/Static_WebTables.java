package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_WebTables {
	WebDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/ecosystem/");
	}
	
	@Test
	public void static_table()
	{
		int row = driver.findElements(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']/tbody/tr")).size();
		System.out.println("No.rows :"+row);
		int cols = driver.findElements(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']/thead/tr/th")).size();
		System.out.println("No.cols :"+cols);
		
		
		String Name = driver.findElement(By.xpath("(//div[@class='row justify-content-center p-5'])[1]//tbody//tr[1]//th[1]")).getText();
		
		System.out.println("Name :"+Name);
		
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String data = driver.findElement(By.xpath("(//div[@class='row justify-content-center p-5'])[1]//tbody//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.println(data);
			}
		}
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
	
}
