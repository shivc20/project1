package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartwithddf1 
{
	@FindBy(xpath="(//div[@class=\"exehdJ\"])[1]")private WebElement user;
	
//	@FindBy(xpath="//div[text()=\"Logout\"]")private WebElement logout;
	
	//step2->initialize within constructor with accesslevel public

	public flipkartwithddf1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void validusername() 
	{
		String actual=user.getText();
		String expected="Shivprasad";
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		
		}
	}
//	public void logout()
//    {
//		
//	logout.click();
//     }

}

