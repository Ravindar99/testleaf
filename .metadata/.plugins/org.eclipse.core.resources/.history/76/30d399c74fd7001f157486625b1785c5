package AmazonPage;

import TestNgBase.ProjectSpecificMethods;
import design.Locators;

public class ProductPage extends ProjectSpecificMethods {
	
	public ProductPage buynow() {
		try {
			click(Locators.xpath, "//input[@id='buy-now-button']");
			reportStep("The buy now button is clicked successfully", "pass", "buynow");
		} catch (Exception e) {
			reportStep("The buy now button is failed to be clicked ", "fail", "buynow");
		}
		return this;
	}
}
