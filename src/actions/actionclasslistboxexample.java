package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionclasslistboxexample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");      
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        
        WebElement e=driver.findElement(By.xpath("//a[text()=\"Login\"]"));
        
//        WebElement e=driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
        
        Actions act=new Actions(driver);
        act.moveToElement(e).perform();
        Thread.sleep(2000);
        WebElement g=driver.findElement(By.xpath("//div[text()=\"Rewards\"]"));
        act.click(g).perform();
        
	}

}
