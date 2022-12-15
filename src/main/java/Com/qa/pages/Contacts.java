package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class Contacts extends ComTestBase {

	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[3]/mat-nav-list[3]/a/div")
	WebElement newcontact;

	
	public Contacts() throws IOException {
		PageFactory.initElements(driver, this);
	} 
	
	public void setcontact() {
		newcontact.click();
		
	}
	
	


	

}
