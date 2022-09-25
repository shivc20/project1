package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Personal folder\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8446911486");
//		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Shiv@123");
//		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	
		Thread.sleep(2000);
		//capture links from webpage
		List<WebElement>links=driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		//find number of link
		System.out.println(links.size());
		
		Thread.sleep(1000);
		
		for(int i=0;i<=links.size();i++)
		{
			//by using href attribute we can get url of required link	
			
			WebElement l=links.get(i);
			//get link & store it in string url
			String url=l.getAttribute("href");
			
			URL link=new URL(url);
			//create connection using URL object link
			HttpURLConnection hurl=(HttpURLConnection)link.openConnection();
			
			Thread.sleep(2000);
			//establish connection
			hurl.connect();
			
			if(hurl.getResponseCode()>=400)
			{
				System.out.println(url+" - "+"is broken link");
			}
			else
			{
				System.out.println(url+" - "+" is valid link");
			}
			
		}
	

	}

}
