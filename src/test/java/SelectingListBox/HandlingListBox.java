package SelectingListBox;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingListBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

			driver.get("file:///D:/HTML%20Programs/SelectList.html");
			
			WebElement Month = driver.findElement(By.xpath("//select[@id=456]"));
			
			Select s1=new Select(Month);
		//Printing all values from the list box
	List<WebElement> allitems = s1.getOptions();
	for(WebElement all:allitems)
	{
		System.out.println(all.getText());
	}
	
	Thread.sleep(10000);
	s1.selectByVisibleText("Jun");
	System.out.println(s1.isMultiple());
	
			driver.close();
	}

}
