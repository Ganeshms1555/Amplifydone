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
import Com.qa.pages.HomePage;
import Com.qa.pages.LoginPage;

public class TestContact_001 extends ComTestBase{
	LoginPage loginpage;
	
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());

	public TestContact_001() throws IOException {
		super();
		
	}
	@BeforeClass
	public void setup() throws IOException {
		initialization();
		log.info(" Driver is initialized ");
	loginpage=new LoginPage();
	log.info("Loginpage Object");
	driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
	}
	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
	Thread.sleep(1000);
	}
	@Test
	public void contact() throws InterruptedException, IOException {
		System.out.println(" Test Contact Number ");
		Thread.sleep(500);
		Contacts co= new Contacts();
		co.setcontact();
		driver.findElement(By.xpath("//span[contains(text(),' New Contact ')]")).click();
		
		
		Thread.sleep(500);
		
	}
	@AfterMethod()
	public void browserclosed () throws InterruptedException {
		log.info(" current bowser is closed ");
		Thread.sleep(500);
		
	}
	@AfterClass()
	public void TearDown () throws InterruptedException {
		Thread.sleep(500);
		
		log.info(" All Tab are Closed ");
		 
		driver.close();
		
	}
	



}
