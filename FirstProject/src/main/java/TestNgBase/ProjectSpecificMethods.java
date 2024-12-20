package TestNgBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.SeleniumBase;

public class ProjectSpecificMethods extends SeleniumBase{

	@BeforeMethod
	public void precondition() {
		setDriver();
		load("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void postcondition() {
		quit();
	}
}
