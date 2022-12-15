package TestTemplet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
import Com.qa.pages.LoginPage;

public class Test_Fax_Templet_A extends ComTestBase {
	LoginPage loginpage;
	

	public Test_Fax_Templet_A() throws IOException {
		super();
		
		
	}
	public static org.apache.logging.log4j.Logger log = LogManager.getLogger(ComTestBase.class.getName());
	
	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		
		initialization(); 
		log.info("Driver is initialized");
		
		loginpage = new LoginPage();
		log.info("Loginpage object")  ;
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
		loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
		Thread.sleep(500);
		Reporter.log("Browser Open Succesfully ");
		System.out.println("browser open successfully");
		Reporter.log(" FaxTempletA ");
		System.out.println("FaxTempletA ");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button//span[contains(text(),' New Fax ')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//form/ngu-carousel/div/button[2]/img")).click();
		Thread.sleep(500);
		
		
	}
	@BeforeMethod 
	public void TempletA() throws IOException, InterruptedException {
		
		Thread.sleep(500);
	}
	
	
	@Test//(enabled=false)(priority=1)
	public void Templet001_DATE() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		Reporter.log(" Validating date On Fax");
		WebElement actualdate=driver.findElement(By.xpath("//form/ngu-carousel/div/div[1]/div/div[1]/div/div/mat-card/div[2]/div/p"));
		Thread.sleep(1000);
		String date =actualdate.getText();
		System.out.println(date);
		Assert.assertEquals(date,"12/08/2022");
		
	}
	@Test(priority=2)
	public void Templet001_SelectCountry() throws InterruptedException, IOException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"fax_inner_scroll_id\"]/form/ngu-carousel/div/div[1]/div/div[1]/div/div/mat-card/div[3]/div[1]/img")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("United States");
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
		Thread.sleep(500);
		
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//form/ngu-carousel/div/div[1]/div/div[1]/div/div/mat-card/div[3]/div[1]/img")).click();
//		Thread.sleep(500);
	//	driver.findElement(By.xpath("//mat-label[contains(text(),'Search Country')]")).click();
		
//		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
	
//		Reporter.log(" Validating date On Fax");
//		WebElement actualdate=driver.findElement(By.xpath("//form/ngu-carousel/div/div[1]/div/div[1]/div/div/mat-card/div[2]/div/p"));
//		Thread.sleep(1000);
//		String date =actualdate.getText();
//		System.out.println(date);
//		Assert.assertEquals(date,"11/05/2022");
		
	}
	@Test(priority=3)
	public void To_TEXT() throws InterruptedException {
		
		Thread.sleep(500);
		WebElement totext=driver.findElement(By.xpath("(//input[@formcontrolname=\"ToFax\"])[1]"));
		totext.sendKeys("To Text");
		boolean isclick_able=totext.isDisplayed();
		System.out.println(isclick_able);
		Reporter.log("Form Control Name is clickable and Displayed ");
		
		}
	@Test(priority=4)
	public void FormFax_Text() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@formcontrolname=\"FromFax\"])[1]")).sendKeys("FormFax Text");
		
	}
	@Test(priority=5)
	public void Subject_Text() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@formcontrolname=\"Subject\"])[1]")).sendKeys("subject Text");
		
	}
	@Test(priority=6)
	public void Urgent_chechBox() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Urgent')]")).click();
	
		
	}
	@Test(priority=7)
	public void PeaseReply_chechBox() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Please Reply')]")).click();
		
		
	}
	@Test(priority=8)
	public void ForReview_chechBox() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'For Review')]")).click();
		
		
	}
	@Test(priority=9)
	public void please_Comment_chechBox() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Please Comment ')]")).click();	
	}
	@Test(priority=10)
	public void Comment_ON_FAX() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class=\"ql-editor ql-blank\"])[1]")).sendKeys(" Comment of current fax which will provide by the user in form of Text ");	
	}
	@Test(priority=11)
	public void File_Upload() throws AWTException, InterruptedException {
		
		// click on Drop an attachment here
		
		driver.findElement(By.xpath("//span[contains(text(),'Drop an attachment here')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'ADD')])[3]")).click();
		//robot Object
		Robot robot=new Robot();

		//	Store pathof upload usinfg StringSelection

		StringSelection filepath= new StringSelection("C:\\Users\\ganesh_moontechnolab\\Sample School Admission Form.pdf");

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
		Thread.sleep(4000);

		System.out.println("File UPLOAD SUCCESSFULLY ");
		
		
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
