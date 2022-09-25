package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singapoorairlinedropdownlist {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwigwt_4oen4AhVBdmAKHUzeBxwYABACGgJ0bQ&ohost=www.google.com&cid=CAESa-D22ONH3o8s4ZZ1EEHt5arHvqdCTLMcfqGvIw7axQ5p38IQCvzdAcOxVs_S0Aagor-YPyw9x0t0fWJZ4l4JRXMOnXfRSYNVHTQJlC9uVna6xl7im8JdvHoCBZupCzmunz6Os5L1o3dQVSnb&sig=AOD64_3YxfuXeQJQGwcDqkllut1Pe_L-JQ&q&adurl&ved=2ahUKEwjhidb4oen4AhWlq1YBHai7BZEQ0Qx6BAgGEAE");
		Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@id=\"flightOrigin1\"]")).sendKeys("BOM");
         Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@id=\"bookFlightDestination\"]")).sendKeys("EWR");
         Thread.sleep(1000);

	     driver.findElement(By.xpath("//input[@id=\"departDate1\"]")).click();
         Thread.sleep(1000);

         driver.findElement(By.xpath("//li[@date-data=\"2022-07-20\"]")).click();
         Thread.sleep(1000);

         driver.findElement(By.xpath("//li[@date-data=\"2022-08-20\"]")).click();
         Thread.sleep(1000);

         driver.findElement(By.xpath("//input[@id=\"flightClass1\"]")).sendKeys("Premium Economy");
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//label[text()=\"Passengers\"]")).click();
         Thread.sleep(2000);
 		int i=1;
 		while(i<3)
 		{
 			driver.findElement(By.xpath("//div[@tabindex=\"2\"]")).click();
 			i++;
 		}
	}
}
