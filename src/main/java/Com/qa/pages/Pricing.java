package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class Pricing extends ComTestBase {
	
	@FindBy(xpath="(//div[contains(text(),'Plan')])[2]")
	WebElement plan;
	@FindBy(xpath="(//div[contains(text(),'Account')])[2]")
	WebElement account;
	@FindBy(xpath="//span[contains(text(),'Modify Plan')]")
	WebElement modifyplan;
	// closed modifyplan
	@FindBy(xpath="(//mat-icon[contains(text(),'close')])[5]")
	WebElement modifyclose;
	
	@FindBy(xpath="//app-setting/div/mat-toolbar/div[2]/button")
	WebElement settingclosed;
	
	
	@FindBy(xpath="//input[@placeholder=\"First Name\"]")
	WebElement fname;
	@FindBy(xpath="//input[@placeholder=\"Last Name\"]")
	WebElement lname;
	@FindBy(xpath="//input[@placeholder=\"Company Name\"]")
	WebElement cname;
	@FindBy(xpath="//span[contains(text(),'Job Title')]")
	WebElement jd;
	
	
	

	public Pricing() throws IOException {
		PageFactory.initElements(driver, this );
	
	}
	public void plan() {
		plan.click();
	}
	public void account() throws InterruptedException {
		account.click();
//		Thread.sleep(1000);
//		account.sendKeys("");
	}
	public void modifyplan() {
		modifyplan.click();
	}
	public void modifyclosed() {
		modifyclose.click();
	}
	public void settingclosed() {
		settingclosed.click();
	}
	public void fname() {
		fname.clear();
		fname.sendKeys("Moon");
	}
	public void lname() {
		lname.clear();
		lname.sendKeys("Technolabs");
	}
	public void cname() {
		cname.clear();
		cname.sendKeys("PVT.LIMITED");
	}
	public void jobtitle () {
		jd.click();
	}

}
