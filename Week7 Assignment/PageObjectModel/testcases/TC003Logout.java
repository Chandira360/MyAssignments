package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;

public class TC003Logout extends  ProjectSpecificationMethod{
@Test
	public void runLogout(){
		// TODO Auto-generated method stub
	//create object for login
		LoginPage lp=new LoginPage();
		//call all the methods for logout process
		lp.enterUserName()
		  .enterPassword()
		  .clickLogin()
		  .logout();

}
}
