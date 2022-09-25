import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
		
		Thread.sleep(1000);
		//switch to iframe

		Thread.sleep(1000);
		
		//switch to iframe
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("hello");
		Thread.sleep(1000);
		
		//Switch to main webpage
//		
//		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();
//		driver.switchTo().defaultContent();//sifted focus to main webpage
		driver.switchTo().parentFrame();
		driver.close();

	}

}
