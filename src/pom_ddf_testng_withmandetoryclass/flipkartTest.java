package pom_ddf_testng_withmandetoryclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkartTest extends base_class
{
	
	 
	 Flipkarthome_page  hp;
	 Flipkart_loginpage lp;
	 XSSFSheet sh;
	 
	 
	 @BeforeClass
		public void opnapp() throws IOException, InterruptedException
		{
		 Reporter.log("opening an application",true);
			config_broweser();
			//browser configuratiation
			//created and initialized objects of POM classes
			
			
		}
	 @BeforeMethod
	   public void log() throws IOException
			{
				Reporter.log("user login successfully",true);
		    	lp=new Flipkart_loginpage(driver);
				lp.email(utilityclass.fetchdata(0,0));
				lp.password(utilityclass.fetchdata(1,1));
				lp.login();  
			}
		@Test
		public void verifyusername() throws InterruptedException, IOException
		{
			Reporter.log("username verified",true);
		    hp= new Flipkarthome_page(driver); 
		    String actual=hp.validusername();
            String expected="Shivprasad";
            Assert.assertEquals(actual, expected);
            utilityclass.screenshot(driver,"login");
            Thread.sleep(2000);
		}
	  
	   @AfterMethod
	   public void logout() throws InterruptedException, IOException
			{
		   Reporter.log("logout of application",true);
		   WebElement e = driver.findElement(By.xpath("//div[text()=\"Shivprasad\"]"));
		     Actions action=new Actions(driver);
		     action.moveToElement(e).perform();
		     Thread.sleep(1000);
		     WebElement g=driver.findElement(By.xpath("//div[text()=\"Logout\"]"));
		 	action.click(g).perform();
		 	   
			}
	   @AfterClass
	   public void Closeapp() throws InterruptedException 
	   {
		   Reporter.log("closing application",true);
		  Thread.sleep(2000);
		   driver.close();
			lp=null;
			hp=null;
			driver=null;
			sh=null;
	   }
   
}

