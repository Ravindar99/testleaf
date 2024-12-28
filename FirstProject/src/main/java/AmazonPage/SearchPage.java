package AmazonPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import TestNgBase.ProjectSpecificMethods;
import design.Locators;

public class SearchPage extends ProjectSpecificMethods{
	
	public SearchPage SearchText(String text){
		try {
			clearandtype(locateElement(Locators.xpath,"//input[@id='twotabsearchtextbox']"),text);
			 reportStep("The  text "+text+" is entered successfully", "pass","type_text"); 
		} catch (Exception e) {
			 reportStep(text+" text is failed to enter", "fail","type_text"); 
		}
		return this;
	}
	
	public SearchPage ClickSearch() {
		click(Locators.xpath, "//input[@id='nav-search-submit-button']");
		return this;
	}
	public ProductPage clickOnTheFirstProduct() {
			click(Locators.xpath,"(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]");
			switchtowindow(1);
			System.out.println(getDriver().getTitle());
			 reportStep("The first Product", "pass","1st_product"); 
			return new ProductPage();
	}
}
