package week6.Assignments;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForce extends ProjectSpecificMethod{
@Test(dataProvider="excelData")
	public  void salesName(String name) throws InterruptedException {
		// TODO Auto-generated method stub
		//initiate the browser
	
		//step8:enter name as sales force automation by chandra
		String text1="Sales Force Automation by "+name;
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
@DataProvider
public String[][]excelData() throws InvalidFormatException, IOException{
	return ReadSalesXcel.salesData("Sheet1");
}


}
