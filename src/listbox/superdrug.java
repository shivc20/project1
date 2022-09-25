package listbox;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class superdrug 
{
	static WebDriver driver;
	private static void screenshot(String first) throws IOException 
	{
		 TakesScreenshot scr=(TakesScreenshot)driver;
	     File src=scr.getScreenshotAs(OutputType.FILE);
	     File dest=new File("E:\\folder\\screenshot\\"+first+".jpg");
	     FileHandler.copy(src,dest);
		
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.superdrug.com/");
        
    
      
        driver.findElement(By.xpath("//button[text()=\"Accept cookies\"]")).click();
        
        screenshot("Application opened");
        
        driver.findElement(By.xpath("//div[@class=\"insider-opt-in-notification-button insider-opt-in-disallow-button\"]"))
        .click();
  
        WebElement l=driver.findElement(By.xpath("//a[text()=\"Superdrug Brands\"]"));
   
     Actions act=new Actions(driver);
     
     act.moveToElement(l).perform();
     
     WebElement g=driver.findElement(By.xpath("//span[text()=\" By Superdrug \"]"));    
     
     act.moveToElement(g).perform();
     
     WebElement e=driver.findElement(By.xpath("//a[text()=\"Jewellery\"]"));
     
     screenshot("Jewellery screenshot taken");
 
     act.doubleClick(e).perform();
    
	}
	
		
	
      
}
