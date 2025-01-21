package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;

public class TC002CreateAccount extends  ProjectSpecificationMethod{
	@Test
	public void invokeCreateAccount(){
		// TODO Auto-generated method stub
		//create object for login
		LoginPage lp=new LoginPage();
		//call all the methods for creating an account process form the login page and navigate through account page
		lp.enterUserName()
		  .enterPassword()
		  .clickLogin()
		  .clickCrmsfa()
		  .clickAccounts()
		  .clickCreateAccount()
		  .enterAccountDetails()
		  .verifyTitle();
		  

	}
}
