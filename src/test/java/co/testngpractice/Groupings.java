package co.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groupings {

	
	//TestNG Groupings
	
	@BeforeMethod
	public void Test1()
	{
		System.out.println("This is Before Method");
	}
	@BeforeClass
	public void Test2()
	{
		System.out.println("This is Before Class");
	}
	@Test(groups="regression") //Regression Group
	public void mytest1()
	{
		System.out.println("This is my test demo1");
	}
	
	@Test(groups={"regression","bvt"})//Regression & bvt group
	public void mytest2()
	{
		System.out.println("This is my test demo2");
	}
	
	@Test(groups={"regression","bvt"})//Regression & bvt group
	public void mytest3()
	{
		System.out.println("This is my test demo3");
	}
	
	
	@Test(groups="Sanity") //Sanity Group
	public void mytest4()
	{
		System.out.println("This is my test demo4");
	}
	
	
	@AfterClass
	public void Test3()
	{
		System.out.println("This is After Class");
	}
	
	@AfterMethod
	public void Test4()
	{
		System.out.println("This is AfterMethod");
	}
	
	
	
}
