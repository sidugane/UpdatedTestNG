package ChildBrowsers;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingChildBrowserWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();
		
		
		//Selecting the Mobile option from the webpage
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click();
		
		driver.findElement(By.xpath("(//p[contains(text(),'Shop Now')])[1]")).click();
		//Secting Realme mobile phone
		
		driver.findElement(By.xpath("(//div[contains(text(),'realme 9 (Sunburst Gold, 128 GB)')])[1]")).click();
		
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allids);
		
		String mainwindow = al.get(0);
		String childwindow = al.get(1);
		
		System.out.println("Main window id is :"+mainwindow);
		System.out.println("Child window id is :"+childwindow);
		driver.switchTo().window(childwindow);
	
	driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
	driver.close();
	driver.switchTo().window(mainwindow);
	System.out.println("Test Pass");
	driver.quit();
	}

}
