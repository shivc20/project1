import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowsex3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"LinkedIn OrangeHRM group\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"OrangeHRM on Facebook\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"OrangeHRM on twitter\"]")).click();
		Thread.sleep(2000);
		String parentid=driver.getWindowHandle();
		Set<String> childid=driver.getWindowHandles();
		for(String s:childid)
		{
			if(!s.equals(parentid))
			{
				String actualTiltle=driver.switchTo().window(s).getTitle();
				if(actualTiltle.contains("Facebook"))			
				{
					driver.findElement(By.xpath("//input[@aria-label=\"Email or phone\"]")).sendKeys("Shiva");
//					Thread.sleep(2000);
//					driver.close();
				}
//				driver.close();
			}
		}

	}

}
