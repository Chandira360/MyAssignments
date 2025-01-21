package pages;

import base.ProjectSpecificationMethod;

public class ViewAccountPage extends ProjectSpecificationMethod{
	public void verifyTitle() {
		//get the title of the page
		System.out.println(driver.getTitle());
	}
}
