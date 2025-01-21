package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;

public class TC001LoginPage extends  ProjectSpecificationMethod{
@Test
	public void runLogin(){
		// TODO Auto-generated method stub
	//create object for login
		LoginPage lp=new LoginPage();
		//call all the methods for login process
		lp.enterUserName()
		  .enterPassword()
		  .clickLogin();
		  

	}

}
