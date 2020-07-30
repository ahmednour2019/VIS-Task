package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSummaryPage extends PageBase{
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement  ProcedToCheckOut2;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement  ProcedToCheckOut3;
	
	@FindBy(id="cgv")
	WebElement  AgreeChkbx;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement   SelectBnkWrOption;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	WebElement   SelectCheckOption;
	
	

	public ShoppingCartSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void proceedToCheckOut()
	{
		
		ProcedToCheckOut2.click();
		ProcedToCheckOut3.click();
		AgreeChkbx.click();
		ProcedToCheckOut3.click();
		SelectBnkWrOption.click();
		
	}
	

	
	

}
