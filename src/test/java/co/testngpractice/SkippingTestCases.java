package co.testngpractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTestCases {
	
	
	
	boolean strings=true;

	@Test(enabled=false ) //2
	public void Test1()
	{
		
		System.out.println("This is Test1");
		
	}
	
	
	
	@Test //1
	public void Test2()
	{
		System.out.println("This is Test2");
		throw new SkipException("Forcefully skipping test 2");
	}
	
	@Test(enabled=true )  //4
	public void Test3() throws Exception
	{
		System.out.println("This is Test3");
		
	}
	
	
	@Test(priority=3) //3
	public void Test4()
	{
		System.out.println("This is Test4");
		
		if(strings==true)
			
		{
			System.out.println("Test case 4 is running--strings are enabled");
		}
		else
		{
			System.out.println("This Test case 4 is not running--strings are false");
			
		}
	}
}
