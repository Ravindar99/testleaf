package runner;

import org.testng.annotations.BeforeTest;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/feature/login.feature",glue="page")
public class TC_001_Login2 extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		testcaseName="TC_001_Login2";
		testcaseDes="login with Invalid credentials";
		authorName="Ravi";
		categoryName="Regression";
	}
}

