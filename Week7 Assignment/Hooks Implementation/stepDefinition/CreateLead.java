package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseLead{
	
	
	@When("click on the create lead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("enter the company name as {string}")
	public void enterCmpyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@And("enter the first name as {string}")
	public void enterFstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@And("enter the last name as {string}")
	public void enterLstName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("click on submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("verify the lead is created")
	public void verifyLead() {
		System.out.println(driver.getTitle());
	}
}
