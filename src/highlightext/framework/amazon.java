package highlightext.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon

                          //example of facebook
{
	//Step-1->declare variables globally with private access specifier
	
		@FindBy(xpath="//input[@id=\"email\"]")private WebElement user;
		
		@FindBy(xpath="//input[@id=\"pass\"]")private WebElement password;
		
		@FindBy(xpath="//button[@name=\"login\"]")private WebElement login;

		//Step->2   initialize within a constructor with access public class
		
		public amazon(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//Step->3  utilize within a method with access public class

	    public void email()
	    {
	    	user.sendKeys("8446911486");	
	    }
	    public void password()
	    {
	    	password.sendKeys("facebook@1992");	
	    }
	    public void login()
	    {
	    	login.click();
	    }
	}

