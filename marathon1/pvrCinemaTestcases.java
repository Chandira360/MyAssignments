package marathon1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class pvrCinemaTestcases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//initialize the browser
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		//click the cinema button
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//click  the cinema 
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		//wait for a browser to load
		Thread.sleep(2000);
		//select the cinema
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		//wait for a browser to load
		Thread.sleep(2000);
		//select tomorrow
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		//wait for a browser to load
		Thread.sleep(2000);
		//select viduthalai movie
		driver.findElement(By.xpath("(//span[text()='VIDUTHALAI PART 2'])[2]")).click();
		Thread.sleep(2000);
		//select time slot to 9.45am
		driver.findElement(By.xpath("(//span[@class='mx-2'and text()='09:45 AM'])")).click();
		Thread.sleep(2000);
		//click the book button
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		//wait for a browser to load
		Thread.sleep(2000);
		//select the accept in popup
		driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		//wait for a browser to load
		Thread.sleep(2000);
		//select accept in popup
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//wait for a browser to load
		Thread.sleep(2000);
		//select the seat number as L14
		driver.findElement(By.xpath("//span[@id='EX.EXECUTIVE|L:14']")).click();
		//wait for a browser to load
		Thread.sleep(2000);
		//display the seat number
		String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("The Seat number is"+seatNo);
		//print the grand total
		String total = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println("The grand Total is"+total);
		//select on proceed button
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		Thread.sleep(2000);
		//click on error message
		driver.findElement(By.linkText("OK")).click();
		Thread.sleep(2000);
		//get the title of the page
		 System.out.println(driver.getTitle());
		//close the browser
		driver.close();
		
		
		
		
		
		
		
	}

}
