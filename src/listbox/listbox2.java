package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Shivprasad");
//		
//		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Choudhary");
//		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9404145380");
//		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Shiv@1234");
	Thread.sleep(1000);
	//identify listbox & create x path and store it in variable type webelement
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement date=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		Select d=new Select(date);
		Select m=new Select(month);
		Select y=new Select(year);
		
		d.selectByIndex(19);
		m.selectByVisibleText("Feb");
		y.selectByValue("2022");
		
	WebElement e=driver.findElement(By.xpath("//label[text()=\"Male\"]"));
	e.click();
	Thread.sleep(1000);
	driver.close();

		
	}

}
