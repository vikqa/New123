package  com.deftsoft.demo.utilities;

import  com.deftsoft.demo.common.Common;
import  com.deftsoft.demo.selenium.web.BrowserDriver;
import com.deftsoft.demo.selenium.web.Browsers;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {
	final static Logger logger = Logger.getLogger(TestListener.class);
	boolean isRecordingAllowed = false;
	String testLinkURL = "";
	String devKeyAdmin = "";
	String devKeyUser = "";
	String project = "";
	String testPlan = "";
	String build = "";
	String des = "";
	int count = 0;

//	VideoReord videoReord = new VideoReord();

	@Override
	public void onFinish(ITestContext arg0) {
		logger.info("Test Cases Execution Finished ");
		stopVideoRecording();		
	}

	@Override
	public void onStart(ITestContext arg0) {
		logger.info("Test Cases Execution Started");	
		String suite = arg0.getSuite().getName();
		startVideoRecording(suite);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
		String methodName = arg0.getName().toString().trim();		
		String path = takeScreenShot(methodName, "Fail");
		arg0.setAttribute("imagePath", path);
		
		String notes = methodName + " Test Case failed";
	logger.info(notes);
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		
		String methodName = arg0.getName().toString().trim();	
		String path = "";
		arg0.setAttribute("imagePath", path);
		
		String notes = methodName + " Test Case skipped";
		logger.info(notes);

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		logger.info(arg0.getName().toString().trim() + " Test Case started");		
		WebDriver driver = null;		
		driver = BrowserDriver.driver;
		if (driver != null) {
			// String browserName = getBrowserName(driver);
			// startVideoRecording(methodName, browserName);
		}

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
	
		String methodName = arg0.getName().toString().trim();
		
		String path = takeScreenShot(methodName, "Amit");
		arg0.setAttribute("imagePath", path);
		
		String notes = methodName + " Test Case passed";
 logger.info(notes);
	}

	private String takeScreenShot(String methodName, String status) {
		String filePath = "";
		String current = "";
		try {
			WebDriver driver = null;			
			driver = BrowserDriver.driver;
			if (driver != null) {

				String browserName = getBrowserName(driver);
				String d = Common.getCurrentDateTime();

				if (status == "Fail") {
					filePath = ".\\screenshots\\failures\\" + browserName + "\\" + methodName + d + ".png";
				} else {
					filePath = ".\\screenshots\\success\\" + browserName + "\\" + methodName + d + ".png";
				}

				if (driver != null) {
					File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

					FileUtils.copyFile(scrFile, new File(filePath));
					current = new java.io.File( "." ).getCanonicalPath();			
					filePath = Common.getFolderName(filePath);
					filePath = current + filePath;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();

		}
		return filePath;

	}

	private String getBrowserName(WebDriver driver) {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		if (browserName.equals(Browsers.IEXPLORER.getValue()))
			browserName = "internetexplorer";
		return browserName;
	}

	private void startVideoRecording(String methodName) {
		if (isRecordingAllowed) {
			//videoReord.startRecording(methodName);
		}

	}

	private void stopVideoRecording() {
		if (isRecordingAllowed) {
			try {
				Thread.sleep(10000);
		//		videoReord.stopRecording();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
