package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gatetitle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
String title=driver.getTitle();
System.out.println(title);
if(title.equalsIgnoreCase("Google"))
		{
	System.out.println("Test case passed");
		}
else
        {
	System.out.println("Test case failed");
        }
	
	Thread.sleep(2000);
	driver.close();
	}
}
