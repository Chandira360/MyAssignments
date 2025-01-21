package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod {
	public LoginPage enterUserName() {
		//enter the username as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//return to same page
		return new LoginPage();
	}
	public LoginPage enterPassword() {
		//enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//return to same page
		return new LoginPage();
	}
	public WelcomePage clickLogin() {
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//navigate to welcome page
		return new WelcomePage();
	}
}
