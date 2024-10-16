package week8.day1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {
public static void main(String[] args) {
	//reporter and file path
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/result.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	ExtentTest test = extent.createTest("TC_001_Login");
	test.assignAuthor("Ravi");
	test.assignCategory("Regression");
	test.info("browser launched successfully");
	test.pass("username valid");
	test.pass("password valid");
	test.fail("login failed");
	extent.flush();
}
}
