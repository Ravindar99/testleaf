package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateLeadsPage extends ProjectSpecificMethod{
	public CreateLeadsPage enterCompanyName(String cname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public CreateLeadsPage enterFirstName(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;	
	}
	public CreateLeadsPage enterLastName(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public CreateLeadsPage enterPhno(String phno) {
		getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		return this;
	}
	public ViewPage clickCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewPage();
	}
}
