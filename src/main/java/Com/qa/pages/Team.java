package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class Team extends ComTestBase{
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[3]/mat-nav-list[1]/a/div")
	WebElement teamclick;
	
	@FindBy(xpath="(//span[contains(text(),'ADD')])[1]")
	WebElement addclick;

	public Team() throws IOException {
		PageFactory.initElements(driver,this);
		
	}
	public void setteam() {
		teamclick.click();
	}
	public void setadd() {
		addclick.click();
	}

}
