package TestNgBase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import base.SeleniumBase;
import design.Browser;
import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase{
	
	public String website = null;

	@BeforeMethod
	public void precondition() {
		setDriver();
		load(website);
	}
	
	@AfterMethod
	public void postcondition() {
		quit();
	}
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchdata() throws IOException{
		return DataLibrary.getData(excelfileName);
	}
}
