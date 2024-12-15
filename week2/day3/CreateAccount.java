package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize the chrome driver
		ChromeDriver driver=new ChromeDriver();
		//Maximize the window of the browser
		driver.manage().window().maximize();
		//Load the URL http://leaftaps.com/opentaps
		driver.get("http://leaftaps.com/opentaps");
		//enter the user name as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the CRMSFA LINK
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on the accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		//click on the create account button
		driver.findElement(By.linkText("Create Account")).click();
		//enter the account name as Testing
		driver.findElement(By.id("accountName")).sendKeys("Testing1");
		//enter the description as selenium Automation Tester
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//enter the number of Employees as 4
		driver.findElement(By.id("numberEmployees")).sendKeys("4");
		//enter the sitename as LeafTaps
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//click the create account button
		driver.findElement(By.className("smallSubmit")).click();
		//get the title of the page
		System.out.println(driver.getTitle());
		//making the driver to wait for verifying the records
		Thread.sleep(2000);
		//close the browser
		driver.close();
		
		
		
		
		

	}

}
