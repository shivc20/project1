package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

static WebDriver driver;
	
	public static void scrollIntoView(WebElement t,WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",t);
//		Thread.sleep(3000);
//		js.executeScript("Window.scrollTo(1,document.body.200)");
	}	

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
//		Thread.sleep(3000);
		 // identify text
		WebElement t = driver.findElement(By.xpath("//a[text()=\"Contact Us\"]"));
//		
		scrollIntoView(t,driver);
		Thread.sleep(1000);
		t.click();
//		
//	 String title=driver.getTitle();
//	 
// need to print text from border
		
//		Thread.sleep(3000);
		driver.close();

	}
	


}
