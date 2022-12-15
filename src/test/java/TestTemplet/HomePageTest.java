package TestTemplet;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.HomePage;
import Com.qa.pages.LoginPage;

public class HomePageTest  extends ComTestBase {

	public HomePageTest() throws IOException {
		super();
		
	}
public static Logger log = LogManager.getLogger(ComTestBase.class.getName());
	
	LoginPage loginpage;
	HomePage homepage;
	@BeforeMethod
	public void setup() throws IOException {
		initialization();	
		log.info("Driver is initialized");
		
		homepage = new HomePage();
		log.info("Loginpage object");
	}

	@Test	
	 public void HomepageTitle() throws InterruptedException {
		
	}
		
	@AfterMethod
	public void TearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
