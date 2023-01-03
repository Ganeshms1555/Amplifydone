package Test_Fax_NumberCountrywithArea;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.FaxNumber;
import Com.qa.pages.HomePage;
import Com.qa.pages.LoginPage;

public class Canada_001 extends ComTestBase {
	public Canada_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	LoginPage loginpage;
	HomePage homepage;
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
			loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
			
			
		}
		 @BeforeMethod
		 public void fn1() throws InterruptedException {
			 Thread.sleep(500);
		 }
		 @Test
		 public void newfaxnumber() throws IOException, InterruptedException {
			 FaxNumber can=new FaxNumber();
			 can.setfaxnumber();
			 can.setcountry();
			 driver.findElement(By.xpath("//span[contains(text(),' Canada ')]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-dialog-container/app-select-fax-pro-dialoge/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div/div[2]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();			// can.set
		 List<WebElement> canada=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
		 int size=canada.size();
		 System.out.println(size);
		 for(WebElement name:canada) {
			String all= name.getText();
			System.out.println(all);
			
			
		
		 }
		 }
		 @AfterMethod 
		 public  void endMethod () throws InterruptedException {
			 Thread.sleep(1000);
		 }
		 @AfterClass
		 public void teardown() throws InterruptedException {
			 //driver.quit();
			 Thread.sleep(1000);
		 }

}
