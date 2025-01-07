package week5.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooWebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//initiate driver
				ChromeDriver driver = new ChromeDriver();
				//maximize the screen
				driver.manage().window().maximize();
				//load url
				driver.get("https://finance.yahoo.com");
				//add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
				//mouse over the market tab
				WebElement yahooTab = driver.findElement(By.xpath("//span[text()='Markets']"));
				//click the crypto
				Actions tabClick=new Actions(driver);
				tabClick.moveToElement(yahooTab).click(driver.findElement(By.xpath("//div[@class='_yb_1il88ct _yb_ow-3 ']/ul/li[9]"))).build().perform();
				//fetch the number of rows
				int tabSize = driver.findElements(By.xpath("//table/tbody/tr")).size();
				System.out.println(tabSize);
				System.out.println("The names of the cryptocurrency is");
				Thread.sleep(2000);
				String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
				System.out.println(text);
				for(int i=0;i<=tabSize;i++) {
					String text1 = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
					System.out.println(text1);
					
				}
	}

}
