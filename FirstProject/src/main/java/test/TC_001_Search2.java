package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmazonPage.ProductPage;
import AmazonPage.SearchPage;
import TestNgBase.ProjectSpecificMethods;

public class TC_001_Search2 extends ProjectSpecificMethods{

	@Test
	public void SearchAndClick() {
		SearchPage sp = new SearchPage();
		sp.SearchText("Phone");
		sp.ClickSearch();
		sp.clickOnTheFirstProduct().buynow();
	}
	@BeforeTest
	public void setData() {
		website ="https://www.amazon.in/";
		testcaseName="TC_002_Search";
		testcaseDes="Phone Search";
		AuthorName="Rahul";
		CategoryName="Regression";
	}
}
