package pom_ddf_testng_withmandetoryclass;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter
{
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test Passed");
	}
	public void onTestfailure(ITestResult tr)
	{
		System.out.println("Test Failed");
	}
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test Skipped");
	}
}
