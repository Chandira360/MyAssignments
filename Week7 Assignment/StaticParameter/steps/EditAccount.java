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

public class EditAccount extends Base {
	
	@Given("Login the salesforce application")
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
	@When ("click the app launcher icon.")
	public void clickAppLauncher() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
	}
	@When ("select view all.")
	public void viewAll() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Thread.sleep(3000);
	}
	@When ("click accounts")
	public void clickAccounts() {
		action=new Actions(driver);
		WebElement legalEle = driver.findElement(By.xpath("//p[text()='Accounts']"));
		action.moveToElement(legalEle).click().build().perform();
	}
	@Given ("search the unique name.")
	public void searchUnique() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Chandra",Keys.ENTER);
		Thread.sleep(2000);
		
	}
	@When ("click the dropdown and select edit.")
	public void selectEdit() {
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]/span/div")).click();
		driver.findElement(By.xpath("(//li[@role='presentation' and @class='uiMenuItem'])[1]/a")).click();
		
		
	}
	@Given ("set type to Technology partner")
	public void setType() {
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//button[@aria-label='Type']")).click();
		driver.findElement(By.xpath("//span[@title='Technology Partner']")).click();
		
	}
	@Given ("set industry to healthcare")
	public void setIndustry() throws InterruptedException {
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//button[@aria-label='Industry']")).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//span[@title='Healthcare']")).click();
		
	}
	@Given ("enter the billing address as {string}")
	public void enterBillingaddr(String billCity) {
		driver.findElement(By.xpath("(//textarea[@name='street'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@name='street'])[1]")).sendKeys("MGR Street");
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.xpath("(//input[@name='city'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys(billCity);
			
	}
	@Given ("enter the shipping address as {string}")
	public void enterShippingAddr(String shipCity) {
		driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).clear();
		driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("GK Street");
		driver.findElement(By.xpath("(//input[@name='city'])[2]")).sendKeys(shipCity);
		
			
	}
	@When ("set customer priority to low")
	public void setPriority() throws InterruptedException {
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Customer Priority']")).click();
		driver.findElement(By.xpath("//span[@title='Low']")).click();
		
	}
	@When ("set SLA to silver")
	public void setSLA() {
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//span[@title='Silver']")).click();
		
	}
	@When ("set active to no")
	public void setActive() {
		driver.findElement(By.xpath("//button[@aria-label='Active']")).click();
		driver.findElement(By.xpath("//span[@title='No']")).click();
		
	}
	@Given ("enter unique phonenumber as {string}")
	public void enterPhno(String phone) {
		phno="989";
		driver.findElement(By.xpath("//input[@name='Phone']")).clear();
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys(phone);
		
	}
	@When ("set upsell opportunity to no")
	public void setUpsell() throws InterruptedException {
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']")).click();
		driver.findElement(By.xpath("//span[@title='No']")).click();
		
	}
	@When ("click save and verify phno")
	public void verifyPhno() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/span")).getText();
		System.out.println(text);
		if(phno.equals(text)) {
			System.out.println("The phone number is verified");
		}
	}
}
