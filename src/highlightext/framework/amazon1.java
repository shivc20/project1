package highlightext.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class amazon1 

                               //example of facebook

{
	//Step-1->declare variables globally with private access specifier
	
			@FindBy(xpath="(//span[@class=\"a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7\"])[1]")private WebElement user;
			
			@FindBy(xpath="//div[@class=\"j83agx80 l9j0dhe7\"]")private WebElement profile;
		

//			
//step2->initialize within constructor with accesslevel public

public amazon1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void validusername() 
{
	String actual=user.getText();
	String expected="Shivprasad Choudhary";
	if(actual.equalsIgnoreCase(expected))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case failed");
	
	}
}
    public void profile()
    {
	profile.click();
     }

}