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

public class brokenlinks2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Personal folder\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	List<WebElement>links=driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	for(int i=0;i<links.size();i++)
	{
		WebElement l=links.get(i);
		String url=l.getAttribute("href");
		
		URL link=new URL(url);
		
		HttpURLConnection url1=(HttpURLConnection)link.openConnection();
		
		url1.connect();
		int rescode=url1.getResponseCode();
		if(rescode>=400)
		{
			System.out.println(url+" - "+ "link is Broken link");
		}
		else
		{
			System.out.println(url+" - "+ "link is valid link");
		}
		
	}
	

	}

}
