package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gatecurrentmethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		String url=driver.getCurrentUrl();
		System.out.println("url");

		if(url.equalsIgnoreCase("https://paytm.com/"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");

		Thread.sleep(2000);
		driver.quit();
		
	}
	}
}

