package pom_ddf_testng_withmandetoryclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class base_class 
{
	WebDriver driver;
	//mandetory code are come under this base class
	public void config_broweser()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Personal folder\\New folder\\chromedriver.exe");
	driver=new ChromeDriver();	
	Reporter.log("maximizing window",true);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	}
}
