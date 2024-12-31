package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialise the chrome Driver
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//wait for the page to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//get the frame element
		WebElement element = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		//switch to the target frame
		driver.switchTo().frame(element);
		//click tryit button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch to alerts
		Alert alert = driver.switchTo().alert();
		//click yes
		alert.accept();
		//retrieve the text below the try it button
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		//display the text
		System.out.println(text);
		//close the browser
		driver.close();
	}

}
