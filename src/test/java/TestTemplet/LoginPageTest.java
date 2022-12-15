package TestTemplet;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;

public class LoginPageTest extends ComTestBase {
	LoginPage loginpage;

	public LoginPageTest() throws IOException {
		super();
		
	}
	 public static Logger log = LogManager.getLogger(ComTestBase.class.getName());
		

@BeforeMethod
public void setup() throws IOException {
	
	initialization(); 
	log.info("Driver is initialized");
	
	loginpage = new LoginPage();
	log.info("Loginpage object")  ;
	driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
}

@Test
public void l() throws InterruptedException, IOException {
	loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));

} 
@AfterMethod
public void teardown() throws InterruptedException {
	
	Thread.sleep(3000);
	driver.quit();
}
}
      
