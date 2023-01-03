package Scenarios;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;

public class DownGrade extends ComTestBase{
	LoginPage loginpage;

	public DownGrade() throws IOException {
		super();

	}
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());




	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		log.info(" Driver is initialized ");
		loginpage=new LoginPage();
		log.info("Loginpage Object");
		driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("g111021992s@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys("Ganesh12345@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=1)
	public void upgrade() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'VIEW PLANS')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'UPGRADE NOW ')]")).click();
		Thread.sleep(3000);
		
		
		Thread.sleep(500);

	}
	@Test(priority=2)
	public void upgradtoProfisional() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'VIEW PLANS')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'START 7 DAY TRIAL ')]")).click();
		Thread.sleep(3000);
		
		
		Thread.sleep(500);
	}
	
	@AfterMethod
	public void TearDown () throws InterruptedException {
		Thread.sleep(500);

		log.info(" All Tab are Closed ");

		driver.close();

	}

}
