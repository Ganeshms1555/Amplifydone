package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class NewFax extends ComTestBase {
	
	@FindBy(xpath="//span[contains(text(),' New Fax ')]")
	WebElement newfax;

	public NewFax() throws IOException {
		PageFactory.initElements(driver,this);
		
	}
	public void setnewfax() {
		newfax.click();
	}

}
