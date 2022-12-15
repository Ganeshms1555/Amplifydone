package Com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {
	// iFAX Click swith to fill or iFax
	@FindBy(xpath="//div[@class=\"logoheadersec\"]")
	WebElement iFAX;
	@FindBy(xpath="(//span[@class=\"hide_text\"])[1] ")
	WebElement dash;
	@FindBy(xpath="(//span[@class=\"hide_text\"])[2] ")
	WebElement inbox;
	@FindBy(xpath="//span[contains(text(),' Done ')]")
	WebElement done;
	@FindBy(xpath="//p[contains(text(),'Folders ')]")
	WebElement folder;
	@FindBy(xpath="//h5[contains(text(),'Team (0)')]")
	WebElement team;
	@FindBy(xpath="")
	WebElement faxnumber;
	@FindBy(xpath="")
	WebElement contacts;
	@FindBy(xpath="")
	WebElement report;
	@FindBy(xpath="")
	WebElement emailtofax;
	@FindBy(xpath="")
	WebElement broadcasrfax;
	@FindBy(xpath="")
	WebElement integrations;
	@FindBy(xpath="")
	WebElement pricing;
	@FindBy(xpath="")
	WebElement support;
	@FindBy(xpath="")
	WebElement ifaxprofessional;
	@FindBy(xpath="")
	WebElement setting;
	
	

}
