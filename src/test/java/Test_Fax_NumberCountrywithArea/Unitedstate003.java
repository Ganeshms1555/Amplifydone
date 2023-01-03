package Test_Fax_NumberCountrywithArea;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;
import Com.qa.pages.FaxNumber;
import Com.qa.pages.HomePage;
import Com.qa.pages.LoginPage;

public class Unitedstate003 extends ComTestBase {
	HomePage homepage;
	LoginPage loginpage;

	public Unitedstate003() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public void start() throws InterruptedException {Thread.sleep(0500);
	}
	@Test(priority=1)
	public void FAXnumberAlabama() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		Reporter.log(" Field of FAx Number check Box Of Alabama ",true);
		FaxNumber C=new FaxNumber();
		C.setfaxnumber();
		Thread.sleep(1000);
		C.setcountry();
		C.setcountry1();
		Thread.sleep(2000);
		C.setarea();
		C.setalabama();
		Thread.sleep(2000);
	}
//	@Test(priority=2)
//	public void FAXnumberAlaska() throws InterruptedException, IOException {
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
//		Thread.sleep(1000);
//
//		Reporter.log(" Field of FAx Number check Box Of Alaska ",true);
//		FaxNumber C=new FaxNumber();
//
//		C.setarea();
//		C.setalaska();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
//
//		Thread.sleep(2000);
//		// size of list box 
//		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
//
//		System.out.println(list.size());
//		int actual=list.size();
//		int expected =2;
//		System.out.println("size of List Box :- "+actual);
//
//		//asse.assertEquals(size, ex);
//		if(actual>=expected) {
//			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
//			Assert.assertEquals(true, true);
//		}
//		else 
//		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
//		Assert.assertEquals(false, true);
//		}Thread.sleep(2000);
//	}
//
//	@Test(priority=3)
//	public void FAXnumberDelware() throws InterruptedException, IOException {
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
//		Thread.sleep(1000);
//
//		Reporter.log(" Field of FAx Number check Box Of Dalware ",true);
//		FaxNumber C=new FaxNumber();
//
//		C.setarea();
//		C.setdelaware();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
//
//		Thread.sleep(2000);
//		// size of list box 
//		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
//
//		System.out.println(list.size());
//		int actual=list.size();
//		int expected =2;
//		System.out.println("size of List Box :- "+actual);
//
//		//asse.assertEquals(size, ex);
//		if(actual>=expected) {
//			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
//			Assert.assertEquals(true, true);
//		}
//		else 
//		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
//		Assert.assertEquals(false, true);
//		}Thread.sleep(2000);
//	}
//	@Test(priority=4)
//	public void NumberofArea() throws InterruptedException, IOException {
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
//		Thread.sleep(1000);
//
//		Reporter.log(" Field of FAx Number check Box Of Dalware ",true);
//		FaxNumber C=new FaxNumber();
//
//		C.setarea();
//		List<WebElement>arealist=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
//		
//				System.out.println(arealist.size());
//				int number= arealist.size();
//		Reporter.log("  Number of Area Available  : "+number,true);
//		
//	
//			
//		}
		@Test(priority=5)
		public void NamefArea() throws InterruptedException, IOException {
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Dalware ",true);
			FaxNumber C=new FaxNumber();

			C.setarea();
			List<WebElement>arealist=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
			WebElement a=driver.findElement(By.xpath("(//mat-option[@role=\"option\"])[2]"));
			String name1=a.getText();
			System.out.println(name1);
			
					System.out.println(arealist.size());
					int number= arealist.size();
			Reporter.log("  Number of Area Available  : "+number,true);
			
			for(WebElement name:arealist) {
				String text=name.getText();
				//System.out.println(text);
				Reporter.log("  Name  of Area Available  : "+text,true);
				
			}

	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(0500);
	}
	@AfterClass
	public void closed() throws InterruptedException {
		Thread.sleep(0500);
		//driver.close();
	}

}
