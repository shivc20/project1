package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethodsex1 
{
	@Test(dependsOnMethods= {"m2"})
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
//	@Test
//	public void m3()
//	{
//		Reporter.log("Running test case 3",true);
//	}

}
