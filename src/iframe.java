import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
	//	using id method
//		driver.switchTo().frame("iframeResult");
		//using name attribute 
//		driver.switchTo().frame("iframeResult");
		// using index method
//		driver.switchTo().frame(2);
	WebElement e=driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
	driver.switchTo().frame(e);
	driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();
	driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Shiv");
	driver.findElement(By.xpath("//input[@id=\"lname\"]")).clear();
	driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Choudhary");
	driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
	}

}
