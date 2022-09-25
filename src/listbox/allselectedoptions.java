package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allselectedoptions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		
		Thread.sleep(3000);

		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		Select m=new Select(month);
		//used to get only selected options from list box
//		m.selectByIndex(1);
//		m.selectByIndex(3);
//		m.selectByIndex(5);
////		m.selectByValue("3");
////		m.selectByVisibleText("Mar");
		
//		List<WebElement> e=m.getAllSelectedOptions();
		
		//used to get all options from list box
		List<WebElement> e=m.getOptions();
		for(WebElement w:e)
		{
			System.out.println(w.getText());
		}
	}

}
