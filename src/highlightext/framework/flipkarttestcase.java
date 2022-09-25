package framework;

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

public class flipkarttestcase {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		FileInputStream File=new FileInputStream("C:\\Users\\Shiv\\Desktop\\parameterization\\XL SHEET.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(File);
		XSSFSheet sheet=book.getSheet("Sheet3");
        String username=sheet.getRow(0).getCell(0).getStringCellValue();		
        String password=sheet.getRow(1).getCell(1).getStringCellValue();
  
        flipkartwithddf  obj=new flipkartwithddf (driver);
		obj.email(username);
		obj.password(password);
		obj.login();
		
		Thread.sleep(2000);
		flipkartwithddf1 obj1=new flipkartwithddf1(driver);
		obj1.validusername();
//		Thread.sleep(1000);
//		obj1.logout();
		
		Thread.sleep(1000);
		 WebElement e = driver.findElement(By.xpath("//div[text()=\"Shivprasad\"]"));
	     Actions action=new Actions(driver);
	     action.moveToElement(e).perform();
	     Thread.sleep(1000);
//	 WebElement g=driver.findElement(By.xpath("(//div[@class=\"_3vhnxf\"])[10]"));
	 WebElement g=driver.findElement(By.xpath("//div[text()=\"Logout\"]"));

	action.click(g).perform();
	     Thread.sleep(3000);
		driver.close();
	}

}

