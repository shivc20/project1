package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathusingcontains {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);//input[contains(@name,"wo")]
		
		//using attribute
//		driver.findElement(By.xpath("//input[contains(@name,\"am\")]")).sendKeys("Admin");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[contains(@name,\"rd\")]")).sendKeys("admin123");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[contains(@name,\"mi\")]")).click();
//		Thread.sleep(2000);
//		driver.close();
		
		//using text
		driver.findElement(By.xpath("//input[contains(@name,\"am\")]")).sendKeys("Admin");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[contains(@name,\"wo\")]")).sendKeys("admin123");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[contains(@class,\"tt\")]")).click();
     	Thread.sleep(2000);
     	driver.close();
	}

}
