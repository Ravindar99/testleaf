package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;
import page.LoginPage;
@CucumberOptions(features="src/main/java/feature/login.feature",glue="page")
public class TC_001_Login extends ProjectSpecificMethod{
	/*
	 * @Test public void runLogin() { new LoginPage() .enterusername()
	 * .enterPassword() .clicklogin() .verifyTitle(); }
	 */
	@BeforeTest
	public void setData() {
		testcaseName="TC_001_Login";
		testcaseDes="login with valid credentials";
		authorName="Ravi";
		categoryName="Regression";
	}
}

