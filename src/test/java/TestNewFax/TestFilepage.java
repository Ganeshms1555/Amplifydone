package TestNewFax;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;
import Com.qa.pages.NewFax;

public class TestFilepage extends ComTestBase{
	
	

	public TestFilepage() throws IOException {
		super();
		
	}
	LoginPage loginpage;
	NewFax newfax;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	public static Logger log= LogManager.getLogger(ComTestBase.class.getName());

	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		htmlReporter = new ExtentHtmlReporter("Report in.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		initialization();
		log.info("Driver is initialized");
		loginpage=new LoginPage();
		log.info("Loginpage Object");
		driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
		loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
		
				
	}
	@Test(priority=1)
	public void file001() throws IOException, InterruptedException, AWTException {
		ExtentTest test = extent.createTest(" verify Attached PDF file containing how much number pages ");
		newfax= new NewFax();
		newfax.setnewfax();
	driver.findElement(By.xpath("//div[@class='main_card_new_fax newfaxd6 ng-star-inserted']//img[@class='country_icon ng-star-inserted']")).click();
	test.log(Status.INFO," Click new fax ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("United States");
		Thread.sleep(1000);
		test.log(Status.INFO," Select country ");
		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-bottom-sheet-container/app-new-fax/div/div/div[2]/form/ngu-carousel/div/div[1]/div/div[6]/div/div/mat-card/div[3]/div[1]/mat-form-field/div/div[1]/div/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Team iFax')]")).click();
		
		Thread.sleep(1000);
		// click on file upload 
		driver.findElement(By.xpath("//span[contains(text(),'Drop an attachment here')]")).click();
		test.log(Status.INFO," Click ON Drag And Attached button  ");
		Thread.sleep(1000);  
		//click on add file 
		
		
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/mat-dialog-container/app-error-dialog/div/mat-dialog-actions/button/span")).click();
		
		
		Thread.sleep(1000);
		// File upload by  Robot class 
		Robot robot= new Robot ();
		//Store path of upload using StringSelection

		StringSelection filepath= new StringSelection("C:\\Users\\ganesh_moontechnolab\\Test.pdf");
		test.log(Status.INFO," Attached PDF file ");
		//StringSelection filepath= new StringSelection(System.getProperty("user.dir"+"/TestData/Pre School Admission Form Template"));
		                                          //  (System.getProperty("user.dir")+"/src/main/java/Com/config/properties/config")
		
		// copy above path to Clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

		////now Press CTRL

		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//Press V

		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Releas

		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Release CTRL

		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		System.out.println("File UPLOAD SUCCESSFULLY ");
		
		log.info("Calculate number of Upload File Pages ");
		List<WebElement> pages=driver.findElements(By.xpath("//div[@class=\"page\"]"));
		
		int  pnumber=(pages.size());
		System.out.println(" number of pages -:  "+(pnumber+1));
		test.log(Status.INFO," Number Page Attached in sigal file -:" +pnumber);

		driver.findElement(By.xpath("//button//span[contains(text(),'Send')]")).click();
		Thread.sleep(2000);
		test.pass("  Test case with verify and validate number file page ");
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-dialog-container/app-notify-dialog/div/button/span/mat-icon")).click();
		Thread.sleep(2000);
		
		

	}
	@Test(priority=2)
	public void file002() throws IOException, InterruptedException, AWTException {
		ExtentTest test = extent.createTest(" verify Attached  PNG file containing how much number pages ");
		newfax= new NewFax();
		newfax.setnewfax();
	driver.findElement(By.xpath("//div[@class='main_card_new_fax newfaxd6 ng-star-inserted']//img[@class='country_icon ng-star-inserted']")).click();
	test.log(Status.INFO," Click new fax ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("United States");
		Thread.sleep(1000);
		test.log(Status.INFO," Select country ");
		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-bottom-sheet-container/app-new-fax/div/div/div[2]/form/ngu-carousel/div/div[1]/div/div[6]/div/div/mat-card/div[3]/div[1]/mat-form-field/div/div[1]/div/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Team iFax')]")).click();
		// click on file upload 
		driver.findElement(By.xpath("//span[contains(text(),'Drop an attachment here')]")).click();
		test.log(Status.INFO," Click ON Drag And Attached button  ");
		Thread.sleep(1000);
		//click on add file 
		
		
		//driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/mat-dialog-container/app-error-dialog/div/mat-dialog-actions/button/span")).click();
		
		
		Thread.sleep(1000);
		// File upload by  Robot class 
		Robot robot= new Robot ();
		//Store path of upload using StringSelection

		StringSelection filepath= new StringSelection("C:\\Users\\ganesh_moontechnolab\\png.png");
		test.log(Status.INFO," Attached PDF file ");
		//StringSelection filepath= new StringSelection(System.getProperty("user.dir"+"/TestData/Pre School Admission Form Template"));
		                                          //  (System.getProperty("user.dir")+"/src/main/java/Com/config/properties/config")
		
		// copy above path to Clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

		////now Press CTRL

		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//Press V

		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Releas

		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Release CTRL

		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		System.out.println("File UPLOAD SUCCESSFULLY ");
		
		log.info("Calculate number of Upload File Pages ");
		List<WebElement> pages=driver.findElements(By.xpath("//div[@class=\"page\"]"));
		
		int  pnumber=(pages.size());
		System.out.println(" number of pages -:  "+(pnumber+1));
		test.log(Status.INFO," Number of  Page Attached in sigal file -:" +pnumber);

		driver.findElement(By.xpath("//button//span[contains(text(),'Send')]")).click();
		Thread.sleep(2000);
		test.pass("  Test case with verify and validate number file page ");
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-dialog-container/app-notify-dialog/div/button/span/mat-icon")).click();
		Thread.sleep(2000);

	}
	@Test(priority=3)
	public void file003() throws IOException, InterruptedException, AWTException {
		ExtentTest test = extent.createTest(" verify Attached  JPG  file containing how much number pages ");
		Thread.sleep(1000);
		newfax= new NewFax();
		Thread.sleep(1000);
		newfax.setnewfax();
	driver.findElement(By.xpath("//div[@class='main_card_new_fax newfaxd6 ng-star-inserted']//img[@class='country_icon ng-star-inserted']")).click();
	test.log(Status.INFO," Click new fax ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("United States");
		Thread.sleep(1000);
		test.log(Status.INFO," Select country ");
		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-bottom-sheet-container/app-new-fax/div/div/div[2]/form/ngu-carousel/div/div[1]/div/div[6]/div/div/mat-card/div[3]/div[1]/mat-form-field/div/div[1]/div/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Team iFax')]")).click();
		Thread.sleep(1000);
		// click on file upload 
		driver.findElement(By.xpath("//span[contains(text(),'Drop an attachment here')]")).click();
		test.log(Status.INFO," Click ON Drag And Attached button  ");
		Thread.sleep(1000);
		//click on add file 
		
		
		//driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/mat-dialog-container/app-error-dialog/div/mat-dialog-actions/button/span")).click();
		
		
		Thread.sleep(1000);
		// File upload by  Robot class 
		Robot robot= new Robot ();
		//Store path of upload using StringSelection

		StringSelection filepath= new StringSelection("C:\\Users\\ganesh_moontechnolab\\jpg IMage.jpg");
		test.log(Status.INFO," Attached JPG file ");
		//StringSelection filepath= new StringSelection(System.getProperty("user.dir"+"/TestData/Pre School Admission Form Template"));
		                                          //  (System.getProperty("user.dir")+"/src/main/java/Com/config/properties/config")
		
		// copy above path to Clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

		////now Press CTRL

		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//Press V

		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Releas

		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Release CTRL

		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		System.out.println("File UPLOAD SUCCESSFULLY ");
		
		log.info("Calculate number of Upload File Pages ");
		List<WebElement> pages=driver.findElements(By.xpath("//div[@class=\"page\"]"));
		
		int  pnumber=(pages.size());
		System.out.println(" number of pages -:  "+(pnumber+1));
		test.log(Status.INFO," Number of  Page Attached in sigal file -:" +pnumber);

		driver.findElement(By.xpath("//button//span[contains(text(),'Send')]")).click();
		Thread.sleep(2000);
		test.pass("  Test case with verify and validate number file page ");
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-dialog-container/app-notify-dialog/div/button/span/mat-icon")).click();
		Thread.sleep(2000);

	}
	@Test(priority=4)
	public void file004() throws IOException, InterruptedException, AWTException {
		ExtentTest test = extent.createTest(" verify Attached  Word file containing how much number pages ");
		Thread.sleep(1000);
		newfax= new NewFax();
		Thread.sleep(1000);
		newfax.setnewfax();
	driver.findElement(By.xpath("//div[@class='main_card_new_fax newfaxd6 ng-star-inserted']//img[@class='country_icon ng-star-inserted']")).click();
	test.log(Status.INFO," Click new fax ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("United States");
		Thread.sleep(1000);
		test.log(Status.INFO," Select country ");
		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-bottom-sheet-container/app-new-fax/div/div/div[2]/form/ngu-carousel/div/div[1]/div/div[6]/div/div/mat-card/div[3]/div[1]/mat-form-field/div/div[1]/div/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Team iFax')]")).click();
		
		Thread.sleep(1000);
		// click on file upload 
		driver.findElement(By.xpath("//span[contains(text(),'Drop an attachment here')]")).click();
		test.log(Status.INFO," Click ON Drag And Attached button  ");
		Thread.sleep(1000);
		//click on add file
		
		
	//	driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/mat-dialog-container/app-error-dialog/div/mat-dialog-actions/button/span")).click();
		
		
		Thread.sleep(1000);
		// File upload by  Robot class 
		Robot robot= new Robot ();
		//Store path of upload using StringSelection

		StringSelection filepath= new StringSelection("C:\\Users\\ganesh_moontechnolab\\.doc");
		test.log(Status.INFO," Attached Word file ");
		//StringSelection filepath= new StringSelection(System.getProperty("user.dir"+"/TestData/Pre School Admission Form Template"));
		                                          //  (System.getProperty("user.dir")+"/src/main/java/Com/config/properties/config")
		
		// copy above path to Clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

		////now Press CTRL

		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//Press V

		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Releas

		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Release CTRL

		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		System.out.println("File UPLOAD SUCCESSFULLY ");
		
		log.info("Calculate number of Upload File Pages ");
		List<WebElement> pages=driver.findElements(By.xpath("//div[@class=\"page\"]"));
		
		int  pnumber=(pages.size());
		System.out.println(" number of pages -:  "+(pnumber+1));
		test.log(Status.INFO," Number of  Page Attached in sigal file -:" +pnumber);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button//span[contains(text(),'Send')]")).click();
		Thread.sleep(2000);
		test.pass("  Test case with verify and validate number file page ");
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/mat-dialog-container/app-notify-dialog/div/button/span/mat-icon")).click();
		Thread.sleep(2000);

	}
	

	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		extent.flush();
	}
}
