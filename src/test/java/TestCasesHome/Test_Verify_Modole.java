package TestCasesHome;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import Com.qa.pages.HomePage;
import Com.qa.pages.LoginPage;

public class Test_Verify_Modole extends ComTestBase {
	LoginPage loginpage;
	HomePage homepage;
	ExtentReports extent;
	@SuppressWarnings("deprecation")
	ExtentHtmlReporter htmlReporter ;

	public Test_Verify_Modole() throws IOException {
		super();

	}
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void extent() throws IOException, InterruptedException {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
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
	public void browseropen() throws IOException, InterruptedException {
		Thread.sleep(500);

	}

	@Test //(expectedExceptions=org.openqa.selenium.ElementNotInteractableException.class)
	public void homemode_l () throws IOException, InterruptedException {

		ExtentTest test = extent.createTest("Login Test with  DashBoard Click");

		Thread.sleep(500);
		homepage =new HomePage();
		// log(Status, details)
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		homepage.dashboardhome();
		// 
		test.pass(" Test Case Pass  Click on dashboard ");
		Thread.sleep(2000);
		
	}
	@Test(priority=2)
	public void homemode_2 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with  dashboardinbox Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardinbox();
		test.pass(" Test Case Pass  Click on dashboardinbox ");
		Thread.sleep(2000);

	}
	@Test(priority=3)
	public void homemodel_3 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with  Dashboard Done Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboarddone();
		test.pass(" Test Case Pass  Click on Dashboard Done ");
		Thread.sleep(2000);

	}
	@Test(priority=4)
	public void homemodel_4 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with  Dashboard Foldersx Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardfolders();
		test.pass(" Test Case Pass  Click on Dashboard Foldersx ");
		Thread.sleep(2000);

	}
	@Test(priority=5)
	public void homemodel_5 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with Dashboard Team Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardteam();
		test.pass(" Test Case Pass  Click on Dashboard Team ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-setting/div/mat-toolbar/div[2]/button")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//button[@type=\"button\"])[6]")).click();

	}
	@Test(priority=6)
	public void homemodel_6 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with Dashboard Faxnumbers Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardfaxnumbers();
		test.pass(" Test Case Pass  Click on Dashboard Faxnumbers ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-setting/div/mat-toolbar/div[2]/button")).click();
		Thread.sleep(1000);
	}
	@Test(priority=7)
	public void homemodel_7 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with Dashboard Contacts Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardcontacts();
		test.pass(" Test Case Pass  Click on Dashboard Contacts ");
		Thread.sleep(2000);
	}
	@Test(priority=8)
	public void homemodel_8 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with with Dashboard Reports Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardreports();
		test.pass(" Test Case Pass  Click on Dashboard Reports ");
		Thread.sleep(2000);
	}
//	@Test(priority=9)
//	public void homemodel_9 () throws IOException, InterruptedException {
//		
//		ExtentTest test = extent.createTest("Login Test with Dashboard Email to fax Click");
//		
//		Thread.sleep(500);
//		homepage =new HomePage();
//		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
//		
//		homepage.dashboardemailtofax();
//		test.pass(" Test Case Pass  Click on Dashboard Email to fax ");
//		Thread.sleep(2000);
//	}
	@Test(priority=10)
	public void homemodel_10 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with Dashboard Broad Cast Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardbroadcast();
		test.pass(" Test Case Pass  Click on Dashboard Broad Cast ");
		Thread.sleep(2000);
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label=\"Close\"]")));
		
		driver.findElement(By.xpath("//button[@aria-label=\"Close\"]")).click();
		Thread.sleep(1000);
	}
	@Test(priority=11)
	public void homemodel_11 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with with Dashboard Integrations Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		test.pass(" Test Case Pass  Click on Dashboard Integrations ");
		homepage.dashboardintegrations();
		Thread.sleep(2000);
//		WebElement close;
//		close= wait.u
//		close=driver.findElement(By.xpath("//button[@aria-label=\"Close\"]"));
		
		// explicit wait - to wait for the compose button to be click-able
	
	}
	@Test(priority=12)
	public void homemodel_12 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with Dashboard Pricing Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardpricing();
		test.pass(" Test Case Pass  Click on Dashboard Pricing ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-setting/div/mat-toolbar/div[2]/button")).click();
		Thread.sleep(1000);
	}
	@Test(priority=13)
	public void homemodel_13 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with  Dashboard Support Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		homepage.dashboardsupport();
		test.pass(" Test Case Pass  Click on Dashboard Support ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-contact-support/div/button")).click();
		Thread.sleep(1000);
	} 
	@Test(priority=14)
	public void homemodel_14 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with  Dashboard Professional Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/app-root/div[2]/a[2]/span/mat-icon")).click();
		homepage.dashboardprofessional();
		test.pass(" Test Case Pass  Click on Dashboard Professional ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-setting/div/mat-toolbar/div[2]/button")).click();
		Thread.sleep(1000);
	}
	@Test(priority=15)
	public void homemodel_15 () throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login Test with  Dashboard Setting Click");
		
		Thread.sleep(500);
		homepage =new HomePage();
		test.log(Status.INFO, "URL is Open on Chrome Bowser  ");
		
		Thread.sleep(500);
	//	driver.findElement(By.xpath("/html/body/app-root/div[2]/a[2]/span/mat-icon")).click();
		WebElement a1=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[4]/mat-nav-list/div/a"));
		boolean enab=a1.isEnabled();
		Actions Act=new Actions(driver);
		Act.moveToElement(a1).click().build().perform();
		
		test.pass(" Test Case Pass  Click on Dashboard Setting");

		System.out.println(enab);
		Thread.sleep(2000);

	}
	@AfterMethod

	public void TearDown() throws InterruptedException {
		Thread.sleep(500);
		//		driver.findElement(By.xpath("//div[@class=\"avatar_img\"]")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//a[contains(text(),'SIGN OUT')]")).click();
		//		Thread.sleep(500);
			
	}
	@AfterClass
	public void closed () throws InterruptedException {
		
		Thread.sleep(500);
		driver.quit();
		

		extent.flush();

	}


	}



