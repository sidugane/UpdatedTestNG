package Test;

import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertion {

	@Test
	@SuppressWarnings("deprecation")
	public void tc1()
	{
		String actResult="Hi"; 
		String expResult="Hello";
		Assert.assertEquals(actResult, expResult,"Failed-Both strings are different");
		
		/* if both strings are equal then it will not throw the exception, but if results are not
		 same then it will throw an exception*/
	}
	@Test
	public void tc2()
	{
		
	}
	
	
	@Test
	public void tc3()
	{
		
	}
	
}
