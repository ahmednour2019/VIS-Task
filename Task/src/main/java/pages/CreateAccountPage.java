package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountPage extends PageBase{

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="id_gender1")
	WebElement SelectMrRdbtn;
	
	@FindBy(id="id_gender2")
	WebElement SelectMrsRdbtn;
	
	@FindBy(id="customer_firstname")
	WebElement FirstNamefld;
	
	@FindBy(id="customer_lastname")
	WebElement LastNamefld;
	
	@FindBy(id="passwd")
	WebElement Passwordfld;
	
	@FindBy(id="address1")
	WebElement Addressfld;
	
	@FindBy(id="city")
	WebElement cityfld;
	
	@FindBy(id="id_country")
	WebElement Countryfld;
	
	@FindBy(id="id_state")
	WebElement state;
	
	
	
	@FindBy(name="postcode")
	WebElement postalcodefld;
	
	@FindBy(id="phone_mobile")
	WebElement MObilPhonefld;
	
	@FindBy(id="alias")
	WebElement AddressAlisfld;
	
	
	@FindBy(id="submitAccount")
	WebElement Registerbtn;
	
	
	

    public void  RegisterAnAccount(String FName,String LName, String Pass,String adds,String cty,String pstcde,String Mphone,String alsadds)
    {
    	SelectMrRdbtn.click();
    	FirstNamefld.sendKeys(FName);
    	LastNamefld.sendKeys(LName);
    	Passwordfld.sendKeys(Pass);;
    	Addressfld.sendKeys(adds);
    	cityfld.sendKeys(cty);

    	Select ste= new Select (state);
    	ste.selectByValue("2");
    	
    	Select country= new Select (Countryfld);
    	country.selectByVisibleText("United States");
    	
    	
    	postalcodefld.sendKeys(pstcde);
    	MObilPhonefld.sendKeys(Mphone);
    	AddressAlisfld.sendKeys(alsadds);
    	Registerbtn.click();
    }

}
