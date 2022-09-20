package crossbrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifytitle(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sid\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Sid\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	

}
