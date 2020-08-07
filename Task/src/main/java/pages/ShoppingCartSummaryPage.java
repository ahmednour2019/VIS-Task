package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSummaryPage extends PageBase{
	
	@FindBy(xpath="//*[@id='center_column']/p[2]/a[1]")
	WebElement  ProcedToCheckOut2;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	WebElement  ProcedToCheckOut3;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement  ProcedToCheckOut4;
	
	@FindBy(xpath="//input[@type='checkbox']")
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
		ProcedToCheckOut4.click();
		SelectBnkWrOption.click();
		
	}
	

	
	

}
