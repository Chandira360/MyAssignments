package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesAccount extends Base {
	
	
	@Given ("login the salesforce application")
	public void login() throws InterruptedException {
		option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		//maximize the browser
		driver.manage().window().maximize();
		//step1:load the URL
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//enter the username as dilip@testleaf.com
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dilip@testleaf.com");
		//enter the password as leaf@2024
		driver.findElement(By.id("password")).sendKeys("Test@2025");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);	
	}
	
	@When ("click on the toggle menu button")
	public void clickToggle() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
	}
	
	@When ("select viewall")
	public void selViewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	
	@When ("click on sales")
	public void clickSales() throws InterruptedException {
		action=new Actions(driver);
		Thread.sleep(3000);
		
		WebElement legalEle = driver.findElement(By.xpath("//p[text()='Sales']"));
		
		action.moveToElement(legalEle).click().build().perform();
		Thread.sleep(3000);
	}
	
	@When ("click on Accounts tab")
	public void clickAccount() {
		driver.findElement(By.xpath("(//span[text()='Accounts']/following::div[1])[1]")).click();
	}
	
	@When ("click on new")
	public void clickNew() throws InterruptedException {
		Thread.sleep(2000);
		WebElement accEle = driver.findElement(By.xpath("//span[text()='New Account']"));
		action.moveToElement(accEle).click().build().perform();
		
	}
	
	@Given ("enter account name")
	public void enterAcctName() {
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	
	@Given ("give ownership")
	public void ownership() {
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//button[@aria-label='Ownership']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Ownership']/following::span[@title='Public']")).click();
		
	}
	
	@When ("click save")
	public void clickSave() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
		
	}
	
	@Then ("Verify Account Name")
	public void verifyAccname() {
		String text = driver.findElement(By.xpath("//lightning-formatted-text[text()='Chandra']")).getText();
		if(name.equals(text)) {
			System.out.println("The name is verified: "+name);
				
	}
}
}
