package week5.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//initiate driver
		ChromeDriver driver = new ChromeDriver();
		//maximize the screen
		driver.manage().window().maximize();
		//load url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//enter the user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click submit
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//select contacts
		driver.findElement((By.xpath("//a[text()='Contacts']"))).click();
		//select Merge Contacts
		driver.findElement((By.xpath("//a[text()='Merge Contacts']"))).click();
		//click on the widget of first contact
		driver.findElement(By.xpath("//table[@baseclass='dijitComboBoxNoArrow']/following::a/img")).click();
		//get the window handles
		Set<String> mergeWindow = driver.getWindowHandles();
		List<String>mergeHandle=new ArrayList<String>(mergeWindow);
		//switch to new window
		driver.switchTo().window(mergeHandle.get(1));
		//fetch the first record
		driver.findElement(By.xpath("(//table)[4]/tbody/tr/td/div/a")).click();
		//switch to main window
		driver.switchTo().window(mergeHandle.get(0));
		//click on the widget of to contact
		driver.findElement(By.xpath("//input[@name='partyIdTo']/following-sibling::a/img")).click();
		//get the window handles
		Set<String> mergetoWindow = driver.getWindowHandles();
		List<String>mergetoHandle=new ArrayList<String>(mergetoWindow);
		//switch to new window
		driver.switchTo().window(mergetoHandle.get(1));
		//fetch the second record
		driver.findElement(By.xpath("(//table)[5]/tbody/tr/td/div/a")).click();
		//switch to main window
		driver.switchTo().window(mergetoHandle.get(0));
		//click the merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//accept the alert
		Alert mergealert=driver.switchTo().alert();
		mergealert.accept();
		Thread.sleep(2000);
		//get the title of the page
		System.out.println("The title of the page"+driver.getTitle());
		driver.close();
		
		
	}

}
