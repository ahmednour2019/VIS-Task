package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="email_create")
	WebElement RegisterEmailfld;
	
	@FindBy(xpath="//*[@id='SubmitCreate']/span")
	WebElement ClickAccountbtn;
	
	@FindBy(id="email")
	WebElement SigninEmailfld;
	
	@FindBy(id="passwd")
	WebElement passwordfld;
	
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	WebElement  ClickOnSignInbtn;
	

	public void CreateAccount(String email )
	{
		RegisterEmailfld.sendKeys(email);
		ClickAccountbtn.click();
	}
	
	public void SignIn(String email,String Password)
	{
		SigninEmailfld.sendKeys(email);
		passwordfld.sendKeys(Password);
		ClickOnSignInbtn.click();
	}
	

}
