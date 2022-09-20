package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggesion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).click();
		//driver.switchTo().alert().dismiss();
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='mkHrUc']//div[@role='presentation']//li[@role='presentation']//span"));
		Thread.sleep(3000);
		System.out.println("Size of Auto Suggesion : "+list.size());
		
		for(WebElement Listitems:list)
		{
			if(Listitems.getText().contains("download"))
			{
				Listitems.click();
				break;
			}

		}
		
		driver.close();
	}

}
