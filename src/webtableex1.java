import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableex1 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		Thread.sleep(2000);
		List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"countries\"]//tr"));
		int sizeofRow=row.size();
		System.out.println("No. of rows present i n table are: "+sizeofRow);

		int columnsize =driver.findElements(By.xpath("//table[@id=\"countries\"]//tr[1]/td")).size();
		System.out.println("no.of column size "+columnsize);
		
//		WebElement e=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[2]/td[5]"));
//		String celldata=e.getText();
//		System.out.println(celldata);
		System.out.println(driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[5]/td[5]")).getText());
		
		
	}

}
