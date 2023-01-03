package TestFolder;

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
import org.testng.asserts.SoftAssert;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;
import Com.qa.pages.Team;

public class TestFolder_001 extends ComTestBase {

	




	public TestFolder_001() throws IOException {
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
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		
	Thread.sleep(1000);
	}
	@Test(priority=1)
	public void ClickOnTeam() throws InterruptedException, IOException {
		Team t=new Team();
		t.setadd();
		
		WebElement number=driver.findElement(By.xpath("//input[@type=\"number\"]"));
		number.clear();
		Thread.sleep(1000);
		number.sendKeys("0");
		Thread.sleep(1000);
		WebElement value=driver.findElement(By.xpath("//p[@style=\"display: flex;\"]"));
		String price=value.getText();
		System.out.println("the value of ZERO team licences -:"+price);
	
		Assert.assertEquals(price,0);
		driver.close();

		
		Thread.sleep(500);	
		
		
	}
	@Test(priority=2)
	public void numberofLicences() throws InterruptedException, IOException {
		Team t=new Team();
		t.setadd();
		
		WebElement number=driver.findElement(By.xpath("//input[@type=\"number\"]"));
		System.out.println(number.getText());
		
		number.clear();
		Thread.sleep(1000);
		number.sendKeys("1");
		Thread.sleep(1000);
		number.clear();
		number.sendKeys("0");
		
		WebElement negative=driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator plus_minus_btn minus mat-button mat-button-base\"]"));
		negative.click();
		Thread.sleep(500);
		negative.click();
		Thread.sleep(500);
		Thread.sleep(500);
		negative.click();
		Thread.sleep(500);
		negative.click();
		
		Assert.assertEquals(-4," negative number will not accepted");
		Thread.sleep(1000);
		
		Thread.sleep(500);
		driver.close();
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
		 

		
	}
	

}
