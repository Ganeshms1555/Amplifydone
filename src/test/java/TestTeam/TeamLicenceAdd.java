package TestTeam;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;
import Com.qa.pages.Team;

public class TeamLicenceAdd extends ComTestBase {

	public TeamLicenceAdd() throws IOException {
		super();
	
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
	@Test
	public void test() throws InterruptedException, IOException {
		Team t=new Team();
		t.setadd();
		WebElement number=driver.findElement(By.xpath("//input[@type=\"number\"]"));
		number.clear();
		Thread.sleep(1000);
		number.sendKeys("0");
		WebElement negativeprice= driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator plus_minus_btn minus mat-button mat-button-base\"]"));
		
		negativeprice.click();
		Thread.sleep(500);
		negativeprice.click();Thread.sleep(500);
		negativeprice.click();Thread.sleep(500);
		negativeprice.click();Thread.sleep(500);
		
		String value = number.getText();
		System.out.println(value);
		Assert.assertEquals(number,1 ," input box should not accept negative value");
		
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
