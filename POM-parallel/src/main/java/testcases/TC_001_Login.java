package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;
import page.WelcomePage;

public class TC_001_Login extends ProjectSpecificMethod{
	@Test
	public void runLogin() {
	new LoginPage(driver)
	.enterUserName()
	.enterPassword()
	.clicklogin()
	.verifyTitle()
	.clicklogout();
	}
}
