package TestContact;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.Contacts;
import Com.qa.pages.DashBoard;
import Com.qa.pages.HomePage;
import Com.qa.pages.LoginPage;

public class TestContact_001 extends ComTestBase{
	LoginPage loginpage;
	
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());

	public TestContact_001() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		initialization();
		log.info(" Driver is initialized ");
	loginpage=new LoginPage();
	log.info("Loginpage Object");
	driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
	loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
		
	Thread.sleep(1000);
	}
	@Test
	public void contact() throws InterruptedException, IOException {
		Thread.sleep(500);
		Contacts co= new Contacts();
		co.setcontact();
		driver.findElement(By.xpath("//span[contains(text(),' New Contact ')]")).click();
		Thread.sleep(1000);	
	
		
		driver.findElement(By.xpath("//button[contains(text(),' Import Multiple Contacts ')]")).click();
		
		// nuew number
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@aria-label=\"Number\"])[1]")).sendKeys("919970948266");
		// contact name 
		Thread.sleep(500);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Firstname\"]")).sendKeys("555");
	
		
		Thread.sleep(1000);
		//contact last name 
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder=\"Lastname\"]")).sendKeys("555");
		//save  contact
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),' Dashboard')]")).click();
		Thread.sleep(1000);
		
		
		
		// did not show contact already saved
		Thread.sleep(500);
		
		co.setcontact();
		driver.findElement(By.xpath("//span[contains(text(),' New Contact ')]")).click();
		Thread.sleep(1000);	
	
		
		driver.findElement(By.xpath("//button[contains(text(),' Import Multiple Contacts ')]")).click();
		
		// nuew number
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@aria-label=\"Number\"])[1]")).sendKeys("919970948266");
		// contact name 
		Thread.sleep(500);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Firstname\"]")).sendKeys("555");
	
		
		Thread.sleep(1000);
		//contact last name 
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder=\"Lastname\"]")).sendKeys("555");
		//save  contact
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'+91 99709 48266')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		
	//	driver.findElement(By.xpath("//span[contains(text(),' Dashboard')]")).click();
		Thread.sleep(1000);
	}
	@Test(invocationCount = 1)//(enabled=false)
	public void singalcontact() throws InterruptedException, IOException {
		Thread.sleep(500);
		Contacts co= new Contacts();
		co.setcontact();
		driver.findElement(By.xpath("//span[contains(text(),' New Contact ')]")).click();
		
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),' Create Contact ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).sendKeys("fname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).sendKeys("lname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"companyName\"]")).sendKeys("cname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"jobTitle\"]")).sendKeys("jtital");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"directMessage\"]")).sendKeys("1@5.6");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'cname')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-icon[@role=\"img\"])[16]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Delete Contact')]")).click();
		Thread.sleep(1000);
		
		
		
		
	}
//	@Test
//	public void Multiplecontact() throws InterruptedException {
//		driver.navigate().refresh();
//		
//        Thread.sleep(2000);
//    //    driver.findElement(By.xpath("//span[contains(text(),' New Contact ')]")).click();
//		Thread.sleep(1000);	
//		
//		driver.findElement(By.xpath("//button[contains(text(),' Import Multiple Contacts ')]")).click();
//		 Thread.sleep(2000);
//	}
	@AfterMethod()
	public void browserclosed () throws InterruptedException {
		log.info(" current bowser is closed ");
		Thread.sleep(1000);
	//	driver.close();
	}

}
