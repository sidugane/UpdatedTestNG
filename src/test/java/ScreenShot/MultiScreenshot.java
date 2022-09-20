package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiScreenshot {
	WebDriver driver;
	@BeforeMethod
	@Test(description="Screenshot of complete web page",priority=1)
	public void screen() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(".\\Screenshots\\Homepage.png");
			FileUtils.copyFile(src, dest);
			
	}
	
	@Test(description="Capturing the screenshot of the logo",priority=3)
	public void logo() throws IOException
	{
	WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\logo.png");
		FileHandler.copy(src, trg);
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
		System.out.println("Teardown completed...");
	}
	
	@Test(description="Section screenshot",priority=2)
	public void screenshotofSectionInapage() throws IOException
	{
			
		WebElement pagesection = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src=pagesection.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\Section.png");
		FileHandler.copy(src, dest);
		
		
	}
	
	@Test(enabled=false,description="Specific WebElements Screenshot",priority=4)
	public void specificwebelement() throws IOException
	{
	
			
		WebElement logo = driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File dest=new File("Logo.png");
		FileHandler.copy(src, dest);
	}
	
}
