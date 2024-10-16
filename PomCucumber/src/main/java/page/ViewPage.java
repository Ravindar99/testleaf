package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class ViewPage extends ProjectSpecificMethod{
	
	public ViewPage getLeadId() {
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		return this;
	}
	public EditLeadPage clickEditButton() {
		return new EditLeadPage();
	}
	public void clickDeleteButton() {
		
	}
}
