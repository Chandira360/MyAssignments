package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificationMethod;

public class WelcomePage extends ProjectSpecificationMethod {
	public MyHomePage clickCrmsfa() {
		//select crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//navigate to My home page
		return new MyHomePage();
	}
	public LoginPage logout() {
		//click logout button
		driver.findElement(By.className("decorativeSubmit")).click();
		//navigate to login page
		return new LoginPage();
	}

}
