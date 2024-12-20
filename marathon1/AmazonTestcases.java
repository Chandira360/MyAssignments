package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonTestcases {
	public static void main(String[] args) {
	//initialize the browser
	ChromeDriver driver=new ChromeDriver();
	//load URL
	driver.get("https://www.amazon.com/");
	//IMPLICIT WAIT
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//maximize
	driver.manage().window().maximize();
	// search bags for boys 
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags For Boys");
	//enter search button
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
	//display the total numbers of results
	String results = driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
	System.out.println("The total number of Results"+results);
	//click first 2 brand names
	driver.findElement(By.xpath("//span[text()='Minecraft']")).click();
	driver.findElement(By.xpath("//span[text()='adidas']")).click();
	//choose newest Arrivals
	driver.findElement(By.xpath("//span[@class='a-dropdown-prompt' and text()='Featured']")).click();
	//select newest arrivals
	driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	//The details of the first link
	String getDet = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']")).getText();
	System.out.println("The Details of the first link is \n"+getDet);
	//the title of the page 
	System.out.println("The title of the Page is "+driver.getTitle());
	//Close the Browser
	driver.close();
}
}

