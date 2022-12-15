package TestDone;

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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Com.qa.base.ComTestBase;
import Com.qa.pages.Contacts;
import Com.qa.pages.Done;
import Com.qa.pages.LoginPage;

public class TestDone_001 extends ComTestBase {
	
private static final boolean fails = false;




public TestDone_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
LoginPage loginpage;
Done d;

ExtentReports extent;
@SuppressWarnings("deprecation")
ExtentHtmlReporter htmlReporter ;

	
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());

	
		
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		htmlReporter = new ExtentHtmlReporter("Report in.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
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
	@Test(enabled=fails)
	public void test() throws InterruptedException, IOException {
		ExtentTest test = extent.createTest(" Statuse Fax showes it moves in Done Folder Or not On singlr click ");
		WebElement move =driver.findElement(By.xpath("//span[contains(text(),'Delivered')]"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(move).perform();
		test.log(Status.INFO," mouse over on Fax and show message as DONE  and NOT DONE");
		
//		driver.findElement(By.xpath("(//span[contains(text(),' Done ')])[2]")).click();
		
		WebElement done =driver.findElement(By.xpath("//app-header-sidebar/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[7]/div[1]/div[1]/button[1]/span[1]"));
		
		done.click();
		Thread.sleep(1000);done.click();
		test.log(Status.INFO," Once click on Done tab Message shows successfully DONE ");
		Thread.sleep(1000);done.click();
		test.log(Status.INFO," double click on Done tab  Message shows successfully NOT-DONE ");
		
		Thread.sleep(1000);done.click();
		Thread.sleep(1000);done.click();
		Thread.sleep(1000);done.click();
		Thread.sleep(1000);done.click();
		Thread.sleep(1000);done.click();
		Thread.sleep(1000);done.click();
		Thread.sleep(1000);
		
		
		test.pass("  Test case of Fuction of  Done button  is Pass");
		System.out.println(" Test Contact Number ");
		Thread.sleep(500);
	
		Thread.sleep(500);
		
	}
	@Test(priority=2)
	public void Mail() throws IOException, InterruptedException {
		Done d=new Done();
		ExtentTest test = extent.createTest(" Verify and Validate search box,refresh svg,userEmail ckeckbox ");
		d.pageout();
		d.search();
		test.log(Status.INFO," Click on Search Box and Enter text of ( Team )");
		Thread.sleep(1000);
		d.pageout();
		test.pass(" Test Pass of verification and validation of search box ");
		d.refresh();
		test.log(Status.INFO," Click on refresh svg ");
		Thread.sleep(1000);
		d.pageout();
		test.pass(" validate refresh svg " );
		Thread.sleep(1000);
		d.mail();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
	
	
	}
	@Test(priority=3)
	public void AnyDirection() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest(" Verify Any Direction List Box ");
		
		Done d=new Done();
		test.log(Status.INFO," click on Any Direction List Box ");
		Thread.sleep(1000);
		d.anydirection();
		test.pass(" Any Direction list Box Test Case pass ");
		Thread.sleep(1000);
		driver.navigate().refresh();
	
		
		
	}
	@Test(priority=4)
	public void AnyStatus() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest(" verify AnyStatus List Box ");
		Done d=new Done();
		Thread.sleep(1000);
		d.anystatus();
		test.log(Status.INFO," click on AnyStatus List Box ");
		Thread.sleep(1000);
		test.pass(" Any Status list Box Test Case pass ");
		driver.navigate().refresh();
		Thread.sleep(1000);
		
	}
	@Test(priority=5)
	public void AnyTime() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest(" verify AnyTime  List Box ");
		Done d=new Done();
		Thread.sleep(1000);
		d.anytime();
		test.log(Status.INFO," click on AnyTime  List Box ");
		Thread.sleep(1000);
		test.pass(" AnyTime list Box Test Case pass ");
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void listAnyMedium() throws IOException, InterruptedException {
		d=new Done();
		d.pageout();
		Thread.sleep(1000);
		d.mail();
		ExtentTest test=extent.createTest(" Test Any Medium select and Deselect fuctionality  ");
		test.log(Status.INFO,"  Click on list of Any Medium ");
		test.log(Status.INFO," Verify and Validate Check Box ");
		WebElement DeselectAllmedium=driver.findElement(By.xpath("//span[contains(text(),'Deselect All')]"));
		DeselectAllmedium.click();
		System.out.println(DeselectAllmedium.isDisplayed());
		test.pass(" Verify the select /deselect button with Displayed method ");
		System.out.println(DeselectAllmedium.isEnabled());
		test.pass(" Validate it by click action perform on it ");
		System.out.println(DeselectAllmedium.isSelected());
		DeselectAllmedium.click();
		WebElement check1=driver.findElement(By.xpath("(//div[@class=\"mat-checkbox-inner-container\"])[2]"));
		WebElement check2=driver.findElement(By.xpath("(//div[@class=\"mat-checkbox-inner-container\"])[3]"));
		
		WebElement check3=driver.findElement(By.xpath("(//div[@class=\"mat-checkbox-inner-container\"])[4]"));
	
		check1.click();Thread.sleep(2000);check2.click();Thread.sleep(2000);check3.click();Thread.sleep(2000);
		check1.click();Thread.sleep(2000);check2.click();Thread.sleep(2000);check3.click();Thread.sleep(2000);
		test.log(Status.INFO,"verify and validate all check box ");
		
		driver.navigate().refresh();
	
	
	}
	@Test(priority=7)
	public void listAnyDirection() throws IOException, InterruptedException {
		ExtentTest test= extent.createTest(" Test Any Direction list Box ");
		d=new Done();
		driver.navigate().refresh();
		d.pageout();
		Thread.sleep(1000);
		d.anydirection();
		test.log(Status.INFO,"  Click on listbox of Any Direction ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-option[@value=\"Any direction\"]")).click();
		Thread.sleep(1000);
		d.anydirection();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-option[@value=\"Incoming\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Incoming')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-option[@value=\"Outgoing\"]")).click();
		Thread.sleep(2000);
		test.pass(" Validate All Any Direction list box  ");
		
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
		extent.flush();
	}

}
