package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdownlistexampl 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]//input")).click();
//		driver.findElement(By.xpath("//div[text()=\"BOM\"]")).click();	
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"GOI\"]")).click();
//		
	}

}
