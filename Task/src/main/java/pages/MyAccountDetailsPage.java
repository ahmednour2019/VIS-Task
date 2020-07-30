package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccountDetailsPage  extends PageBase {
	
	
	public static String titlename="My account - My Store";
	
	@FindBy(css ="a.sf-with-ul")
	WebElement  WomenLnk;

	@FindBy(linkText="Blouses")
	WebElement  BlousesLnk;
	
	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement  UserName;

	
	
	
	public MyAccountDetailsPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
	
	
	public void moveAndClickOnBlouse() 
	{

		action
		.moveToElement(WomenLnk)
		.moveToElement(BlousesLnk)
		.click()
		.build()
		.perform();
		
	}
	
	public String userName()
	{
		return UserName.getText();	
				
	}
	

}
