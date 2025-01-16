package week6.Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesForceClasscompany extends ProjectSpecificMethod {
@Test
	public  void salesCompany() throws InterruptedException {
		
				//step8:enter company as'testleaf'
				driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
				//step9:enter description as sales force
				driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("SalesForce");
				Thread.sleep(2000);
				action.sendKeys(Keys.PAGE_DOWN).build().perform();
				//step10:select status as active
				Thread.sleep(2000);
				 driver.findElement(By.xpath("//span[text()='--None--']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Active']")).click();
				//step11:click save
				driver.findElement(By.xpath("//button[text()='Save']")).click();
				Thread.sleep(2000);
				//step12:Verify Alert Message
				String text = driver.findElement(By.xpath("(//div[@part='help-text' and @class='slds-form-element__help'])[2]")).getText();
				System.out.println("The error message is \n"+text);
				Thread.sleep(2000);
				
	}

}
