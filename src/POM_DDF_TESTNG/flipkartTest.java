package POM_DDF_TESTNG;

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

public class flipkartTest 
{
	WebDriver driver;
	XSSFWorkbook book;
	 XSSFSheet g;
	FileInputStream F;
	 Flipkart_loginpage lp;
	 Flipkarthome_page  hp;
	 
		@BeforeSuite
		public void opnapp()
		{
			//browser configuratiation
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
		@BeforeTest
		public void browerWindiowsetting()
		{
			Reporter.log("maximizing window",true);
			driver.manage().window().maximize();
		}
		@BeforeClass
		public void openingwindow()
		{
			Reporter.log("opening an application",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com/");
		}
	   @BeforeMethod
	   public void login() throws IOException
			{
				Reporter.log("user login successfully",true);
	            F=new FileInputStream("C:\\Users\\Shiv\\Desktop\\parameterization\\XL SHEET.xlsx");
	            book= new XSSFWorkbook(F);
	            g=book.getSheet("Sheet3");
	        String user=g.getRow(1).getCell(0).getStringCellValue();
	        String password=g.getRow(1).getCell(1).getStringCellValue();
	           lp=new   Flipkart_loginpage(driver);
	           hp=new   Flipkarthome_page(driver);
	           lp.email(user);
	           lp.password(password);
	           lp.login();  
			}
	   @Test
	   public void verifyusername() throws InterruptedException
			{
			Reporter.log("username verified",true);
		    String actual=hp.validusername();
            String expected="Shivprasad";
            Assert.assertEquals(actual, expected);
			}
	   @AfterMethod
	   public void logout() throws InterruptedException
			{
		   Reporter.log("logout of application",true);
		   WebElement e = driver.findElement(By.xpath("//div[text()=\"Shivprasad\"]"));
		     Actions action=new Actions(driver);
		     action.moveToElement(e).perform();
		     Thread.sleep(1000);
		     WebElement g=driver.findElement(By.xpath("//div[text()=\"Logout\"]"));
		 	action.click(g).perform();
		 	     Thread.sleep(3000);
			}
	   @AfterClass
	   public void Closeapp() throws InterruptedException 
	   {
		   Reporter.log("closing application",true);
		  Thread.sleep(2000);
		   driver.quit();
			lp=null;
			hp=null;
			driver=null;
			g=null;
	   }
   
}

