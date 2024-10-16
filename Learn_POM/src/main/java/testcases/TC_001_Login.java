package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;
import page.WelcomePage;

public class TC_001_Login extends ProjectSpecificMethod{
	@Test
	public void runLogin() {
	new LoginPage()
	.enterUserName()
	.enterPassword()
	.clicklogin()
	.verifyTitle();
	}
	@BeforeTest
	public void setData() {
		testcaseName="TC_001_Login";
		testcaseDes="login with valid credentials";
		authorName="Ravi";
		categoryName="Regression";
	}
}
