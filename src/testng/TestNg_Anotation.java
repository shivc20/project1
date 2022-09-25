package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Anotation 
{

	@BeforeSuite
	public void browserconfigure()
	{
		Reporter.log("browser setting",true);
	}
	//Always Execute First (i.e before all the methods/classes)
	@BeforeTest     
	public void browserwindowsetting()
	{
		Reporter.log("code for maximizing",true);
	}
//	It is use for execution of test method before execution of test class
	@BeforeClass
	public void openapplication()
	{
		Reporter.log("Opening an application",true);
	}
//	It is use for execution of test method before execution of every test method with an annotation @Test
	@BeforeMethod
	public void login()
	{
		Reporter.log("user login successfully",true);
	}
//	Use for execution of test method/TC.
	@Test
	public void testcase1()
	{
		Reporter.log("Test case 1 executing for user verification",true);
	}
//	- It is use for execution of test method after execution of every test method with an annotation @Test.
	@AfterMethod
	public void logout()
	{
		Reporter.log("user logout successfully",true);
	}
	
	@Test
	public void testcase2()
	{
		Reporter.log("Test case 2 executing for grosaries",true);
	}
//	 It is use for execution of test method after execution of test class.
	@AfterClass
	public void closeapplication()
	{
		Reporter.log("closing application",true);
	}
//	Always Execute Last (i.e after all the methods/classes)
	@AfterTest
	public void closingbrowser()
	{
		Reporter.log("Closing browser",true);
	}
//	
	@AfterSuite
	public void browserchange()
	{
		Reporter.log("browser changing",true);
	}


}
