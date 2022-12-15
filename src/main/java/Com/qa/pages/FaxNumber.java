package Com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.base.ComTestBase;

public class FaxNumber extends ComTestBase {
	// webElement

	//span[contains(text(),'Fax Numbers')]

	//Declaration
	// click on Done 
	//@FindBy(xpath=("//span[contains(text(),'Fax Numbers')]"))
	@FindBy(xpath=("/html/body/app-root/app-dashboard/app-header-sidebar/mat-sidenav-container/mat-sidenav/div/div[2]/div/div[3]/mat-nav-list[2]/a/div/div[3]/button/span"))
	WebElement faxnumber;
	// click on country
	//div[@class='select_country_div']

	@FindBy(xpath=("//div[@class='select_country_div']"))//country name x-path=(//div[@class='select_country_div']//mat-form-field)[1]
	WebElement country; 
	//select united State
	//(//img[@class="country_icon"])[2]
	@FindBy(xpath=("(//img[@class=\"country_icon\"])[2]")) //united state click=//span[contains(text(),' United States ')]
	WebElement country1;
	//mat-select[@id="mat-select-2"]

	@FindBy(xpath=("((//mat-select[@panelclass=\"select_number_panel\"])[2]//div)[3]")) //area x path = ((//mat-select[@panelclass="select_number_panel"])[2]//div)[3] //old path=//mat-select[@id=\"mat-select-2\"]
	WebElement area;
	//span[contains(text(),' Hawaii ')]
	@FindBy(xpath=("//span[contains(text(),' Hawaii ')]"))
	WebElement hawaii;
	// Arizona 
	@FindBy(xpath=("//span[contains(text(),' Arizona ')]"))
	WebElement  arizona ;
	@FindBy(xpath=("//span[contains(text(),' Alaska ')]"))
	WebElement  alaska ;
	@FindBy(xpath=("//span[contains(text(),' Delaware ')]"))
	WebElement  delaware ;
	@FindBy(xpath=("//span[contains(text(),' Alabama ')]"))
	WebElement  alabama ;
	@FindBy(xpath=("//span[contains(text(),' California ')]"))
	WebElement   california  ;
	@FindBy(xpath=("//span[contains(text(),' Arkansas ')]"))
	WebElement    arkansas   ;
	@FindBy(xpath=("//span[contains(text(),' Colorado ')]"))
	WebElement     colorado   ;
	@FindBy(xpath=("//span[contains(text(),' Connecticut ')]"))
	WebElement    connecticut    ;
	@FindBy(xpath=("//span[contains(text(),' Florida ')]"))
	WebElement    florida     ;	
	@FindBy(xpath=("//span[contains(text(),' Georgia ')]"))
	WebElement georgia     ;
	@FindBy(xpath=("//span[contains(text(),' Illinois ')]"))
	WebElement illinois;
	@FindBy(xpath=("//span[contains(text(),' Indiana ')]"))
	WebElement  indiana ;
	@FindBy(xpath=("//span[contains(text(),' Louisiana ')]"))
	WebElement  louisiana  ;
	@FindBy(xpath=("//span[contains(text(),' Massachusetts ')]"))
	WebElement  massachusetts ;
	@FindBy(xpath=("//span[contains(text(),' Michigan ')]"))
	WebElement  michigan ;
	@FindBy(xpath=("//span[contains(text(),' Minnesota ')]"))
	WebElement minnesota  ;
	@FindBy(xpath=("//span[contains(text(),' Nebraska ')]"))
	WebElement nebraska   ;
	@FindBy(xpath=("//span[contains(text(),' Nevada ')]"))
	WebElement nevada;
	@FindBy(xpath=("//span[contains(text(),' New Hampshire ')]"))
	WebElement newHampshire ;
	@FindBy(xpath=("//span[contains(text(),' New Jersey ')]"))
	WebElement  newJersey  ;
	@FindBy(xpath=("//span[contains(text(),' New York ')]"))
	WebElement  newYork   ;
	@FindBy(xpath=("//span[contains(text(),' North Carolina ')]"))
	WebElement  northCarolina  ;
	@FindBy(xpath=("//span[contains(text(),' Ohio ')]"))
	WebElement   ohio   ;
	@FindBy(xpath=("//span[contains(text(),' Oregon ')]"))
	WebElement oregon    ;
	@FindBy(xpath=("//span[contains(text(),' Pennsylvania ')]"))
	WebElement pennsylvania     ;
	@FindBy(xpath=("//span[contains(text(),' Texas ')]"))
	WebElement  texas     ;
	@FindBy(xpath=("//span[contains(text(),' Virginia ')]"))
	WebElement  virginia     ;
	@FindBy(xpath=("//span[contains(text(),' Wisconsin ')]"))
	WebElement  wisconsin      ;
	@FindBy(xpath=("//span[contains(text(),' South Dakota ')]"))
	WebElement  southdekota ;
	


	// Creat constructor to initialization of object

	public FaxNumber () throws IOException{

		PageFactory.initElements(driver, this);
	}
	//Usage
	public void setalaska() {
		alaska.click();
	}
	public void setfaxnumber()
	{
		faxnumber.click();
	}
	public void setcountry()
	{
		country.click();
	}
	public void setcountry1()
	{
		country1.click();
	}
	public void setarea() throws InterruptedException
	{
		Thread.sleep(2000);
		area.click();
	}
	public void setHawaii()
	{
		hawaii.click();
	}
	public void setarizona()
	{
		arizona.click();
	}
	public void setcalifornia()
	{
		california.click();
	}
	public void setarkansas ()
	{
		arkansas .click();
	}
	public void setcolorado ()
	{
		colorado .click();
	}
	public void setconnecticut  ()
	{
		connecticut .click();
	}
	public void setflorida ()
	{
		florida .click();
	}
	public void setgeorgia  ()
	{
		georgia .click();
	}
	public void setillinois ()
	{
		illinois .click();
	}
	public void setindiana ()
	{
		indiana .click();
	}
	public void setlouisiana ()
	{
		indiana .click();
	}
	public void setmassachusetts ()
	{
		massachusetts.click();
	}
	public void setmichigan ()
	{
		michigan.click();
	}
	public void setminnesota  ()
	{
		minnesota.click();
	}
	public void setnebraska ()
	{
		nebraska.click();
	}
	public void setnevada ()
	{
		nevada.click();
	}
	public void setnewHampshire ()
	{
		newHampshire .click();
	}
	public void  setnewJersey ()
	{
		newJersey .click();
	}
	public void   setnewYork ()
	{
		newYork  .click();
	}
	public void    setnorthCarolina ()
	{
		northCarolina .click();
	}
	public void setohio()
	{
		ohio.click();
	}
	public void setoregon ()
	{
		oregon.click();
	}
	public void setpennsylvania ()
	{
		pennsylvania .click();
	}
	public void settexas  ()
	{
		texas .click();
	}
	public void setvirginia ()
	{
		virginia.click();
	}
	public void setwisconsin ()
	{
		wisconsin.click();
	}
	public void setsouthDakota ()
	{
		southdekota.click();
	}
	public void setalabama ()
	{
		
		alabama.click();
	}//Delaware
	public void setdelaware ()
	{
		delaware.click();
	}


}
