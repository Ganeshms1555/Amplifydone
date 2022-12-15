     package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class HomePage extends ComTestBase {
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/mat-nav-list[1]/div/a")
	 WebElement DashboardHome;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/mat-nav-list[2]/a[1]")
	 WebElement DashboardInbox;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/mat-nav-list[3]/a[2]")
	 WebElement DashboardDone;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[1]/a")
	 WebElement DashboardFolders;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[3]/mat-nav-list[1]/a")
	 WebElement DashboardTeam;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[3]/mat-nav-list[2]/a")
	 WebElement DashboardFaxNumber;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[3]/mat-nav-list[3]/a")
	 WebElement DashboardContacts;
	@FindBy(xpath="//html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[5]/mat-nav-list[1]/a")
	 WebElement DashboardReports;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[5]/div[1]")
	WebElement DashboardEmailtoFax;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[5]/div[2]/a")
	WebElement DashboardBroadcastFax;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[5]/div[2]/a")
	WebElement DashboardIntegrations;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[7]/mat-nav-list[1]/div[1]/a")
	WebElement DashboardPricing;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[7]/mat-nav-list[2]/div[1]/a")
	WebElement DashboardSupport;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[4]/mat-nav-list/div/a")
	WebElement DashboardProfessional;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[4]/mat-nav-list/div/div")
	WebElement DashboardSetting;
	
	 
	 
	

	
	   public HomePage() throws IOException {
	    	 
	    	 PageFactory.initElements(driver, this);
	
	}
	   public void dashboardhome() {
		   DashboardHome.click();
		   
	   }
	   public void dashboardinbox() {
		   DashboardInbox.click();
		   
	   }
	   public void dashboarddone() {
		   DashboardDone.click();
		   
	   }
	   public void dashboardfolders() {
		   DashboardFolders.click();
		   
	   }
	   public void dashboardteam() {
		   DashboardTeam.click();
		   
	   }
	   public void dashboardfaxnumbers() {
		   DashboardFaxNumber.click();
		   
	   }
	   public void dashboardcontacts() {
		   DashboardContacts.click();
		   
	   }
	   public void dashboardreports() {
		   DashboardReports.click();
		   
	   }
	   public void dashboardemailtofax() {

		   DashboardEmailtoFax.click();
		   
	   }
	   public void dashboardbroadcast() {
		   DashboardBroadcastFax.click();
		   
	   }
	   public void dashboardintegrations() {
		   DashboardIntegrations.click();
		   
	   }
	   public void dashboardpricing() {
		   DashboardPricing.click();
		   
	   }
	   public void dashboardsupport() {
		   DashboardSupport.click();
		   
	   }
	   public void dashboardprofessional() {
		   DashboardProfessional.click();
		   
	   }
	   public void dashboardsetting() {
		   DashboardSetting.click();
		   
	   }
	   
	   

}
