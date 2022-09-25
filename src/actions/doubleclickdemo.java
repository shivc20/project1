package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		//Step1:
		WebElement e=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));

		//step2:
		Actions act= new Actions(driver);
		
		//step3:
		act.doubleClick(e).perform();
		Thread.sleep(1000);
		driver.quit();	

	}

}
