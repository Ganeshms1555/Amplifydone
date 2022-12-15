package Test_Fax_NumberCountrywithArea;

import java.io.IOException;
import java.util.List;

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

public class UnitedState001 extends ComTestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	

	public UnitedState001() throws IOException {
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
//	 @Test
//	 public void m1() throws IOException, InterruptedException {
//		 System.out.println(" Test case 1 ");
//		 FaxNumber fn =new FaxNumber();
//		 fn.setfaxnumber();fn.setcountry();fn.setcountry1();fn.setarea();fn.setcalifornia();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
//		 Thread.sleep(2000);
//		 // size of list box 
//		 List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
//
//		 System.out.println(list.size());
//		 int actual=list.size();
//		 int expected =2;
//		 System.out.println("size of List Box :- "+actual);
//
//		 //asse.assertEquals(size, ex);
//		 if(actual>=expected) {
//			 Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
//			 Assert.assertEquals(true, true);
//		 }
//		 else 
//		 {Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
//		 Assert.assertEquals(false, true);
//		 }Thread.sleep(2000);
//
//	 }
		@Test(priority=1)
		public void FAXnumberCalifornia() throws InterruptedException, IOException {

			Reporter.log(" Field of FAx Number check Box Of California ",true);
			FaxNumber C=new FaxNumber();
			C.setfaxnumber();
			Thread.sleep(2000);
			C.setcountry();
			C.setcountry1();
			C.setarea();
			C.setcalifornia();
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
		public void FAXnumberArizona() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Arizona ",true);
			FaxNumber C=new FaxNumber();   
			Thread.sleep(2000);
			C.setarea();
			C.setarizona();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
			Thread.sleep(2000);
			// size of list box 
			List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
			System.out.println(list.size());
			int actual=list.size();
			int expected =2;
			System.out.println("size of List Box :- "+actual);
			if(actual>=expected) {
				Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
				Assert.assertEquals(true, true);
			}
			else 
			{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
			Assert.assertEquals(false, true);
			}Thread.sleep(2000);


		}
		@Test(priority=3)
		public void FAXnumberArkansas() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Arkansas ",true);
			FaxNumber C=new FaxNumber();
			Thread.sleep(2000);
			C.setarea();
			C.setarkansas();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
			Thread.sleep(2000);
			// size of list box 
			List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
			System.out.println(list.size());
			int actual=list.size();
			int expected =2;
			System.out.println("size of List Box :- "+actual);

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
		public void FAXnumberColorado() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Colorado ",true);
			FaxNumber C=new FaxNumber();
			Thread.sleep(2000);
			C.setarea();
			C.setcolorado();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
			Thread.sleep(2000);
			// size of list box 
			List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
			System.out.println(list.size());
			int actual=list.size();
			int expected =2;
			System.out.println("size of List Box :- "+actual);
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
		public void FAXnumberConnecticut() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Connecticut ",true);
			FaxNumber C=new FaxNumber();
			Thread.sleep(2000);    C.setarea();
			C.setconnecticut();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
			Thread.sleep(2000);
			// size of list box 
			List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
			System.out.println(list.size());
			int actual=list.size();
			int expected =2;
			System.out.println("size of List Box :- "+actual);
			if(actual>=expected) {
				Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
				Assert.assertEquals(true, true);
			}
			else 
			{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
			Assert.assertEquals(false, true);
			}Thread.sleep(2000);

		}
		@Test(priority=6)
		public void FAXnumberFlorida() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Florida ",true);
			FaxNumber C=new FaxNumber();
			Thread.sleep(2000);
			C.setarea();
			C.setflorida();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-select[@panelclass=\"select_number_panel\"])[3]")).click();
			Thread.sleep(2000); 
			List<WebElement>list=driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));
			System.out.println(list.size());
			int actual=list.size();
			int expected =2;
			System.out.println("size of List Box :- "+actual);
			if(actual>=expected) {
				Reporter.log("checkBox is cotaining More Than 1 field of FAx Number ",true);
				Assert.assertEquals(true, true);
			}
			else 
			{Reporter.log("checkBox is cotaining Only 1 field of FAx Number ",true);
			Assert.assertEquals(false, true);
			}Thread.sleep(2000);

		}
		@Test(priority=7)
		public void FAXnumberGeorgia() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Georgia ",true);
			FaxNumber C=new FaxNumber();

			Thread.sleep(2000);

			C.setarea();
			C.setgeorgia();
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
		@Test(priority=8)
		public void FAXnumberIllinois() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Illinois ",true);
			FaxNumber C=new FaxNumber();
			Thread.sleep(2000);
			C.setarea();
			C.setillinois();
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
		@Test(groups= {"1"})
		public void FAXnumberIndiana() throws InterruptedException {

			Reporter.log(" Field of FAx Number check Box Of Indiana ",true);
			 FaxNumber C=new FaxNumber(driver);
			    C.setfaxnumber();
			    Thread.sleep(2000);
			    C.setcountry();
			    C.setcountry1();
			    C.setarea();
			    C.setindiana();
			    Thread.sleep(2000);
			    }*/
		@Test(priority=9)
		public void FAXnumberLouisiana() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Louisiana ",true);
			FaxNumber C=new FaxNumber(); Thread.sleep(2000);
			C.setarea();
			C.setlouisiana();
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

		@Test(priority=10)
		public void FAXnumberMassachusetts() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Massachusetts ",true);
			FaxNumber C=new FaxNumber();
			Thread.sleep(2000);C.setarea();
			C.setmassachusetts();
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
		@Test(priority=11)
		public void FAXnumberMichigan() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Michigan ",true);
			FaxNumber C=new FaxNumber();
			Thread.sleep(2000); 
			C.setarea();
			C.setmichigan();
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
		@Test(priority=12)
		public void FAXnumberMinnesota() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of Minnesota ",true);
			FaxNumber C=new FaxNumber();
			Thread.sleep(2000);
			C.setarea();
			C.setminnesota();
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
		@Test//(priority=7)
		public void FAXnumberNebraska() throws InterruptedException {

			Reporter.log(" Field of FAx Number check Box Of Nebraska ",true);
			 FaxNumber C=new FaxNumber(driver);
			    C.setfaxnumber();
			    Thread.sleep(2000);
			    C.setcountry();
			    C.setcountry1();
			    C.setarea();
			    C.setnebraska();
			    Thread.sleep(2000);
			    }
		@Test//(priority=7)
		public void FAXnumberNevada() throws InterruptedException {

			Reporter.log(" Field of FAx Number check Box Of Nevada ",true);
			 FaxNumber C=new FaxNumber(driver);
			    C.setfaxnumber();
			    Thread.sleep(2000);
			    C.setcountry();
			    C.setcountry1();
			    C.setarea();
			    C.setnevada();
			    Thread.sleep(2000);
			    }*/
		@Test(priority=1)
		public void FAXnumberNewHampshire() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]")).click();
			Thread.sleep(1000);

			Reporter.log(" Field of FAx Number check Box Of New Hampshire ",true);
			FaxNumber C=new FaxNumber();

			Thread.sleep(2000);
			C.setarea();
			Thread.sleep(2000);
			C.setnewHampshire();
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
	 public void teardown() throws InterruptedException {
		 Thread.sleep(1000);
		 driver.quit();
	 }
	
	

}
