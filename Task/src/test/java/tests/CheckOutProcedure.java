package tests;

import org.testng.annotations.Test;

import data.LoadProperities;
import pages.ControlProductPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountDetailsPage;
import pages.MyAccountPage;
import pages.ResultedProductPage;
import pages.ShoppingCartSummaryPage;

public class CheckOutProcedure extends TestBase{
	
	

	HomePage homeObject ; 
	MyAccountPage  myAccountPage;
	CreateAccountPage  createAccountPage;
	MyAccountDetailsPage  myAccountDetailsPage;
	ResultedProductPage   resultedProductPage;
	ControlProductPage   controlProductPage;
	ShoppingCartSummaryPage  shoppingCartSummaryPage;
	
	
	
	String email=LoadProperities.userData.getProperty("email");
	String Fname=LoadProperities.userData.getProperty("first_name");
	String Lname=LoadProperities.userData.getProperty("last_name");
	String Pass=LoadProperities.userData.getProperty("password");
	String add=LoadProperities.userData.getProperty("address");
	String cty=LoadProperities.userData.getProperty("city");
	String Mphone=LoadProperities.userData.getProperty("phone");
	String pstcde=LoadProperities.userData.getProperty("postal_code");
	String alsadds=LoadProperities.userData.getProperty("Assigned_address");
	String quantity=LoadProperities.userData.getProperty("Quantity");
	String size=LoadProperities.userData.getProperty("Size");

	@Test(priority=1,alwaysRun=true)
	public void checkOut() throws InterruptedException 
	{
		homeObject = new HomePage(driver); 
		homeObject.ClickOnSignIn();
		myAccountPage= new MyAccountPage(driver);
		myAccountPage.CreateAccount(email);
		createAccountPage= new CreateAccountPage(driver);
		createAccountPage.RegisterAnAccount(Fname, Lname, Pass, add, cty, pstcde, Mphone, alsadds);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		myAccountDetailsPage  = new MyAccountDetailsPage(driver);
		
		try {
			myAccountDetailsPage.moveAndClickOnBlouse();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resultedProductPage= new ResultedProductPage(driver);
		resultedProductPage.selectResultedProduct();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		controlProductPage= new ControlProductPage(driver);
		controlProductPage.addToCart((quantity.toString()), size);
		Thread.sleep(10000);
		shoppingCartSummaryPage = new ShoppingCartSummaryPage(driver);
		shoppingCartSummaryPage.proceedToCheckOut();
		
		
	//	Assert.assertTrue(controlProductPage.checkCartExistance());
		
	}

}
