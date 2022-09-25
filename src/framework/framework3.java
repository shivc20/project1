package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framework3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");		  
		
	    FileInputStream file=new FileInputStream("C:\\Users\\Shiv\\Desktop\\parameterization\\XL SHEET.xlsx");
         XSSFWorkbook book=new XSSFWorkbook(file);
         XSSFSheet sheet1=book.getSheet("Sheet3");
         String user=sheet1.getRow(0).getCell(0).getStringCellValue();
         String pass=sheet1.getRow(0).getCell(1).getStringCellValue();
         
 		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();		
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();		
         driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys(user);
         driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys(pass);
         driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
         Thread.sleep(2000);
         WebElement login=driver.findElement(By.xpath("(//div[@class=\"exehdJ\"] ) [1]"));

       String actual=login.getText();
       System.out.println(actual);
       String expected="Shivprasad";
       if(actual.equalsIgnoreCase(expected))
       {
    	   System.out.println("test case passed");
       }
       else
       {
    	   System.out.println("test case failed");

       }
      driver.close();
	}

}
