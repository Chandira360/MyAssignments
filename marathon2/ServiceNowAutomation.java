package marathon2;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNowAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//initiate the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Step 1.launch servicenow application
		driver.get("https://dev186929.service-now.com/");
		//maximize the window
		driver.manage().window().maximize();
		//step2:enter the credentials
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//step3:Navigate to service Catalog
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		Thread.sleep(2000);
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		//step4:click on mobile
		WebElement serviceEle = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(serviceEle);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(2000);
		//step5:click apple iphone13pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		Thread.sleep(2000);
		//step6:select yes for broken or lost mobile
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
		//step7:enter number as 99
		driver.findElement(By.xpath("(//span[@class='sn-tooltip-basic '])[2]/following::div/input[2]")).sendKeys("99");
		//step8:select unlimited in monthly allowance
		WebElement monDD = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select dataDD=new Select(monDD);
		dataDD.selectByIndex(2);
		//step9:select sierra blue in color
		driver.findElement(By.xpath("//label[@class='radio-label' and text()='Sierra Blue']")).click();
		//Actions action=new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//select storage as 512
		driver.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click();
		//step10:click ordernow button
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		//steep 11:get request url
		String text = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("The order request ID is:"+text);
		//step12:take screenshot
		File snap = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap,new File("D://Selenium Automation Course/Code Marathon/pic.png"));
		System.out.println("The screen Shot is captured");
		//close the window
		driver.close();
	}

}
