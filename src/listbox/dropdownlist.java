package listbox;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownlist {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("selenium");
		Thread.sleep(2000);
		
		//visit element one by one if match is there then click on that webelement
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]//ul/li"));
		Thread.sleep(2000);
		//visit element one by one if match there is click on that webelement.
		String expected="selenium download";
		for(WebElement s:ele)
		{
			String actual=s.getText();
			if(expected.equalsIgnoreCase(actual))
			{
				s.click();
				break;
				
			}
		}
		//using iterator method
//		Iterator<WebElement> var=ele.iterator();
//		while(var.hasNext())
//		{
//			System.out.println(var.next().getText());
//		WebElement e=var.next();
//		String actual=e.getText();
//	      	if(expected.equalsIgnoreCase(actual))
//	     	{
//			e.click();
//	     	break;
//	     	}	
//		
//	   }
}
	}
