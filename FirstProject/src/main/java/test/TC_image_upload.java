package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GooglePage.File_Upload;
import TestNgBase.ProjectSpecificMethods;

public class TC_image_upload extends ProjectSpecificMethods{
	
	@Test
	public void uploadthefile() {
		File_Upload fu = new File_Upload();
		fu.clickSearch();
		fu.uploadimage();
	}
	@BeforeTest
	public void setData() {
		website ="https://www.google.com/";
		testcaseName="TC_image_upload";
		testcaseDes="file upload";
		AuthorName="Rahul";
		CategoryName="Regression";
	}

}
