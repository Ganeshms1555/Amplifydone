package TestTemplet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Com.Resource.ExtentReporterNG;
import Com.qa.base.ComTestBase;

public class Listners extends ComTestBase  implements ITestListener  {

	public Listners() throws IOException {
		super();
		
	}
	ExtentTest test;
  ExtentReports extent=ExtentReporterNG.getReportObject();
	
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
	
		test= extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);		
	}
	public void onTestSuccess(ITestResult result) {

		extentTest.get().log(Status.PASS, "Test Passed");
	}
public void onTestFailure(ITestResult result) {
		
		//Screenshot
		extentTest.get().fail(result.getThrowable());
		WebDriver driver = null;
		String testMethodName =result.getMethod().getMethodName();
		
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			
		}
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName), result.getMethod().getMethodName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void onTestSkipped(ITestResult result) {
	System.out.println(" Test Case is Skipped ");
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println(" onTestFailedButWithinSuccessPercentage ");
	
}

public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println(" onTestFailedWithTimeout ");
	
}

public void onStart(ITestContext context) {
	System.out.println(" onStart ");

}

public void onFinish(ITestContext context) {
	System.out.println(" onFinish ");
	
	extent.flush();
}


	

}
