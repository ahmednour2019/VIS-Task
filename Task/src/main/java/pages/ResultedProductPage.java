package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ResultedProductPage extends PageBase{


	@FindBy(xpath="//img[@title='Blouse']")
	WebElement  resultedProduct;

	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
	WebElement More;
	
	public ResultedProductPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}


	public void selectResultedProduct()
	{

			action
			.moveToElement(resultedProduct)
			.moveToElement(More)
			.click()
			.build()
			.perform();
	}

}
