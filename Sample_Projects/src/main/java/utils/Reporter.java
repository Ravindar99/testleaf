package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.DriverBase;

public class Reporter extends DriverBase{
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testcasename,tesdesc,author,category;
	public static String foldername = "";
	
	private String filename = "results.html";
	private String pattern = "dd-MMM-yyy HH-mm-ss";
	
	public void SetUpReport() {
		//need to save the file in date format (pattern)
		String date = new SimpleDateFormat(pattern).format(new Date()); 
		//SimpleDateFormat creates date in specified pattern
		//format converts num date to string date type
		foldername = "Reports/"+date;
		File folder = new File("./"+foldername);
		//code to create new file
		if (!folder.exists()) {
            folder.mkdirs();
        } //ensure directory exists
		System.out.println(folder.getAbsolutePath());
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./"+foldername+"/"+filename);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	public void EndReport() {
		extent.flush();
	}
	
	public void SetDetails() {
		test = extent.createTest(testcasename, tesdesc);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	
	//create a method to take ss - mediaentitymodelprovider, build, path, takescreenshotas, outputfile.as, copyfile
	//dont need to take ss or log test details if the status is info skip etc..
	//so need if condition for the above
	//a method to reduce code work for each page
	
	public void reportStep(String des, String status,boolean bsnap, String photo) {
		//take ss and report only if pass or fail.
		// therefore need a if condition
		MediaEntityModelProvider img = null; //intitally null so that no ss
		//the bellow if condition deals with taking screen shot
		if(bsnap && !(status.equalsIgnoreCase("skip")||status.equalsIgnoreCase("info"))) { //condition ok 
			// we can now build ss
			try {
				// Ensure Image folder exists
                File imageFolder = new File("./" + foldername + "/Image");
                if (!imageFolder.exists()) {
                    imageFolder.mkdirs();
                }
				FileUtils.copyFile(getDriver().getScreenshotAs(OutputType.FILE), new File("./"+foldername+"/Image/"+photo+".jpg"));
				img = MediaEntityBuilder.createScreenCaptureFromPath(new File(foldername + "/Image/" + photo + ".jpg").getAbsolutePath()).build();
				//need image number to build screenshot
			} catch (IOException e) {
				System.out.println("Failed to take ScreenShot due to "+e.getMessage());
			}
			//...................................................................................................
			// need to log details for each test
			// bellow if and else if condition deals with logging details,(nested)
			if(status.equalsIgnoreCase("pass")) {
				test.pass(des, img);
			}
			else if (status.equalsIgnoreCase("fail")) {
				test.fail(des, img);
			}
			else if (status.equalsIgnoreCase("info")) {
				test.info(des);
			}
			else if (status.equalsIgnoreCase("skip")) {
				test.skip(des);
			}
			else if (status.equalsIgnoreCase("warning")) {
				test.warning(des);
			}
		}
	}
	
	public void reportStep(String des, String status,String photo) {
		reportStep(des, status, true, photo);
	}
}
