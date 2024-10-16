package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
public static RemoteWebDriver driver;
public String testcaseName,testcaseDes,authorName,categoryName;
public static ExtentReports extent;
public static ExtentTest test;
	
	@BeforeMethod
	public void precondition() {
		try {
			driver=new ChromeDriver();
			test.info("browser launched successfully");
		} catch (Exception e) {
			test.info("browser failed to launch "+e);
		}
		try {
			driver.get("http://leaftaps.com/opentaps/");
			test.info("url loaded successfully");
		} catch (Exception e) {
			test.info("unable to load url "+e);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postcondition() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/Result.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void setreportDetails() {
		test = extent.createTest(testcaseName,testcaseDes);
		test.assignAuthor(authorName);
		test.assignCategory(categoryName);
	}
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
}
