package TestTemplet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.qa.base.ComTestBase;
import Com.qa.pages.FaxNumber;
import Com.qa.pages.LoginPage;

public class SelectPlan  extends ComTestBase {
	LoginPage loginpage;

	public SelectPlan() throws IOException {
		super();
		
		
	}
	public static Logger log = LogManager.getLogger(ComTestBase.class.getName());
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		
		initialization(); 
		log.info("Driver is initialized");
		
		loginpage = new LoginPage();
		log.info("Loginpage object")  ;
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[9]")).click();
	}
	@Test
	public void PurchasePlan00l() throws InterruptedException, IOException {
		loginpage.homePage(props.getProperty("Username"),props.getProperty("Password"));
		Thread.sleep(1000);
		Reporter.log("Browser Open Succesfully ");
		System.out.println("browser open successfully");
		Reporter.log(" FaxNumberPurchase00l ");
		System.out.println("FaxNumberPurchase00l ");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		
		FaxNumber numberadd=new  FaxNumber();
		numberadd.setfaxnumber();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//app-setting/div/mat-toolbar/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),' Pricing')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'UPGRADE NOW ')])[1]")).click();
        Thread.sleep(2000);
        Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
		
		int  len= currentWindowHandle.length();
		System.out.println(len);
		
		
		}
		int window= allWindowHandles.size();
		System.out.println(window);
		}
		
        
 
        
        /*
        
        String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                   // driver.findElement(By.xpath("//div/div[1]/div[3]/div/div/div[1]/div[1]/label")).click();
                    Thread.sleep(2000);
                   // driver.findElement(By.xpath("//label[contains(text(),' First Name')]")).sendKeys("Fname");
            		
                    
                    
                   // driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
                    
                  //  driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();		
            }		
        }
        
        
        
       */ 
        
        
        /*
	//	driver.navigate().refresh();
		Thread.sleep(2000);
		//WebElement focuse=driver.findElement(By.xpath("//div[@class=\"cb-body__content\"]"));
	//	driver.switchTo().frame(focuse);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]")).click();
    //    driver.findElement(By.xpath("//*[@id=\"cb-body\"]/div/div[1]/div[3]/div/div/div[1]/div[1]")).click();
        Thread.sleep(2000);
       // driver.navigate().refresh();
		driver.findElement(By.xpath("//div/div[1]/div[3]/div/div/div[1]/div[1]/label")).sendKeys("Fname");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),' Last Name')]")).sendKeys("LastName");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),' Card Number')]")).sendKeys("4242 4242 4242 4242");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'\r\n"
				+ "    Expiry\r\n"
				+ "  ')]")).sendKeys("122023");
		
//		
//		Reporter.log(" Purchase New Fax Number SUCCESSFULLY ");
//		
		//driver.findElement(By.xpath("(//span[contains(text(),'ADD NUMBER')])[2]")).click();
		
	
		*/
		

	 
	
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}

}
