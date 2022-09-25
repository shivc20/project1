package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentusingxpath 
{
//	1. Open amazon application.
//	2. Click on Best Sellers
//	3. Click on Mostly Gifted
//	4. Click on Mobiles
//	5. Click on Laptops and Accessories
//	6. Scroll down and click on Memory cards
//	7. Close browser

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Best Sellers\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Most Gifted\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Electronics\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
