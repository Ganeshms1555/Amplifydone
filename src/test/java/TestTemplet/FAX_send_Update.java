  package TestTemplet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.qa.base.ComTestBase;
import Com.qa.pages.LoginPage;

public class FAX_send_Update extends ComTestBase {
	
	LoginPage loginpage;

	public FAX_send_Update() throws IOException {
		super();
		
	}
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());
	
	@BeforeMethod 
	public void sendupdate() throws IOException {
		initialization();
		log.info("Driver is initialized");
		
		loginpage = new LoginPage();
		log.info("Loginpage object")  ;
		driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
		
		
	}
	@Test(priority=1)//(enabled=false)
	public void FaxSend001() throws InterruptedException, IOException, AWTException {
		loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));

		// to send new Fax to costumer 
		
		driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator mat-button mat-button-base ng-star-inserted\"]")).click();
		Thread.sleep(1000);
		//  fax number  send key
		
		Thread.sleep(1000);
		//  fax number  send key
		
		driver.findElement(By.xpath("//div[@class='main_card_new_fax newfaxd6 ng-star-inserted']//img[@class='country_icon ng-star-inserted']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("United States");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[contains(text(),'United States')]")).click();
		Thread.sleep(1000);
		
		
       driver.findElement(By.xpath("//div[@class='main_card_new_fax newfaxd6 ng-star-inserted']//input[@formcontrolname='Fax_Number']")).sendKeys("1 (205) 255-5021");
		
		Thread.sleep(1000);
		
	
		

		//	String path="C:\\Users\\ganesh_moontechnolab\\Desktop\\EpX6g17XMAM0ICG.jpg";
			
			
			driver.findElement(By.xpath("//span[contains(text(),'Drop an attachment here')]")).click();
			
			Thread.sleep(1000);
			
	driver.findElement(By.xpath("(//span[contains(text(),'ADD')])[3]")).click();
			//*[@id="mat-dialog-0"]/app-error-dialog/div/mat-dialog-actions/button/span
			//driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-error-dialog/div/mat-dialog-actions/button/span")).click();
			
			
			Thread.sleep(1000);
			
			
			//robot Object
			Robot robot=new Robot();
			
		//	Store pathof upload usinfg StringSelection
			
			StringSelection filepath= new StringSelection("C:\\Users\\ganesh_moontechnolab\\Form.pdf");
			
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
					
					
					driver.findElement(By.xpath("//button//span[contains(text(),'Send')]")).click();
					Thread.sleep(1000);
					Reporter.log("Fax is SUCCESSFULLY upload  But not deliverd ");
					driver.findElement(By.xpath("//input[@id=\"mat-input-29\"]")).sendKeys("ifax10101@gmail.com");
					Thread.sleep(1000);
					
					//driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[5]")).click();
				//	New xpath
					//*[@id="mat-dialog-3"]/app-notify-dialog/div/button/span/mat-icon
					driver.findElement(By.xpath("//*[@id=\"mat-dialog-3\"]/app-notify-dialog/div/button/span/mat-icon")).click();
					
					//driver.close();
					Thread.sleep(2000);
					//Thread.sleep(30000);
					
					boolean Actual=driver.findElement(By.xpath("//span[contains(text(),'Sent')]")).isEnabled();
					System.out.println(Actual);
					 SoftAssert ast= new SoftAssert();
					// String Expected ="(//span[contains(text(),'Sent')])[1]";
					 ast.assertEquals(Actual, true);
					
		
		Thread.sleep(2000);}
	
	

	
		@Test(priority=2)
		public void statusAfter60sec() throws InterruptedException, IOException {
			
			
			loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			 SoftAssert ast= new SoftAssert();
		
		// explicit wait - to wait for the compose button to be click-able
	//	WebDriverWait wait = new WebDriverWait(driver,100);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(30000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();
		
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Delivered')])[1]")));
		
		boolean Deli=driver.findElement(By.xpath("(//span[contains(text(),'Delivered')])[1]")).isEnabled();
		Thread.sleep(2000);
		Reporter.log("Fax is  Delivered in 60 Seconds ");
		
		ast.assertEquals(Deli,true);
		//span[contains(text(),'Sent')]
	}
	
	
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(1000);
    	driver.quit();
	}
	
	
	

	
	
	
	
}
