package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseLead{
	
	@When ("click on the Find-leads link")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When ("click on phone tab")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
	}
	@Given ("enter the phonenumber as {string}")
	public void enterPhoneno(String phno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		
	}
	@When ("click on Find Lead button")
	public void clickFind() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
	}
	@When ("click on First link")
	public void clickLink() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}
	@When ("click on Edit button")
	public void clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		
	}
	@Given ("Update company name as {string}")
	public void updateCmpyname(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		
	}
	@When ("click on Submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		
	}
	@Then ("Verify the page")
	public void verifyPage() {
		System.out.println(driver.getTitle());
	}
}
