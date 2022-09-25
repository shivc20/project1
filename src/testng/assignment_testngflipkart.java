package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

public class assignment_testngflipkart 
{
	 WebDriver driver;
	@BeforeSuite
	public void browserconfigure()
	{
		Reporter.log("browser setting",true);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	//Always Execute First (i.e before all the methods/classes)
	@BeforeTest     
	public void browserwindowsetting()
	{
		Reporter.log("code for maximizing",true);
		driver.manage().window().maximize();
	}
//	It is use for execution of test method before execution of test class
	@BeforeClass
	public void openapplication()
	{
		Reporter.log("Opening an application",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
	}
//	It is use for execution of test method before execution of every test method with an annotation @Test
	@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("user login successfully",true);
//	WebElement e=driver.findElement(By.xpath(""));
//	WebElement f=driver.findElement(By.xpath(""));
//	WebElement g=driver.findElement(By.xpath(" "));
	
		FileInputStream file=new FileInputStream("C:\\Users\\Shiv\\Desktop\\parameterization\\XL SHEET.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet s=book.getSheet("Sheet3");
		String username=s.getRow(1).getCell(0).getStringCellValue();
		String password=s.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]/span")).click();
			
	}
//	Use for execution of test method/TC.
	@Test
	public void testcase1() 
	{
		Reporter.log("Test case 1 executing for user verification",true);
		
	}
//	- It is use for execution of test method after execution of every test method with an annotation @Test.
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Reporter.log("user logout successfully",true);
		WebElement e=driver.findElement(By.xpath("//div[text()=\"Shivprasad\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(2000);
		WebElement g=driver.findElement(By.xpath("//div[text()=\"Logout\"]"));
		act.click(g).perform();
	}
//	
	@Test
	public void testcase2()
	{
		Reporter.log("Test case 2 executing for grosaries",true);
	    driver.findElement(By.xpath("//div[text()=\"Grocery\"]")).click();
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
		driver.close();
	}
//	
	@AfterSuite
	public void browserchange()
	{
		Reporter.log("browser changing",true);
	}
}
