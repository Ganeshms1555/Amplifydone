package TestTemplet;

import java.io.IOException;
import java.lang.reflect.Array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;

public class DashBoardTest extends ComTestBase {
	
	LoginPage loginpage;

	public DashBoardTest() throws IOException {
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
public void DashBoard() throws InterruptedException, IOException {
	loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
	Thread.sleep(1000);
	Reporter.log("Browser Open Succesfully ");
	System.out.println("browser open successfully");
	Reporter.log(" TEST CASE 1 ");
	System.out.println("TEST CASE 1 ");	
	
	SoftAssert ast=new SoftAssert();
	
	boolean EmptyFax=driver.findElement(By.xpath("//b[contains(text(),'No faxes yet')]")).isEnabled();
	System.out.println(EmptyFax);
	ast.assertEquals(EmptyFax, false, "No Faxes Yet (send a fax number) ");
	//ast.assertEquals(EmptyFax , true);
	System.out.println(" TEST CASE AFTER SOFT ASSERT ");
	ast.assertAll();
	
}
@AfterMethod 
public void TearDown() throws IOException, InterruptedException {
	
	Thread.sleep(4000);
	
	//driver.quit();
	
	
}
	

}
