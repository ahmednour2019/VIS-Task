package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmPaymentOption  extends PageBase{

	public static String successmessage="Your order on My Store is complete.";

	public static String s;

	public ConfirmPaymentOption(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//button[@type='submit']")
	WebElement  ConfirmOrderbtn;

	@FindBy(xpath="//*[@id='center_column']/div/text()[6]")
	WebElement  OrderNoMsg;


	@FindBy(xpath="//strong[@class='dark']")
	WebElement  OrderCompletedmsg;

	@FindBy(xpath="//*[@id='center_column']/p/a")
	WebElement  BackToOrderbtn;

	@FindBy(xpath="//*[@id='center_column']/form/div/h3")
	WebElement  BankWrePaymntmsg;


	public void confirmOrder()
	{
		ConfirmOrderbtn.click();
	}
	public void clickOnBackToOrder()
	{
		BackToOrderbtn.click();

	}

	public String checkOutCompleted()
	{
		return BankWrePaymntmsg.getText();

	}

	public String checkOrderNoMSG()
	{
		return OrderNoMsg.getText();

	}
	public String extactOrderNo()
	{
		String[] substrings = OrderNoMsg.getText().split("[^A-Z]+");
		for (String s : substrings)
		{
			if (!s.isEmpty())
			{
				System.out.println(s);
			}
		}
		return s;
	}


	public boolean getDisplayedOrders()
	{
		WebElement htmltable=driver.findElement(By.id("order-list"));
		List<WebElement> rows=htmltable.findElements(By.tagName("tr"));

		for(int rnum=0;rnum<rows.size();rnum++)
		{
			List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td[1]"));
			//System.out.println("Number of columns:"+columns.size());
			for(WebElement orders: columns)
			{
				if(orders.getText()==s)
				{
					System.out.println("order is exist"+orders);
					break;
				} else
				{
					System.out.println("No order founds");
					return false;
				}

			}


		}
		return true;	
	}


}
