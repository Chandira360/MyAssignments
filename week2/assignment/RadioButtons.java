package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://www.leafground.com/radio.xhtml");
		//wait for the browser to load
		Thread.sleep(2000);
		//maximize the window
		driver.manage().window().maximize();
		//select the most favourite browser
		driver.findElement(By.xpath("//label[text()='Safari']")).click();
		//verify the button is unselectable
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selection = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
	
		if (selection)
		{
			System.out.println("The button is not unselectable");
		}
		else
		{
			System.out.println("The button is unselectable");
		}
		//identify the default value of button
		// driver.findElement(By.xpath("(//label[text()='Chrome'])[2]")).click();
		boolean safbutton = driver.findElement(By.xpath("//input[@value='Option3'and @checked='checked']")).isSelected();
		
		 System.out.println(safbutton);
	if(safbutton) {
			System.out.println("Safari is the default browser");
		}
		boolean selVal = driver.findElement(By.xpath("//input[@value='21-40 Years'and @checked='checked']")).isSelected();
		if(selVal)
		{
			System.out.println("The value is already selected");
		}
		else {
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		}
		//close the browser
		driver.close();
		}
	}


