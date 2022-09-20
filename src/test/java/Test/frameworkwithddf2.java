package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameworkwithddf2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileInputStream file=new FileInputStream("D:\\Test.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
				
		Thread.sleep(2000);
		
		driver.get("https://kite.zerodha.com/");

		//enter UN:
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		//enter pwd:
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
			
		//click on login btn:
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
				
		//enter pin:
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
		
		//click on cnt btn:
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		Thread.sleep(5000);
		//Alert alt = driver.switchTo().alert();
		//alt.dismiss();
		//String str = alt.getText();
		//System.out.println(str);
		//driver.switchTo().defaultContent();	
		
			
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expUserID = sh.getRow(0).getCell(3).getStringCellValue();
		
		
		if(actUserID.equals(expUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
			
		Thread.sleep(3000);
		
		driver.close();
			
	}

}
