package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeafAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize chrome browser
		ChromeDriver driver=new ChromeDriver();
		//loading the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the user name as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the CRMSFA LINK
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on the accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		//click on the create account button
		driver.findElement(By.linkText("Create Account")).click();
		//enter the account name as Testing
		driver.findElement(By.id("accountName")).sendKeys("Tester2");
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
		//get the title of the page
		System.out.println(driver.getTitle());
		
	
		//to close the browser
		driver.close();
	}

}
