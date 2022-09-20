package ChildBrowsers;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingChildBrowserWindows2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> allids = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(allids);
		
		String mainwindow = al.get(0);
		String childwindow = al.get(1);
		
		System.out.println("Main Window id : "+mainwindow);
		System.out.println("Child Window id : "+childwindow);
		
		driver.switchTo().window(childwindow);
		
		Thread.sleep(2000);
		WebElement training = driver.findElement(By.xpath("//span[text()='Training'][1]"));
		System.out.println(training.getText());
		
		String actual = training.getText();
		training.click();
		
		if(actual.equalsIgnoreCase("Training"))
		{
			System.out.println("Test is successful");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.quit();

	}

}
