package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathusingattribute {

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
//			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);
			
			//enter username
//			driver.findElement(By.xpath("//div[2]/input")).sendKeys("Admin");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[3]/input")).sendKeys("admin123");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath(" //div[5]/input")).click();
//			Thread.sleep(2000);
			
			//using x path with attribute//
			//enter username
			
//			driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
//			Thread.sleep(2000);
//		
//			driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
//			Thread.sleep(2000);
//			driver.close();
			
			//using x path with text//
			//enter username
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
			Thread.sleep(2000);
			driver.close();
			
	}

			

}
