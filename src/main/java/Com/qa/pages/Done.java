package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class Done extends ComTestBase {
	
	public Done() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement search;
	@FindBy(xpath="//button[@mattooltip=\"Refresh\"]")
	WebElement refresh;
	@FindBy(xpath="//button[@class=\"mat-focus-indicator mat-menu-trigger env_main_filter mat-button mat-button-base\"]")
	WebElement mail;
	@FindBy(xpath="//span[contains(text(),'Any direction')]")
	WebElement anydirection;
	@FindBy(xpath="//span[contains(text(),'Any status')]")
	WebElement anystatus;
	@FindBy(xpath="//span[contains(text(),'Any time')]")
	WebElement anytime;
	@FindBy(xpath="//span[contains(text(),' Done ')]")
	WebElement pageout;
	
	public void search() {
		search.sendKeys("Team");
	}
	public void refresh() {
		refresh.click();
	}
	public void mail () {
		mail.click();
	}
	public void anydirection() {
		anydirection.click();
	}
	public void anystatus() {
		anystatus.click();
		}
	public void anytime() {
		anytime.click();
	}
	public void pageout() {
		pageout.click();
	}
	

}
