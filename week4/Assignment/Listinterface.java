package week4.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listinterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//initialise the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//load url
		driver.get("https://www.ajio.com/");
		//type bags in search box
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
		//click search button
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		//select men option in gender
		driver.findElement(By.xpath("//div[@class='facet-linkfref ']/following::label[@for='Men']")).click();
		Thread.sleep(2000);
		//select fasion bags in category
		driver.findElement(By.xpath("//div[@class='facet-linkhead']/following::label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		//get the no. of bags 
		String items = driver.findElement(By.xpath("//div[@class=' filter-container']/child::div/div[@class='length']")).getText();
		//print the no.of bags
		System.out.println("The number of bags found="+items);
		//get the list of brand 
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='contentHolder']/child::div[@class='brand']"));
		//display the brand
		System.out.println("The brand of bags for men in Fashoin Category is as follows");
		for(int i=0;i<brand.size();i++) {
				WebElement name = brand.get(i);
				String brn = name.getAttribute("aria-label");
				System.out.println((i+1)+". "+brn);
		}
		System.out.println("----------------------------------------------------------------------------");
		//get the list of name of the bag
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='contentHolder']/child::div[@class='nameCls']"));
		//print the name of the bag
		System.out.println("The brand of bags for men in Fashoin Category is as follows");
		for(int i=0;i<brand.size();i++) {
				WebElement bname = bagname.get(i);
				String bag = bname.getAttribute("aria-label");
				System.out.println((i+1)+". "+bag);
		}
		}
	}


