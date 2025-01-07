package week5.assignments;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//maximize the screen
		driver.manage().window().maximize();
		//load url
		driver.get("https://www.SnapDeal.com");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//go to mens fashion
		WebElement menEle = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		Actions menClick=new Actions(driver);
		menClick.moveToElement(menEle).build().perform();
		//click sports shoe
		WebElement shoeEle = driver.findElement(By.xpath("(//span[text()=\"Sports Shoes\"])[1]"));
		menClick.moveToElement(shoeEle).click().build().perform();
		//display the shoe count
		String shoeCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The count of Shoes: "+shoeCount);
		//click the training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		//click the sort by tab
		driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']")).click();
		//select low to high
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(2000);
		//enter from value as 500
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500",Keys.ENTER);
		//enter the To value to 700
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("2000",Keys.ENTER);
		Thread.sleep(1000);
		//select the color filter
		WebElement colorEle = driver.findElement(By.xpath("(//label[@for='Color_s-White%20%26%20Blue'])/a"));
		menClick.moveToElement(colorEle).click().build().perform();
		Thread.sleep(2000);
		//select the first shoe and click quick view
		WebElement quickView = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		//System.out.println(quickView.getText());
		menClick.moveToElement(quickView).build().perform();
		//click quick view
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]/div")).click();
		//display the price with discount
		//driver.switchTo().alert();
		Thread.sleep(1000);
		String price = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
		System.out.println("The price of the product is:"+price);
		//take the screen shots
		TakesScreenshot snap=(TakesScreenshot)driver;
		File snappic = snap.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snappic,new File("D://Selenium Automation Course/Snapscreen.png"));
		System.out.println("Screenshot is captured");
		//close the current window
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		//close the browser
		driver.close();
		
		
		
		
	}

}
