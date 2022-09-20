package co.testngpractice;

import org.testng.annotations.Test;

//Adding priority to the test cases

public class AddingPriorities {

	@Test(priority=4)
	public void Test1()
	{
		System.out.println("This is Test1--Priority-4");
	}
	@Test(priority=3)
	public void Test2()
	{
		System.out.println("This is Test2--Priority-3");
	}
	
	
	@Test(priority=2)
	public void Test3()
	{
		System.out.println("This is Test3--Priority-2");
	}
	
	@Test(priority=1)
	public void Test4()
	{
		System.out.println("This is Test4--Priority-1");
	}
}
