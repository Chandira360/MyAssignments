package week5.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
ChromeOptions option;
ChromeDriver driver;	
Actions action;		
@BeforeMethod
public void preCondition() throws InterruptedException {
	option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	driver = new ChromeDriver(option);
	//maximize the browser
	driver.manage().window().maximize();
	//step1:load the URL
	driver.get("https://login.salesforce.com");
	//step2:enter the username as dilip@testleaf.com
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dilip@testleaf.com");
	//step3:enter the password as leaf@2024
	driver.findElement(By.id("password")).sendKeys("Test@2025");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	//step4:click on the toggle menu button on left corner
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	Thread.sleep(2000);
	//step5:click View All and click Legal Entities
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	action=new Actions(driver);
	
	Thread.sleep(3000);
	WebElement legalEle = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	action.scrollToElement(legalEle).build().perform();
	action.moveToElement(legalEle).click().build().perform();
	Thread.sleep(2000);
	//step6:click on the dropdown bar
	driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Legal Entities']/following::one-app-nav-bar-item-dropdown")).click();
	Thread.sleep(3000);
	//step7:click new legal entity
	WebElement clickEntity = driver.findElement(By.xpath("(//a[@tabindex='-1'and @role='menuitem'])[1]"));
	action.moveToElement(clickEntity).click().build().perform();
	Thread.sleep(2000);
	}
@AfterMethod
public void postCondition() {
	driver.close();
}
}
