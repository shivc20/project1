package actions;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//step1:
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()=\"right click me\"]"))).perform();
                        //(you can use both x-path)
//		act.contextClick(driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"))).perform();
		int i;
		for(i=0;i<=3;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
	}

}
