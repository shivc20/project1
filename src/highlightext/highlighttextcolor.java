package highlightext;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class highlighttextcolor {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Personal folder\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8446911486");
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Shiv@123");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		
		 // identify text
		WebElement t = driver.findElement(By.xpath("//div[text()=\"Mobiles\"]"));
		////obtain color in rgba
		String s=t.getCssValue("color");
		 // convert rgba to hex
		String c=Color.fromString(s).asHex();
		
		System.out.println("Color is: " + s);
		System.out.println("Hex code for Color is:" + c);
		
	}

}
