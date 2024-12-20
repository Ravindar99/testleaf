package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.DriverBase;

public abstract class Reporter extends DriverBase {

	public static ExtentReports extent;
	public static ExtentTest test;
	public String testcaseName, testcaseDes, AuthorName, CategoryName;

	private String pattern = "dd-MMM-yyyy HH-mm-ss";
	private String filename = "results.html";
	public static String foldername = "";

	@BeforeSuite(alwaysRun = true)
	public void StartReport() {
		String date = new SimpleDateFormat(pattern).format(new Date());
		foldername = "Reports/" + date;
		File folder = new File("./" + foldername);
		if (!folder.exists()) {
			folder.mkdirs(); // can't figure out why this condition exists
		}
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./" + foldername + "/" + filename);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@AfterSuite
	public void EndReport() {
		extent.flush();
	}

	 @BeforeClass(alwaysRun = true) 
	 public void SetReportDetails() {
		 test = extent.createTest(testcaseName,testcaseDes); 
		 test.assignAuthor(AuthorName);
		 test.assignCategory(CategoryName);
	 }
	public abstract long takeSnap(); // already declared variable

	public void reportStep(String desc, String status, boolean bSnap) {
		synchronized (test) {

			// Start reporting the step and snapshot
			MediaEntityModelProvider img = null; // helps in creating screenshot first null value to not take a
													// screenshot
			if (bSnap && !(status.equalsIgnoreCase("INFO") || status.equalsIgnoreCase("skipped"))) 
				// condition to take screenshot if status is neither info nor skipped
			{
				long snapNumber = 10000L; // to save snap name in long integer value
				snapNumber = takeSnap();// above abstract long variable
				try {
					img = MediaEntityBuilder
							.createScreenCaptureFromPath("./../../" + foldername + "/Photos/" + snapNumber + ".jpg")
							.build();
				} catch (IOException e) {
				}
				if (status.equalsIgnoreCase("pass")) {
					test.pass(desc, img);
				} else if (status.equalsIgnoreCase("fail")) {
					test.fail(desc, img);
				} else if (status.equalsIgnoreCase("info")) {
					test.info(desc);
				}
				else if (status.equalsIgnoreCase("skipped")) {
					test.info(desc);
				}
			}
		}
	}
	//takesnap returns a unique identifier which is then stored to snapNumber
	
	
	/*
	 * public long takeSnap() { 
	 * long number = (long) Math.floor(Math.random() *90000L) + 10000L; 
	 * //save the snap name in long value from 10000000L to 909999999L 
	 * try {
	 * FileUtils.copyFile(getDriver().getScreenshotAs(OutputType.FILE), new File("./"+Reporter.foldername+"/Photos/" + number + ".jpg")); 
	 * } 
	 * catch(Exception e) { 
	 * reportStep(e.getMessage(), "fail"); 
	 * } 
	 * return number; 
	 * }
	 */
	public void reportStep(String desc, String status) {
		reportStep(desc, status, true);
	}
}
