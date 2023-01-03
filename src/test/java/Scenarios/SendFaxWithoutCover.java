package Scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;

public class SendFaxWithoutCover extends ComTestBase {

	public SendFaxWithoutCover() throws IOException {
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
	@Test(priority=1)//(enabled=false)
	public void withoutcover() throws InterruptedException, IOException, AWTException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),' New Fax ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[15]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label=\"Number\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Team iFax')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Drop an attachment here')]")).click();
		Thread.sleep(1000);
		WebElement formate=driver.findElement(By.xpath("//p[contains(text(),'To ensure readibility, only fax text documents with dark fonts and a white background. ')]"));
		String fo=formate.getText();
		System.out.println(fo);
	//	Assert.assertEquals(fo,"To ensure readibility, only fax text documents with dark fonts and a white background.Supported: PNG, JPG, JPEG, DOC, DOCX, PDF");
		
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
		
		driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-2\"]/app-notify-dialog/div/div[2]/div/form/div/div[1]/button")).click();
		Thread.sleep(1000); 
		
	}
	@Test(priority=2)
	public void FaxnuberMessage() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),' New Fax ')]")).click();
		log.info("click on newfax button ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
		
		WebElement message=driver.findElement(By.xpath("//p[contains(text(),'Please enter a valid fax number')]"));
		String note=message.getText();
		System.out.println(note);
		Assert.assertEquals(note,"Please enter a valid fax number");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'GOT IT')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-bottom-sheet-container/app-new-fax/div/div/div[1]/div/div[1]/div[1]/button/span/mat-icon")).click();
		Thread.sleep(2000);
		
	}
//	@Test(priority=3)
//	public void Wrongfomate() throws InterruptedException {
//
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[contains(text(),' New Fax ')]")).click();
//
//
//	}
	
	@AfterMethod()
	public void browserclosed () throws InterruptedException {
		log.info(" current bowser is closed ");
		Thread.sleep(500);		
	}
	@AfterClass()
	public void TearDown () throws InterruptedException {
		Thread.sleep(500);
		
		log.info(" All Tab are Closed ");
		 
		//driver.close();
		
	}

}
