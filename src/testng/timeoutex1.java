package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeoutex1
{


	@Test
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test(timeOut=5000)
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(timeOut=5000)
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}
}
