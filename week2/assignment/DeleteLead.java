package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize chrome browser
		ChromeDriver driver=new ChromeDriver();
		//loading the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the user name as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the CRMSFA LINK
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click the leads tab
		driver.findElement(By.linkText("Leads")).click();
		//click on find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//fetching first element in forms
		String text = driver.findElement(By.xpath(("(//a[@class='linktext'])[4]"))).getText();
		System.out.println(text);
		//click the link
		driver.findElement(By.xpath(("(//a[@class='linktext'])[4]"))).click();
		//click the delete button
		driver.findElement(By.linkText("Delete")).click();
		//click the find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		//enter the captured value
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		//click the find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//fetching the value
		String records = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(records);
		//close the browser
		driver.close();
	}

}
