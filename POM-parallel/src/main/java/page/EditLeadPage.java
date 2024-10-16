package page;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class EditLeadPage extends ProjectSpecificMethod{

	public EditLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public EditLeadPage EditCompanyName() {
		return this;
	}
	public ViewPage clickUpdateButton() {
		return new ViewPage(driver);
	}
}
