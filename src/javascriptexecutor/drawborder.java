package javascriptexecutor;

import java.time.Duration;

import javax.swing.border.Border;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class drawborder 
{
	static WebDriver driver;
	
	public static void drawborder(WebElement t,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid green'",t);
	}
//	public static String getTitle(WebDriver driver)
//	{
//		String title=Js.executeScript("return document.title;").toString();
//		return title;
//	}
//	

	public static void main(String[] args) throws InterruptedException
	{
				
		System.setProperty("webdriver.chrome.driver", "E:\\Personal folder\\New folder\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8446911486");
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Shiv@123");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(2000);
		 // identify text
		WebElement t = driver.findElement(By.xpath("//div[text()=\"Shivprasad\"]"));
		
		drawborder(t,driver);
//		
//	 String title=driver.getTitle();
//	 
// need to print text from border
		
		Thread.sleep(3000);
		driver.close();

	}
	

}
