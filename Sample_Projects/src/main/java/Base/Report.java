package Base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	
	public static ExtentReports extent;
	public String tetcasename,tesdesc,author,category;
	public static String foldername = "";
	
	private String filename = "results.html";
	private String pattern = "dd-MMM-yyy HH-mm-ss";
	
	public void SetUpReport() {
		//need to save the file in date format (pattern)
		String date = new SimpleDateFormat(pattern).format(new Date()); 
		//SimpleDateFormat creates date in specified pattern
		//format converts num date to string date type
		foldername = "Reports/"+date;
		File folder = new File("./"+foldername); //code to create new file
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./"+foldername+"/"+filename);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	public void EndReport() {
		extent.flush();
	}
	
	public void SetDetails() {
		ExtentTest test = extent.createTest(tetcasename, tesdesc);
		test.assignAuthor(author);
		test.assignCategory(category);
		
	}
}
