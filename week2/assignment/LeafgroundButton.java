package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize the browser
		ChromeDriver driver=new ChromeDriver();
		// navigate to the URL
		driver.get("https://leafground.com/button.xhtml");
		//Maximize the browser the browser window
		driver.manage().window().maximize();
		//click the button click and confirm title
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//verify the title od the page is Dashboard
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Dashboard"))
		{
			System.out.println("The title is correct");
			
		}
		else
		{
			System.out.println("The title is not correct");
		}
		// navigate the page back
		driver.navigate().back();
		//check whether the button confirm the button is disabled is disabled
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled();
		if (enabled){
			System.out.println("The button is enabled");
			
		}
		else
		{
			System.out.println("The button is disabled");
		}
		//get the position of the submit button
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		
		System.out.println("The position of the submit button is"+location);
		//get the button color
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("background-Color");
		System.out.println("The background color of the save button is "+cssValue);
		//get height and width of a button
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("The Height and width of the submit button is"+size);
		//close the browser
		driver.close();
	}

}
