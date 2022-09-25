package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testmethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		pageofmodule obj=new pageofmodule(driver);
		
		obj.email();
		obj.password();
		obj.login();
		
		Thread.sleep(2000);
		
		pageofmodule1 obj1=new pageofmodule1(driver);
		obj1.validateusername();
	

	}

}
