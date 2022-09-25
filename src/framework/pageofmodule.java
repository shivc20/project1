package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageofmodule 
{
//Step-1->declare variables globally with private access specifier using @findBy Annotation
	
	@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]")private WebElement user;
	
	@FindBy(xpath="//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")private WebElement password;
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]/span")private WebElement login;

	//Step->2   initialize within a constructor with access public class
	
	public pageofmodule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Step->3  utilize within a method with access public class

    public void email()
    {
    	user.sendKeys();	
    }
    public void password()
    {
    	password.sendKeys();	
    }
    public void login()
    {
    	login.click();
    }
}
