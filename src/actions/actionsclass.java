package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclass 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement e=driver.findElement(By.xpath("//a[text()=\"Login\"]"));
		
		//step2
         Actions act=new Actions(driver);
         act.moveToElement(e).perform();
         Thread.sleep(2000);
         WebElement g=driver.findElement(By.xpath("//div[text()=\"Gift Cards\"]"));
         act.click(g).perform();
		
//driver.findElement(By.xpath("//button[text()='✕']")).click();
//		
//		//Step1:Identify element and store it in reference variable
//		WebElement e=driver.findElement(By.xpath("//a[text()=\"Login\"]"));
//			
//		//Step2:
//		Actions act= new Actions(driver);
//		
//		//step3:
//		act.moveToElement(e).perform();
//		
//		Thread.sleep(2000);
//		WebElement g=driver.findElement(By.xpath("//div[text()='Gift Cards']"));
//		act.click(g).perform();

	}

}
