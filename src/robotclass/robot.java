package robotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Personal folder\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("shivprasadc22@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Shivay@1992");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"][1]")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//div[contains(@class,\"mTxt\") and contains(text(),\"My Naukri\")]"));
	
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(1000);
	WebElement g=driver.findElement(By.xpath("//a[text()=\"Edit Profile\"]"));
	act.click(g).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Update Resume\"]")).sendKeys("E:\\velocity\\velocity study material\\ONLINE CLASS NOTES FOR MANUAL & AUTOMATION\\testNG\\CV-Shivprasad Choudhary.pdf");
		Thread.sleep(3000); 
//		driver.close();	
//		WebElement ele1=driver.findElement(By.xpath("//div[contains(@class,\"mTxt\") and contains(text(),\"My Naukri\")]"));
		act.moveToElement(ele).perform();
		Thread.sleep(1000);
		WebElement h=driver.findElement(By.xpath("//a[text()=\"Logout\"]"));
		
		act.click(h).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
