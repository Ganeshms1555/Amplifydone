package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class Setting extends ComTestBase {

	@FindBy(xpath="(//button[@type=\"button\"])[4]")
	WebElement Setting;
	@FindBy(xpath="//div[contains(text(),' General ')]")
	WebElement genral;
	@FindBy(xpath="//div[contains(text(),' Fax Numbers ')]")
	WebElement faxnumber;
	@FindBy(xpath="//div[contains(text(),' Notifications ')]")
	WebElement notifications;
	@FindBy(xpath="//div[contains(text(),' Team & SSO ')]")
	WebElement team;
	@FindBy(xpath="//div[contains(text(),' Plan & Account ')]")
	WebElement planAccount;
	@FindBy(xpath="//div[contains(text(),' Integrations ')]")
	WebElement integrations;
	@FindBy(xpath="//div[contains(text(),' Developer API ')]")
	WebElement developerAPI;
	@FindBy(xpath="//div[contains(text(),' Your Fax Page ')]")
	WebElement yourfaxPage;
	
	
	
	public Setting() throws IOException {
		PageFactory.initElements(driver,this);
		
	}
	public void general() {
		genral.click();
	}
	public void setting() {
		Setting.click();
	}
	public void faxnumber() {
		faxnumber.click();
	}
	public void notification() {
		notifications.click();
	}
	public void team() {
		team.click();
	}
	public void planaccount() {
		planAccount.click();
	}
	public void integration() {
		integrations.click();
	}
	public void developer() {
		developerAPI.click();
	}
	public void yourfax() {
		yourfaxPage.click();
	}
	

}
