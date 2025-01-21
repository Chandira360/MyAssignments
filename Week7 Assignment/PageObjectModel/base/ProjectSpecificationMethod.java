package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificationMethod {
	public static ChromeDriver driver;
	@BeforeMethod
public void preCondition() {
	//initialise the browser
		driver=new ChromeDriver();
		//setup implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//maximize the browser window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/");
}
	@AfterMethod
public void postCondition() {
	//close the driver
	driver.close();
}

}
