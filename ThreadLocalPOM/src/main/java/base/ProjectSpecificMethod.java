package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.DataInt;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
	/* public static RemoteWebDriver driver; */
public String testcaseName,testcaseDes,authorName,categoryName,excelFileName;
public static ExtentReports extent;
public static ExtentTest test;

private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
private static final ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
private static final ThreadLocal<ExtentTest> childNode = new ThreadLocal<ExtentTest>();
private static final ThreadLocal<String> testName = new ThreadLocal<String>();

	
	@BeforeMethod
	public void precondition() {
		setNode();
		try {
			/* getDriver()=new ChromeDriver(); */
			setDriver();
			getNode().info("browser launched successfully");
		} catch (Exception e) {
			getNode().info("browser failed to launch "+e);
		}
		try {
			getDriver().get("http://leaftaps.com/opentaps/");
			getNode().info("url loaded successfully");
		} catch (Exception e) {
			getNode().info("unable to load url "+e);
		}
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postcondition() throws InterruptedException {
		Thread.sleep(5000);
		getDriver().close();
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
		setTest();
		setTestName();
		getTest().assignAuthor(authorName);
		getTest().assignCategory(categoryName);
	}
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	public RemoteWebDriver getDriver() {
		return rd.get();
	}
	public void setTest() {
		parentTest.set(test);
	}
	public ExtentTest getTest() {
		return parentTest.get();
	}
	public void setTestName() {
		testName.set(testcaseName);
	}
	public String getTestName() {
		return testName.get();
	}
	public void setNode() {
		ExtentTest node = getTest().createNode(getTestName());
		//doubt on the above line
		childNode.set(node);
	}
	public ExtentTest getNode() {
		return childNode.get();
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return DataInt.IntegrateExcell(excelFileName);
	}
}
