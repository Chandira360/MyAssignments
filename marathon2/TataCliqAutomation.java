package marathon2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliqAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//initialise the chrome and disble notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		//Step 1.load the url
		driver.get("https://www.tatacliq.com");
		//maximize the window
		driver.manage().window().maximize();
		//step 2.mouseover brands
		WebElement brandEle = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions mouseOver=new Actions(driver);
		mouseOver.moveToElement(brandEle).build().perform();
		//step3.mousehover on watches and accessories
		WebElement watchEle = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		mouseOver.moveToElement(watchEle).build().perform();
		//step4. click firsr option from featured brands
		WebElement casioEle = driver.findElement(By.xpath("//div[text()='Casio']"));
		mouseOver.moveToElement(casioEle).click().build().perform();
		Thread.sleep(10000);
		//step5.select sort by:new arrivals
		WebElement dropDown = driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']/select"));
		Select sort=new Select(dropDown);
		sort.selectByVisibleText("New Arrivals");
		//step6.choose men from categories filter
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		Thread.sleep(2000);
		//step7.get the price list
		List<WebElement> priceText = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		System.out.println("The price of all watches is");
		for(int i=0;i<priceText.size();i++)
		{
			System.out.println(priceText.get(i).getText());
		}
		//get the firstprize
		String firstPrize=priceText.get(0).getText();
		//step8:click the first link
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		//step10:Compare the prizes
		Set<String> tataWindow = driver.getWindowHandles();
		List<String> windowList=new ArrayList<String>(tataWindow);
		driver.switchTo().window(windowList.get(1));
		Thread.sleep(2000);
		//get the prize of the window
		String prize = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		System.out.println("The prize of the watch is"+prize);
		String cost=prize.substring(5);
		System.out.println(cost);
		if(firstPrize.equals(cost))
		{
			System.out.println("The prizes are equal");
		}
		
		//step11:click add to cart and get the count
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		Thread.sleep(3000);
		String cartCount = driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']/span")).getText();
		System.out.println("The cart count is "+cartCount);
		//step12:Click on add to cart
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		Thread.sleep(2000);
		//step13:Take the screenShot
		TakesScreenshot snap=(TakesScreenshot)driver;
		File picture = snap.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(picture,new File("D://Selenium Automation Course/CliqPic.png"));
		//step14:Close All Windows
		driver.close();
		driver.switchTo().window(windowList.get(0));
		driver.close();
		
		
		
		
	}

}
