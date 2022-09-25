package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions
{

	

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

	@Test
	public static void m5()
	{
		boolean actualResult=false;
		Assert.assertFalse(actualResult);
	}

	public static void m7()
	{
		String actualResult="Good Morning";
		Assert.assertNotNull(actualResult);
	}
}
