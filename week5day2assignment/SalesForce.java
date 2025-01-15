package week5.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesForce extends ProjectSpecificMethod{
@Test
	public  void salesName() throws InterruptedException {
		// TODO Auto-generated method stub
		//initiate the browser
	
		//step8:enter name as sales force automation by chandra
		String text1="Sales Force Automation by Chandra";
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(text1);
		//step9:click save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		//verify the name
		String text2 = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		if(text1.equalsIgnoreCase(text2)) {
			System.out.println("The name is verified");
		}
		
	}

}
