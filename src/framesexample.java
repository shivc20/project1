import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framesexample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
		
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input")).sendKeys("shiv");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		WebElement an=driver.findElement(By.xpath("//select[@class=\"col-lg-3\"]"));
		Thread.sleep(2000);
		an.click();
		Select s=new Select(an);
		s.selectByValue("babycat");
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).clear();


	}

}
