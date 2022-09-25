package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
//	1. open browser with google webpage
//	2. verify google webpage opened
//	3.wait for 2 second and change size of browser to 700 width and 700 height
//	4. wait for 2 second and minimize the browser
//	5. wait for 2 second and maximize browser
////	6. close the browser
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		String url=driver.getCurrentUrl();
//		System.out.println("url");
		Thread.sleep(2000);
		Dimension D=new Dimension(700,700);
		driver.manage().window().setSize(D);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	}

}
