package testng;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;
public class softassert
{
	@Test
public void m1()
{
	SoftAssert s=new SoftAssert();
	
	String actualstr="Velocity";
	String expectedstr="Velocity1";
	s.assertEquals(actualstr,expectedstr);
	
	String actualstr1="Velocity";
	String expectedstr1="Velocity1";
	s.assertNotEquals(actualstr1,expectedstr1);
	
	boolean actual=true;
	s.assertFalse(actual);
	
	boolean actual1=true;
	s.assertTrue(actual1);
	s.assertAll();
}

}
