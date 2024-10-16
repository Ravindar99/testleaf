package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC_002_CreateLead extends ProjectSpecificMethod{
	
	@Test
	public void runCreateLead() {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clicklogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterPhno()
		.clickCreateLeadButton()
		.getLeadId();
	}
}
