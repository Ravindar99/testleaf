package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmazonPage.ProductPage;
import AmazonPage.SearchPage;
import TestNgBase.ProjectSpecificMethods;
import TestNgBase.RetryEngine;

public class TC_001_Search extends ProjectSpecificMethods{

	@Test(dataProvider = "fetchData",retryAnalyzer = RetryEngine.class)//, retryAnalyzer = RetryEngine.class
	public void SearchAndClick(String text) {
		SearchPage sp = new SearchPage();
		sp.SearchText(text).ClickSearch().clickOnTheFirstProduct().buynow();
	}
	@BeforeTest
	public void setData() {
		website ="https://www.amazon.in/";
		testcaseName="TC_001_Search";
		testcaseDes="Top searched porducts";
		AuthorName="Ravi";
		CategoryName="Regression";
		excelfileName="Products";
	}
}
