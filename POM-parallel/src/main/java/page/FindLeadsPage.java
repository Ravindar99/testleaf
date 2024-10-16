package page;

import base.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod{
	
	public FindLeadsPage clickPhnoTab() {
		return this;
	}
	public FindLeadsPage enterphno() {
		return this;
	}
	public FindLeadsPage FindLeadsButton() {
		return this;
	}
	public ViewPage clickFirstLeadID() {
		return new ViewPage(driver);
	}
}
