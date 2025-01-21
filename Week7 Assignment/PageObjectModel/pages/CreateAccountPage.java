package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethod;

public class CreateAccountPage extends ProjectSpecificationMethod{
	public ViewAccountPage enterAccountDetails() {
		//enter the account name as Testing
		driver.findElement(By.id("accountName")).sendKeys("Testing");
		//enter the description as selenium Automation Tester
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//select the name of industry as computer software
		WebElement indusEle = driver.findElement(By.name("industryEnumId"));
		Select indusDD= new Select(indusEle);
		indusDD.selectByIndex(3);
		//Select the ownership as S-corporation
		WebElement ownerEle=driver.findElement(By.name("ownershipEnumId"));
		Select ownerDD=new Select(ownerEle);
		ownerDD.selectByVisibleText("S-Corporation");
		//select the source as employee
		WebElement sourceEle=driver.findElement(By.name("dataSourceId"));
		Select sourceDD=new Select(sourceEle);
		sourceDD.selectByValue("LEAD_EMPLOYEE");
		//select e-commerce site as marketing campaign
		WebElement marketEle=driver.findElement(By.name("marketingCampaignId"));
		Select marketDD=new Select(marketEle);
		marketDD.selectByIndex(6);
		//select Texas as state province
		WebElement staEle = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select staDD=new Select(staEle);
		staDD.selectByValue("TX");
		//click the create account button
		driver.findElement(By.className("smallSubmit")).click();
		//navigate to View Account page
		return new ViewAccountPage();
	}

}
