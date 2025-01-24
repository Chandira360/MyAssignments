package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateAccount extends ProjectSpecificMethod {
@Test(dataProvider="getData")
	public  void createAccount(String accName) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
	
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accName);
		WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		driver.executeScript("arguments[0].click()",ownershipDD);
		driver.findElement(By.xpath("//button[@aria-label='Ownership']/following::span[@title='Public']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(toastMessage);
		Assert.assertTrue(toastMessage.contains(accName),"Verify the Account name");
	}
@DataProvider
public String[][] getData() throws InvalidFormatException, IOException {
	return ExcelRead.readData("Sheet1");
}

}
