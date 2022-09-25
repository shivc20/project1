package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class quitmethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.quit();	
	
	}

}
