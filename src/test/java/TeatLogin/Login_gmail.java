package TeatLogin;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;

public class Login_gmail extends ComTestBase {

	public Login_gmail() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage loginpage;
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());
	
	@BeforeClass
	public void browseropen() throws IOException, InterruptedException {
		initialization(); 
		log.info("Driver is initialized");
		
		loginpage = new LoginPage();
		log.info("Loginpage object")  ;
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
		Thread.sleep(500);
		
	}
	@Test
	public void google() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'CONTINUE WITH GOOGLE')]")).click();
//		Thread.sleep(1000);
//		WebElement frame=driver.findElement(By.xpath("//div[@role=\"presentation\"]"));
//		driver.switchTo().frame(frame);
		
//		Thread.sleep(1000);
//		 driver.findElement(By.xpath("//span[contains(text(),'CONTINUE WITH GOOGLE')]")).click();
//	      // window handles
//	      Set wnd = driver.getWindowHandles();
//	      // window handles iterate
//	      Iterator i = wnd.iterator();
//	      String popwnd = (String) i.next();
//	      String prntw = (String) i.next();
//	      // switching pop up tab
//	      driver.switchTo().window(popwnd);
//	      driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ganesh@moontechnolabs.com");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Annu@1011");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		System.out.println(" login with google Account ");
		
	}
	 
	
	@AfterClass
	public void teardown() throws InterruptedException {
		
		
		Thread.sleep(1000);
		driver.quit();
	}

}
