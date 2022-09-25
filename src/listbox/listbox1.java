package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		//identify listbox & create x path and store it in variable type webelement
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		month.click();

		//Step2: Create object of Select Class
		Select se= new Select(month);
		
//		boolean output=se.isMultiple();
//		if(output==true)
//		{
//			System.out.println("test Case is Passed:listbox is multiselectable");
//		}
//		else
//		{
//			System.out.println("test Case is failed:listbox is singleselectable");
//
//		}
		//Step3: Select option by method selectByValue()
//		se.selectByValue("8");
       	se.selectByVisibleText("Aug");
//		
String expresult="Jul";
String Actualresult=se.getFirstSelectedOption().getText();
if(expresult.equalsIgnoreCase(Actualresult))
{
	System.out.println("Test case passed");
}
else
{
	System.out.println("Test case failed");
}
		}

}
