package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class HomePage extends PageBase{
	
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement SignInbtn; 
	@FindBy(id="search_query_top")
	WebElement SearchItemfield;
	@FindBy(name="submit_search")
	WebElement SearchClickbtn;
	
	@FindBy(xpath="//*[@id='header_logo']/a/img")
	WebElement logobtn;
	
	
	public boolean VerifyHomepagelogo()
	{
		return logobtn.isDisplayed();
	}
	public void ClickOnSignIn()
	{
		SignInbtn.click();
	}
	public void SearchForItem(String item)
	{
		SearchItemfield.sendKeys(item);
		SearchClickbtn.click();
	}
	

}
