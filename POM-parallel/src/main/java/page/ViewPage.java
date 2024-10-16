package page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class ViewPage extends ProjectSpecificMethod{
	
	public ViewPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public ViewPage getLeadId() {
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		return this;
	}
	public EditLeadPage clickEditButton() {
		return new EditLeadPage(driver);
	}
	public void clickDeleteButton() {
		
	}
}
