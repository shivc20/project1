package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failedtestmethod
{
	@Test(priority=3)
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test(priority=1)
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(priority=2)
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}
	//we have to make this test case failed so that thread and time out we have used
	@Test(priority=3, timeOut=3000)
	public void m4() throws InterruptedException
	{
		Thread.sleep(4000);
		Reporter.log("Running test case 1",true);
	}
	
	//we have to make this test case failed so that assert.fail we have used
	@Test(priority=1)
	public void m5()
	{
		Assert.fail();
		Reporter.log("Running test case 2",true);
	}
	
	@Test(priority=2)
	public void m6()
	{
		Reporter.log("Running test case 3",true);
	}

	
}
