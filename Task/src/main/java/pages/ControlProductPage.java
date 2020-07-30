package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class ControlProductPage extends PageBase{

	public static String SuccessMessage="Product successfully added to your shopping cart" ;


	public ControlProductPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id="quantity_wanted")
	WebElement  QuantityWtdfld;
	@FindBy(id="color_8")
	WebElement SelectColWhite;
	@FindBy(id="color_11")
	WebElement SelectColBlack;
	@FindBy(xpath="//button[@name='Submit']")
	WebElement  SelectCartBtn;
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	WebElement  ProcedToCheckOutbtn;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	WebElement successMessage;
	@FindBy(xpath="//span[@class='heading-counter']")
	WebElement NoOfPro;
	@FindBy(id="group_1")
	WebElement Siz;



	public void SelectWhiteColour()
	{
		SelectColWhite.click();
	}
	public void SelectBlackColour()
	{
		SelectColBlack.click();
	}




	public void addToCart(String x,String size)
	{
		QuantityWtdfld.clear();
		QuantityWtdfld.sendKeys(x);
		SelectColWhite.click();
		Select select= new Select(Siz);
		select.selectByVisibleText(size);
		SelectCartBtn.click();
		ProcedToCheckOutbtn.click();

	}



	public boolean checkCartExistance()
	{
		
		return SelectCartBtn.isDisplayed();
	}

}
