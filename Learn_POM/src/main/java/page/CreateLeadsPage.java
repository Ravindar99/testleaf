package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateLeadsPage extends ProjectSpecificMethod{
	public CreateLeadsPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	public CreateLeadsPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;	
	}
	public CreateLeadsPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
	}
	public CreateLeadsPage enterPhno() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
	}
	public ViewPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewPage();
	}
}
