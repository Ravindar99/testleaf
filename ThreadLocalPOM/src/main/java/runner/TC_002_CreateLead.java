package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC_002_CreateLead extends ProjectSpecificMethod{
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cname,String fname,String lname,String phno) {
		new LoginPage()
		.enterusername()
		.enterPassword()
		.clicklogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLeadLink()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterPhno(phno)
		.clickCreateLeadButton()
		.getLeadId();
	}
	@BeforeTest
	public void setData() {
		testcaseName="TC_002_CreateLead";
		testcaseDes="Create Lead with valid credentials";
		authorName="Ravi";
		categoryName="Regression";
		excelFileName="CreateLead";
	}
}
