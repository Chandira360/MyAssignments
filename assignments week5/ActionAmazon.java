package week5.assignments;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//maximize the screen
		driver.manage().window().maximize();
		//load url
		driver.get("https://www.amazon.in");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//search oneplus 9 pro
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("One plus 9 Pro",Keys.ENTER);
		//get the prize of first phone
		String mobPrize = driver.findElement(By.xpath("(//div[@data-cy='price-recipe'])[1]/div/div/a/span[@class='a-price']")).getText();
		System.out.println("The prize of the first Mobile is:"+mobPrize);
		//display the no of customer given ratings
		String ratings = driver.findElement(By.xpath("(//div[@data-cy='reviews-block']/div/a)[1]")).getText();
		System.out.println("The number of customers given reviews:"+ratings);
		//click the first link
		driver.findElement(By.xpath("(//div[@data-cy='title-recipe'])[1]")).click();
		//get the window handles
		Set<String> amazonHandles = driver.getWindowHandles();
		List<String>handleList=new ArrayList<String>(amazonHandles);
		driver.switchTo().window(handleList.get(1));
		Thread.sleep(2000);
		//to take screenshot
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("D://Selenium Automation Course/Screen.png"));
		System.out.println("Screenshot is captured");
		driver.switchTo().window(handleList.get(1));
		//press add to cart button
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		//Actions buttonclick=new Actions(driver);
		//buttonclick.moveToElement(cartEle).click().build().perform();
		Thread.sleep(2000);
		//get the total 
		String total = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println(total);
		
		
		//closing the driver
		driver.quit();
	}

}
