import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("abcder");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("bjhb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
	}

}
