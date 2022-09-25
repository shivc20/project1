package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {

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
boolean output=m.isMultiple();
if(output==true)
{
	System.out.println("test case is passed:list box is multiselectable");
}
else
{
	System.out.println("test case is failed:list box is single selectable");

}
	}

}
