package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmPaymentOption  extends PageBase{
	
	public static String successmessage="Your order on My Store is complete.";

	public ConfirmPaymentOption(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//button[@type='submit']")
	WebElement  ConfirmOrderbtn;
	
	@FindBy(xpath="//strong[@class='dark']")
	WebElement  OrderCompletedmsg;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	WebElement  BackToOrderbtn;
	

	public void confirmOrder()
	{
		ConfirmOrderbtn.click();
	}
	public void clickOnBackToOrder()
	{
		BackToOrderbtn.click();

	}
	
	
}
