package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificationMethod;

public class MyHomePage extends ProjectSpecificationMethod{
	public MyAccountPage clickAccounts() {
		//select accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}

}
