package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byclass 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement ele=driver.findElement(By.id("txtUsername"));
	Thread.sleep(2000);
	ele.sendKeys("Admin");
	Thread.sleep(2000);
	WebElement pass=driver.findElement(By.id("txtPassword"));
	Thread.sleep(2500);
	pass.sendKeys("admin123");
	WebElement login=driver.findElement(By.id("btnLogin"));
	Thread.sleep(2000);
	login.click();
	Thread.sleep(2000);
	driver.quit();
	}

}
