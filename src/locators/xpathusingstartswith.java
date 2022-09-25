package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathusingstartswith {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[starts-with(@class,\"_12KpZ6l \")]")).click();
		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("div[starts-with(text(),\"Mob\")]")).click();
		
        driver.findElement(By.xpath("(//button[starts-with(@class,\"_2KpZ6l\")])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[starts-with(text(),\"Mob\")]")).click();

	}

}
