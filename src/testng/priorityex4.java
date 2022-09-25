package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityex4
{

	@Test(priority=1)
	public void c1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test(priority=1)
	public void a1()
	{
		Reporter.log("Running test case 2",true);
}}
