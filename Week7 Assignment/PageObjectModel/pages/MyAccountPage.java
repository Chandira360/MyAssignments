package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificationMethod;

public class MyAccountPage extends ProjectSpecificationMethod {
	public CreateAccountPage clickCreateAccount() {
		//Select create account option
		driver.findElement(By.linkText("Create Account")).click();
		//navigate to Create account page
		return new CreateAccountPage();
	}

}
