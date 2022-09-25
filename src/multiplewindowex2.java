import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowex2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"messageWindowButton\"]")).click();
		String parentid=driver.getWindowHandle();
		Set<String>childid=driver.getWindowHandles();
         System.out.println(childid.size());
         for(String s:childid)
         {
        	 System.out.println(s);
        	 if(!s.equals(parentid))
        	 {
        		 driver.switchTo().window(s);
        		 driver.close();
        	 }
        
         }
//                             driver.switchTo().window(parentid);   
//                             driver.close();
//                        
	}

	
}
