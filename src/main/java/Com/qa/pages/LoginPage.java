package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class LoginPage extends ComTestBase{

	//PageFactory
	@FindBy(name ="email")
	WebElement email; 

	@FindBy(xpath="//button[@id=\"button\"]") 
	WebElement button;	
//	driver.fndelement(By.id("userid"));
	
	@FindBy(xpath=("//input[@type=\"password\"]"))
	WebElement p; 

//	@FindBy(xpath=("//span[contains(text(),'Sign In')]"))  new update 
	@FindBy(xpath=("//span[contains(text(),'Log In')]")) 
	WebElement button1;
	

	
	//Initializing the page object
		public LoginPage() throws IOException {
			
			PageFactory.initElements(driver, this);
		}

	    	

		public HomePage homePage (String EM,String PW ) throws InterruptedException, IOException {
	    	  email.sendKeys(EM);
	    	  Thread.sleep(2000);
	    	  button.click();
	    	  Thread.sleep(2000);
	    	  p.sendKeys(PW);
	    	  Thread.sleep(2000);
	    	  button1.click();
	    	  Thread.sleep(2000);
	    	  return new HomePage();

	    	  
	      }
//		
		

}
