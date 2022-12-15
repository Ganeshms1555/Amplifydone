package TestTemplet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
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
import Com.qa.pages.LoginPage;

public class Test_Fax_Templet_B extends ComTestBase{
	
	LoginPage loginpage;
	

	public Test_Fax_Templet_B() throws IOException {
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
	
	
	
	@Test(priority=10)
	public void Templet_B_SelectCountry() throws InterruptedException {
		
		driver.findElement(By.xpath("//form/ngu-carousel/div/button[2]/img")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"contentToConvert\"]/div[2]/div/div[1]/img")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("United States");
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
	}
	@Test(priority=11)
	public void To_TEXTB() throws InterruptedException {
		
		Thread.sleep(500);
		WebElement totext=driver.findElement(By.xpath("(//input[@formcontrolname=\"ToFax\"])[2]"));
		totext.sendKeys("To Text");
		boolean isclick_able=totext.isDisplayed();
		System.out.println(isclick_able);
		Reporter.log("Form Control Name is clickable and Displayed ");
		
		
	}
	@Test(priority=12)
	public void FormFax_TextB() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@formcontrolname=\"FromFax\"])[2]")).sendKeys("FormFax Text");
		
		
	}
	@Test(priority=13)
	public void Subject_TextB() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@formcontrolname=\"Subject\"])[2]")).sendKeys("subject Text");
		
	}
	@Test(priority=14)
	public void Urgent_chechBoxB() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'Urgent')])[2]")).click();
		
		
	}
	@Test(priority=15)
	public void PeaseReply_chechBoxB() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'Please Reply')])[2]")).click();
		
		
	}
	@Test(priority=16)
	public void ForReview_chechBoxB() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'For Review')])[2]")).click();
		
		
	}
	@Test(priority=17)
	public void please_Comment_chechBoxB() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'Please Comment ')])[2]")).click();
		
	}
	@Test(priority=18)
	public void Comment_ON_FAX() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class=\"ql-editor ql-blank\"])[1]")).sendKeys(" Comment of current fax which will provide by the user in form of Text ");	
	}
	@Test(priority=19)
	public void File_Upload() throws AWTException, InterruptedException {
		
		// click on Drop an attachment here
		
		driver.findElement(By.xpath("//span[contains(text(),'Drop an attachment here')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(text(),'ADD')])[3]")).click();
		//robot Object
				Robot robot=new Robot();
				
			//	Store pathof upload usinfg StringSelection
				
				StringSelection filepath= new StringSelection("C:\\Users\\ganesh_moontechnolab\\png.png");
				
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
