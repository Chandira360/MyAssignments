package marathon3;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteAccount extends ProjectSpecificMethod{
@Test(dataProvider="getData")
	public void deleteAccount(String accName) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(accName, Keys.ENTER);
		Thread.sleep(2000);
		String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
		String[] s = noOfItems.split(" ");
		int countBeforeDelete = Integer.parseInt(s[0]);
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
		driver.findElement(By.xpath("(//li[@class='uiMenuItem'])[2]/a")).click();
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		Thread.sleep(2000);
		noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
		s = noOfItems.split(" ");
		int countAfterDelete = Integer.parseInt(s[0]);


		Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");

	}
@DataProvider
public String[][] getData() throws InvalidFormatException, IOException {
	return ExcelRead.readData("Sheet3");
}
}
