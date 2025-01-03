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

	private static ExtentReports extent;
	private static final ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	public String testcaseName, testcaseDes, AuthorName, CategoryName, name;

	private String pattern = "dd-MMM-yyyy HH-mm-ss"; 
	private String filename = "results.html";
	public static String foldername = "";

	@BeforeSuite(alwaysRun = true)
	public void StartReport() {
		String date = new SimpleDateFormat(pattern).format(new Date());
		foldername = "Reports/" + date;
		File folder = new File("./" + foldername);
		if (!folder.exists()) {
			folder.mkdirs(); // creates new folder if the folder does not exists
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
		 test.set(extent.createTest(testcaseName, testcaseDes)); // Use test.set()
		 test.get().assignAuthor(AuthorName);
		 test.get().assignCategory(CategoryName);
	 }

		/*
		 * public abstract long takeSnap(); // already declared variable
		 */
	public void reportStep(String desc, String status, boolean bSnap,String name) {
		 

			// Start reporting the step and snapshot
			MediaEntityModelProvider img = null; // helps in creating screenshot first null value to not take a
													// screenshot
			if (bSnap && !(status.equalsIgnoreCase("INFO") || status.equalsIgnoreCase("skipped"))) 
				// condition to take screenshot if status is neither info nor skipped
			{
				/*
				 * long snapNumber = 10000L; // to save snap name in long integer value
				 * snapNumber = takeSnap();// above abstract long variable
				 */	try {
					FileUtils.copyFile(getDriver().getScreenshotAs(OutputType.FILE), new File("./"+Reporter.foldername+"/Photos/" + name + ".jpg"));
					img = MediaEntityBuilder.createScreenCaptureFromPath(new File("./"+Reporter.foldername+"/Photos/" + name + ".jpg").getAbsolutePath()).build();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (status.equalsIgnoreCase("pass")) {
					test.get().pass(desc, img);
				} else if (status.equalsIgnoreCase("fail")) {
					test.get().fail(desc, img);
				} else if (status.equalsIgnoreCase("info")) {
					test.get().info(desc);
				}
				else if (status.equalsIgnoreCase("skipped")) {
					test.get().info(desc);
				}
			}
		}
	
	
	public void reportStep(String desc, String status,String name) {
		reportStep(desc, status, true,name);
	}
}
