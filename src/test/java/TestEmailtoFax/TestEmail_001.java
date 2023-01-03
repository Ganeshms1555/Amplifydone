package TestEmailtoFax;

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
import Com.qa.pages.LoginPage;

public class TestEmail_001  extends ComTestBase{

	public TestEmail_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
LoginPage loginpage;
	
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());

	
		
	
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
	public void test() throws InterruptedException, IOException {
		System.out.println(" Test Email ");
		Thread.sleep(500);
	
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
