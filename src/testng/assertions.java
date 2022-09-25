package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions
{

	//in assertion/hard assert class all methods are static
	
//	@Test(enabled=false)
//	public void m1()
//	{
//		String actualResult="Good Morning";
//		String expectedResult="Good Morning";
//		Assert.assertEquals(actualResult,expectedResult);
//	}

//	@Test(enabled=false)
//	public void m2()
//	{
//		String actualResult="Good Morning";
//		String expectedResult="Good Mornin";
//		Assert.assertEquals(actualResult,expectedResult,"Failed:both results are not matching");
//	}
	
	//this is for multiple verification in single method to check that if one of the verificatin get failed 
  //then remainig verification passed or not//
	@Test
	public static void m3()
	{
		String actualResult="Good Morning";
		String expectedResult="Good Mornin";
		Assert.assertEquals(actualResult,expectedResult);
		boolean actualResult1=false;
		Assert.assertFalse(actualResult1);
		String actualResult2=null;
		Assert.assertNull(actualResult2);
	}
//	@Test
//	public void m4()
//	{
//		boolean actualResult=true;
//		Assert.assertTrue(actualResult);
//	}
	@Test
	public static void m5()
	{
		boolean actualResult=false;
		Assert.assertFalse(actualResult);
	}
//	@Test(enabled=false)
//	public void m6()
//	{
//		String actualResult=null;
//		Assert.assertNull(actualResult);
//	}
	@Test
	public static void m7()
	{
		String actualResult="Good Morning";
		Assert.assertNotNull(actualResult);
	}
}
