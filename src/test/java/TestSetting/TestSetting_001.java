package TestSetting;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;
import Com.qa.pages.Setting;

public class TestSetting_001 extends ComTestBase{

	public TestSetting_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
LoginPage loginpage;
	
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());

	
		
	
	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		initialization();
		log.info(" Driver is initialized ");
	loginpage=new LoginPage();
	log.info("Loginpage Object");
	driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
	loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
	Thread.sleep(1000);
	}
	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		Thread.sleep(1000);	
	}
	@Test(priority=1)
	public void testsetting() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[3]")).click();
		Thread.sleep(1000);
		Setting set=new Setting();
		WebElement se=driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]"));
		Actions act=new Actions(driver);
		act.moveToElement(se).click().build().perform();
		//set.setting();
		Thread.sleep(1000);
		set.general();
		Thread.sleep(1000);
		set.faxnumber();
		Thread.sleep(1000);
		set.notification();
		Thread.sleep(1000);
		set.team();
		Thread.sleep(1000);
		set.planaccount();
		Thread.sleep(1000);
		set.integration();
		Thread.sleep(1000);
		set.developer();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[4]")).click();
		Thread.sleep(1000);
		set.yourfax();
		
		System.out.println(" Test etting model ");
		Thread.sleep(500);
	
		Thread.sleep(500);
		
	}
	@Test(priority=2)
	public void yourfaxpage() throws InterruptedException {
		WebElement page=driver.findElement(By.xpath("//input[@formcontrolname=\"title\"]"));
		page.clear();
		Thread.sleep(1000);
		page.sendKeys("Moon");
		Thread.sleep(1000);
		WebElement pagesub=driver.findElement(By.xpath("//textarea[@formcontrolname=\"introduction\"]"));
		Thread.sleep(1000);
		pagesub.clear();
		Thread.sleep(1000);
		pagesub.sendKeys("Technolabs");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//img[@alt=\"US\"]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("india");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[contains(text(),'India')]")).click();
	    Thread.sleep(1000);
	    WebElement com=driver.findElement(By.xpath("//input[@formcontrolname=\"name\"]"));
	    Thread.sleep(1000);
	    com.clear();
	    Thread.sleep(1000);
	    com.sendKeys("PVT.Limited");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator done_btn mat-button mat-button-base\"]")).click();
	    Thread.sleep(1000);
	}
	@Test
	
	@AfterMethod()
	public void browserclosed () throws InterruptedException {
		log.info(" current bowser is closed ");
		Thread.sleep(500);
		
	}
	@AfterClass()
	public void TearDown () throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator mat-menu-trigger avatar_div mat-button mat-button-base\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'SIGN OUT')]")).click();
		Thread.sleep(4000);
		
		log.info(" All Tab are Closed ");
		 
		driver.close();
		
	}

}
