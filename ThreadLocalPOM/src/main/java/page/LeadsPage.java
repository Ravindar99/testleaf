package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	
	public CreateLeadsPage clickCreateLeadLink() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadsPage();
	}
	public FindLeadsPage clickFindLeadlink() {
		return new FindLeadsPage();
	}
	public void clickMergeLeadLink() {
	}
}
