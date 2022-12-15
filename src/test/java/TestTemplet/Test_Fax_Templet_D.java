package TestTemplet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;

public class Test_Fax_Templet_D extends ComTestBase {
	LoginPage loginpage;
	
	public Test_Fax_Templet_D() throws IOException {
		super();
		
	}
	
	public static org.apache.logging.log4j.Logger log = LogManager.getLogger(ComTestBase.class.getName());
	
	
	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		
		initialization(); 
		log.info("Driver is initialized");
		
		loginpage = new LoginPage();
		log.info("Loginpage object")  ;
		driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
		loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
		Thread.sleep(500);
		Reporter.log("Browser Open Succesfully ");
		System.out.println("browser open successfully");
		Reporter.log(" FaxTemplet D ");
		System.out.println("FaxTemplet D ");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button//span[contains(text(),' New Fax ')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//form/ngu-carousel/div/button[2]/img")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//form/ngu-carousel/div/button[2]/img")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//form/ngu-carousel/div/button[2]/img")).click();
		Thread.sleep(500);
		
	}
	@BeforeMethod 
	public void TempletC() throws IOException, InterruptedException {
		
		Thread.sleep(500);
	}
	
	
	
	@Test(priority=1)
	public void Templet_D_SelectCountry() throws InterruptedException {
		
		driver.findElement(By.xpath("//form/ngu-carousel/div/button[2]/img")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//form/ngu-carousel/div/div[1]/div/div[4]/div/div/mat-card/div[4]/div[1]/img")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("United States");
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
		
	}
	@Test(priority=2)
	public void To_TEXT_D() throws InterruptedException {
		
		Thread.sleep(500);
		WebElement totext=driver.findElement(By.xpath("(//input[@formcontrolname=\"ToFax\"])[4]"));
		totext.sendKeys("To Text");
		boolean isclick_able=totext.isDisplayed();
		System.out.println(isclick_able);
		Reporter.log("Form Control Name is clickable and Displayed ");
	
	}
	@Test(priority=3)
	public void FormFax_TextD() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@formcontrolname=\"FromFax\"])[4]")).sendKeys("FormFax Text");
		
	}
	@Test(priority=4)
	public void Subject_TextD() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@formcontrolname=\"Subject\"])[4]")).sendKeys("subject Text");
		
	}
	@Test(priority=5)
	public void Urgent_chechBoxD() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'Urgent')])[4]")).click();
		
		
	}
	@Test(priority=6)
	public void PeaseReply_chechBoxD() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'Please Reply')])[4]")).click();
	
	}
	@Test(priority=7)
	public void ForReview_chechBoxD() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'For Review')])[4]")).click();
		
	}
	@Test(priority=8)
	public void please_Comment_chechBoxD() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'Please Comment ')])[4]")).click();
		
	}
	@AfterMethod
	public void close() throws InterruptedException {
		
		Thread.sleep(500); //United States
		
	}
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//mat-bottom-sheet-container/app-new-fax/div/div/div[1]/div/div[1]/div[1]/button/span/mat-icon")).click();
		
		
		Thread.sleep(500);
	    driver.quit();
	}

}
