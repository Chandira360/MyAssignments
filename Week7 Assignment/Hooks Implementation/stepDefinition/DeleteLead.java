package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseLead{
	
	@When ("click on the Find leads link")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When ("click on phone-tab")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
	}
	@Given ("enter the phone number as {string}")
	public void enterPhoneno(String phno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		
	}
	@When ("click on Find-Lead button")
	public void clickFind() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
	}
	@When ("click on First-link")
	public void clickLink() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		
	}
	@When ("click on Delete button")
	public void clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
		
	}
	@When ("click on Find Lead")
	public void clickFinds() {
		driver.findElement(By.linkText("Find Leads")).click();
		
	}
	@Given ("enter  leadID deleted before and find")
	public void enterID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Then ("Verify the records") 
	public void verifyRecord() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
}
