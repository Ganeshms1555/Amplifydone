package Scenarios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.qa.base.ComTestBase;

public class Basicplan extends ComTestBase {
	WebDriver driver;

	public Basicplan() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void openbrowser() throws InterruptedException {

		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.ifaxapp.com/");
		Thread.sleep(2000);
	}
	@Test
	public void freelogin() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Start Free')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("g192s@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Ganesh12345@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"cpassword\"]")).sendKeys("Ganesh12345@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[contains(text(),'CONTINUE')])[2]")).click();
		
		
		System.out.println("-------------------------");
	}
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}

}
