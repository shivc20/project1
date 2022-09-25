package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {

	
		public static void main(String[] args) throws InterruptedException 
		{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Dimension d=driver.manage().window().getSize();
	System.out.println(d);
	Point p=driver.manage().window().getPosition();
	System.out.println(p);
	
		}
	}

