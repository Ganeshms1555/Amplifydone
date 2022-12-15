package TestTemplet;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.qa.base.ComTestBase;
import Com.qa.pages.DashBoard;
import Com.qa.pages.FaxNumber;
import Com.qa.pages.LoginPage;

public class PurchaseNumber extends ComTestBase {
	LoginPage loginpage;

	public PurchaseNumber() throws IOException {
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
	public void FaxNumberPurchase00l() throws InterruptedException, IOException {
		loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
		Thread.sleep(1000);
		Reporter.log("Browser Open Succesfully ");
		System.out.println("browser open successfully");
		Reporter.log(" FaxNumberPurchase00l ");
		System.out.println("FaxNumberPurchase00l ");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		SoftAssert ast=new SoftAssert();
		
		FaxNumber numberadd=new  FaxNumber();
		numberadd.setfaxnumber();
		driver.findElement(By.xpath("//span[contains(text(),' ADD NUMBER')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select/div/div[2]/div)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),' United States ')]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select/div/div[2]/div)[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),' California ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select/div/div[2]/div)[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select/div/div[2]/div)[6]")).click();
		
	/*	List<WebElement>list1=driver.findElements(By.xpath("(//mat-select/div/div[2]/div)[6]"));
		Thread.sleep(2000);
		int size1=list1.size();
		System.out.println(size1); */
		
		
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-select/div/div[2]/div)[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();
		Thread.sleep(2000);
		
		Reporter.log(" Purchase New Fax Number SUCCESSFULLY ");
		
		//driver.findElement(By.xpath("(//span[contains(text(),'ADD NUMBER')])[2]")).click();
		
	
		
		

	} 
	
	@Test
	public void CountrySelection () throws InterruptedException {
		
		Thread.sleep(1000);
	//	driver.quit();
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	

}
