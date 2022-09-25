import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowshandle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		
		
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
	
		driver.findElement(By.xpath("//button[@id=\"messageWindowButton\"]")).click();
		
		//Step1:
				String parentid=driver.getWindowHandle();
				
				//Step2:
				Set<String> childid	=driver.getWindowHandles();
				System.out.println(childid.size());//4
				
				//Step3:
				for(String s:childid)
				{
					System.out.println(s);
					if(!s.equals(parentid))
					{
						driver.switchTo().window(s);
						Thread.sleep(2000);
						driver.close();
					}
				}
				driver.switchTo().window(parentid);		
				driver.close();
	}
	

	

}
