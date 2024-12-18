package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		//click the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter company name as TestLeaf
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
		//enter the first name as chandra
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Chandra");
		//enter the last name as Senthil
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Senthil");
		//enter the firstname local as chandra
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Chandra");
		//enter department name as selenium
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Selenium");
		//enter the descripction field
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Testing Automation");
		//enter the emailid
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("tschandiralekha@gmail.com");
		//select state/province to newyork
		WebElement staEle = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select staDD=new Select(staEle);
		staDD.selectByVisibleText("New York");
		//click the submit button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//click the edit button
		driver.findElement(By.linkText("Edit")).click();
		//clear the description field
		  driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		  
		//fill the important note field
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Automation");
		//click the update button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//get title of the page
		System.out.println(driver.getTitle());
		//close the browser window
		driver.close();
		
				
	}

}
