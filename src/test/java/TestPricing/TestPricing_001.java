package TestPricing;

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
import Com.qa.pages.HomePage;
import Com.qa.pages.LoginPage;
import Com.qa.pages.Pricing;

public class TestPricing_001 extends ComTestBase{

	public TestPricing_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
LoginPage loginpage;
HomePage home;
Pricing price;



	
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());

	
		
	
	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		initialization();
		log.info(" Driver is initialized ");
	loginpage=new LoginPage();
	log.info("Loginpage Object");
	driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
	Thread.sleep(1000);
	loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
	Thread.sleep(1000);
	}
	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		Thread.sleep(1000);
	}
	@Test(priority=1)
	public void test() throws InterruptedException, IOException {
		home=new HomePage();
		home.dashboardpricing();
		price=new Pricing();
		price.plan();
		Thread.sleep(1000);
		price.modifyplan();
		Thread.sleep(1000);
		price.modifyclosed();
		
		Thread.sleep(1000);
	
	}
	@Test(priority=2)
	public void test1() throws InterruptedException, IOException {
		price.account();
		Thread.sleep(1000);
		
		Thread.sleep(500);
		price.fname();
		Thread.sleep(500);
		price.lname();
		Thread.sleep(500);
		price.cname();
		Thread.sleep(500);
		price.jobtitle();
		Thread.sleep(500);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Account Manager')]")).click();
		Thread.sleep(1000);
	//	price.settingclosed();
	
	}
	@Test(priority=3)
	public void editeemail() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@mattooltip=\"Edit Email\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"newemail\"]")).sendKeys("ifax10102@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"confirmemail\"]")).sendKeys("ifax10102@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/mat-dialog-container/app-account-details-popup/div/button/span/mat-icon")).click();
		Thread.sleep(1000);
		
	}

	@Test(priority=4)
	public void editenumber() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@mattooltip=\"Edit Phone number\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/mat-dialog-container/app-phone-number-dialog/form/button/span/mat-icon")).click();
		Thread.sleep(1000);
		
		
		
	}
	@Test(priority=5)
	public void editepass() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@mattooltip=\"Edit Password\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Current Password\"]")).sendKeys("asdf@1");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"New Password\"]")).sendKeys("asdf@1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Confirm Password\"]")).sendKeys("asdf@1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/mat-dialog-container/app-account-details-popup/div/button/span/mat-icon")).click();
		Thread.sleep(1000);
		
		
	}
	@Test(priority=6)
	public void twostepverification () throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-slide-toggle[@id=\"mat-slide-toggle-2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-slide-toggle[@id=\"mat-slide-toggle-2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-slide-toggle[@id=\"mat-slide-toggle-2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-slide-toggle[@id=\"mat-slide-toggle-2\"]")).click();
		Thread.sleep(2000);
		
		price.settingclosed();
	}
	
	
	@AfterMethod()
	public void browserclosed () throws InterruptedException {
		log.info(" current bowser is closed ");
		Thread.sleep(2000);
		
				
	}
	@AfterClass()
	public void TearDown () throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"avatar_img\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'SIGN OUT')]")).click();
		Thread.sleep(1000);
		
		log.info(" All Tab are Closed ");
		 
		driver.close();
		
	}

}
