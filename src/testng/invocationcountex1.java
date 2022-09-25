package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcountex1 
{


	@Test(invocationCount=2)
	public void c1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test(invocationCount=2)
	public void c2()
	{
		Reporter.log("Running test case 2",true);
	}
}
