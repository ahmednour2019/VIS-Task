package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadProperities;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountDetailsPage;
import pages.MyAccountPage;


public class CreateAnewAccountTest extends TestBase{


	HomePage homeObject ; 
	MyAccountPage  myAccountPage;
	CreateAccountPage  createAccountPage;
	MyAccountDetailsPage  myAccountDetailsPage;

	String email=LoadProperities.userData.getProperty("email");
	String Fname=LoadProperities.userData.getProperty("first_name");
	String Lname=LoadProperities.userData.getProperty("last_name");
	String Pass=LoadProperities.userData.getProperty("password");
	String add=LoadProperities.userData.getProperty("address");
	String cty=LoadProperities.userData.getProperty("city");
	String Mphone=LoadProperities.userData.getProperty("phone");
	String pstcde=LoadProperities.userData.getProperty("postal_code");
	String alsadds=LoadProperities.userData.getProperty("Assigned_address");

	// 1- User Registration 
	@Test(priority=1,alwaysRun=true)
	public void CreateNewAccount() 
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
		Assert.assertTrue(driver.getTitle().contains("My account - My Store"));
	}




}
