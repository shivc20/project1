package pom_ddf_testng_withmandetoryclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkarthome_page 
{

@FindBy(xpath="(//div[@class=\"exehdJ\"])[1]")private WebElement user;
	
//	@FindBy(xpath="//div[text()=\"Logout\"]")private WebElement logout;
	
	//step2->initialize within constructor with accesslevel public

	public Flipkarthome_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String validusername() throws InterruptedException 
	{
		Thread.sleep(1000);
		String actual=user.getText();
		return actual;
		}
}