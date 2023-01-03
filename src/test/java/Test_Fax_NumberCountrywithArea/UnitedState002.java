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
import org.testng.asserts.SoftAssert;

import Com.qa.base.ComTestBase;
import Com.qa.pages.FaxNumber;
import Com.qa.pages.HomePage;
import Com.qa.pages.LoginPage;

public class UnitedState002 extends ComTestBase{
	LoginPage loginpage;
	HomePage homepage;

	public UnitedState002() throws IOException {
		super();	
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
	public void fn1() throws InterruptedException {
		Thread.sleep(500);
	}
	@Test(priority=1)
	public void FAXnumberNewJersey() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		Reporter.log(" Field of FAx Number check Box Of New Jersey ",true);
		FaxNumber C=new FaxNumber();
		C.setfaxnumber();
		Thread.sleep(1000);
		C.setcountry();
		C.setcountry1();
		Thread.sleep(2000);
		C.setarea();
		C.setnewJersey();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);

		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			Assert.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		Assert.assertEquals(false, true);
		}Thread.sleep(2000);

	}
	@Test(priority=2)
	public void FAXnumberNewYork() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);

		Reporter.log(" Field of FAx Number check Box Of New York ",true);
		FaxNumber C=new FaxNumber();
		Thread.sleep(2000);
		C.setarea();
		C.setnewYork();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);

		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			Assert.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		Assert.assertEquals(false, true);
		}Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	public void FAXnumbernorthCarolina() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);

		Reporter.log(" Field of FAx Number check Box Of North Carolina ",true);
		FaxNumber C=new FaxNumber();
		Thread.sleep(2000);
		C.setarea();
		C.setnorthCarolina();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);

		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			Assert.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		Assert.assertEquals(false, true);
		}Thread.sleep(2000);
	}
	@Test(priority=4)
	public void FAXnumberOhio() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);

		Reporter.log(" Field of FAx Number check Box Of Ohio ",true);
		FaxNumber C=new FaxNumber();
		Thread.sleep(2000);
		C.setarea();
		C.setohio();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);

		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			Assert.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		Assert.assertEquals(false, true);
		}Thread.sleep(2000);

	}
	@Test(priority=5)
	public void FAXnumberOregon() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);

		Reporter.log(" Field of FAx Number check Box Of Oregon ",true);
		FaxNumber C=new FaxNumber();
		Thread.sleep(2000);
		C.setarea();
		C.setoregon();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);

		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			Assert.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		Assert.assertEquals(false, true);
		}Thread.sleep(2000);

	}/*
		/*	@Test//(priority=7)
			public void FAXnumberPennsylvania() throws InterruptedException {

				Reporter.log(" Field of FAx Number check Box Of Pennsylvania ",true);
				 FaxNumber C=new FaxNumber(driver);
				    C.setfaxnumber();
				    Thread.sleep(2000);
				    C.setcountry();
				    C.setcountry1();
				    C.setarea();
				    C.setpennsylvania();
				    Thread.sleep(2000);
				    }*/
	@SuppressWarnings("deprecation")
	@Test(enabled=false)//(priority=6)
	public void FAXnumberTexas() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		Reporter.log(" Field of FAx Number check Box Of Texas ",true);
		FaxNumber C=new FaxNumber();
		Thread.sleep(2000);
		C.setarea();
		C.settexas();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);

		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			Assert.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		Assert.assertEquals(false, true);
		}Thread.sleep(2000);

	}
	@SuppressWarnings("deprecation")
	@Test(priority=7)
	public void FAXnumberVirginia() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		Reporter.log(" Field of FAx Number check Box Of Virginia ",true);
		FaxNumber C=new FaxNumber();
		Thread.sleep(2000);
		C.setarea();
		C.setvirginia();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);

		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			Assert.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		Assert.assertEquals(false, true);
		}Thread.sleep(2000);

	}
	@SuppressWarnings("deprecation")
	@Test(priority=8)
	public void FAXnumberWisconsin() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		Reporter.log(" Field of FAx Number check Box Of Wisconsin ",true);
		FaxNumber C=new FaxNumber();
		Thread.sleep(2000);
		C.setarea();
		C.setwisconsin();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);

		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			Assert.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		Assert.assertEquals(false, true);
		}Thread.sleep(2000);

	}
	@Test(priority=9)
	public void FAXnumberSouthDakota() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		Reporter.log(" Field of FAx Number check Box Of South Dakota ",true);
		FaxNumber C=new FaxNumber();
		Thread.sleep(2000);
		C.setarea();
		C.setsouthDakota();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
		Thread.sleep(2000);
		// size of list box 
		List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));

		System.out.println(list.size());
		int actual=list.size();
		int expected =2;
		System.out.println("size of List Box :- "+actual);
		SoftAssert ast=new SoftAssert();
		//asse.assertEquals(size, ex);
		if(actual>=expected) {
			Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
			//	Assert.assertEquals(true, true);
			ast.assertEquals(true, true);
		}
		else 
		{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
		// Assert.assertEquals(false, true);
		ast.assertEquals(false, true);
		}Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
		Thread.sleep(1000);

	}
	@AfterMethod
	public void Teardown() throws InterruptedException, IOException {

		Thread.sleep(1000);
		/*File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		    	String Ran=RandomString.make(10);


		    	File dest= new File("C:\\Users\\ganesh_moontechnolab\\Desktop\\ScreenShot\\ScreenShot1\\iFax123"+Ran+".jpg");

		    	FileHandler.copy(source, dest);
		    	Thread.sleep(1000);

		    	System.out.println("Test is succefully to take screen shot ");

				System.out.println("Browser  and all tab closed");*/
		//driver.close();
		Thread.sleep(2000);
		System.out.println(" All Methods are done ");

	}      
	@AfterClass
	public void ac() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();

	}

}
