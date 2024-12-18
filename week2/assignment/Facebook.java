package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//initialize chrome browser
				ChromeDriver driver=new ChromeDriver();
				//loading the URL
				driver.get("https://en-gb.facebook.com");
				
				//Maximize the browser
				driver.manage().window().maximize();
				//wait for the browser to load
				Thread.sleep(2000);
				//click the create new button
				driver.findElement(By.partialLinkText("Create")).click();
				//enter chandra for firstname
				driver.findElement(By.name("firstname")).sendKeys("chandra");
				//enter the surname as senthil
				driver.findElement(By.name("lastname")).sendKeys("Senthil");
				//enter the date as 8
				WebElement dayEle = driver.findElement(By.id("day"));
				Select dayDD=new Select(dayEle);
				dayDD.selectByIndex(7);
				//enter the month as December
				WebElement monEle = driver.findElement(By.id("month"));
				Select monDD=new Select(monEle);
				monDD.selectByIndex(11);
				//select year as 1993
				WebElement yearEle = driver.findElement(By.id("year"));
				Select yearDD=new Select(yearEle);
				yearDD.selectByValue("1993");
				//select gender as female
				driver.findElement(By.xpath("//label[text()='Female']")).click();
				//enter the email number as tschandiralekha@gmail.com
				driver.findElement(By.name("reg_email__")).sendKeys("tschandiralekha@gmail.com");
				//enter the password as chandra
				driver.findElement(By.name("reg_passwd__")).sendKeys("chandra");
				//click the submit button
				driver.findElement(By.name("websubmit")).click();

	}

}
