package pom_ddf_testng_withmandetoryclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_loginpage
{

	// step-1-> declare variable globally with private access with @findby annotation 
		

		@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]")private WebElement user;
		
	    @FindBy(xpath="//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")private WebElement password;
		
		@FindBy(xpath="//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]/span")private WebElement login;

		//Step->2   initialize within a constructor with access public class
		
				public Flipkart_loginpage (WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}
				//Step->3  utilize within a method with access public class

			    public void email(String e )
			    {
			    	user.sendKeys(e);	
			    }
			    public void password(String p)
			    {
			    	password.sendKeys(p);	
			    }
			    public void login()
			    {
			    	login.click();
			    }
}
