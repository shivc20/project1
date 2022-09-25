package highlightext.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageofmodule1 
{
	
	//Step-1->declare variables globally with private access specifier
		
		@FindBy(xpath="(//div[@class=\"exehdJ\"])[1]")private WebElement user;
		
		//Step->2   initialize within a constructor with access public class
 public pageofmodule1(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
	//Step->3  utilize within a method with access public class
 public void validateusername()
 {
	 String actual=user.getText();
	 String expected="Shiv";
	 if(actual.equalsIgnoreCase(expected))
	 {
		 System.out.println("test case is passed");
	 }
	 else
	 {
		 System.out.println("test case is failed");

	 }
 }
}
