package base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import design.Browser;
import design.Element;
import design.Locators;
import utils.Reporter;

public class SeleniumBase extends Reporter implements Element,Browser {

	@Override
	public void clearandtype(WebElement ele, String value) {
		ele.clear();
		ele.sendKeys("",value);
	}

	@Override
	public void click(Locators type,String value) {
		WebElement ele = locateElement(type,value);
		ele.click();
	}
	
	@Override
	public void load(String url) {
		getDriver().get(url);
	}
	
	@Override
	public void quit() {
		getDriver().quit();
		
	}
	
	@Override
	public WebElement locateElement(Locators type, String value) {
		switch (type) {
		case xpath:
			return getDriver().findElement(By.xpath(value));
		case id:
			return getDriver().findElement(By.id(value));
		}
		return null;
	}

	@Override
	public void close() {
		getDriver().close();
	}

	/*
	 * @Override public long takeSnap() { long number = (long)
	 * Math.floor(Math.random() * 90000L) + 10000L; //save the snap name in long
	 * value from 10000000L to 909999999L try {
	 * FileUtils.copyFile(getDriver().getScreenshotAs(OutputType.FILE), new
	 * File("./"+Reporter.foldername+"/Photos/" + number + ".jpg")); } catch
	 * (Exception e) { reportStep(e.getMessage(), "fail"); } return number; }
	 */

	@Override
	public void switchtowindow(int index) {
		try {
			Set<String> windows = getDriver().getWindowHandles();
			List<String> handles = new ArrayList<String>(windows);
			getDriver().switchTo().window(handles.get(index));
			reportStep("The window with index "+index+" is switched successfully","info", false,name); reportStep(getDriver().getTitle(), "info", name);
			 
		}
		catch(NoSuchWindowException e) {
			reportStep("The window with index "+index+" is not availabe\n"+e.getMessage(), "fail", false,name);
		}
		catch(Exception e) {
			reportStep("The window with index "+index+" is not availabe\n"+e.getMessage(), "fail", false,name);
		}
		
	}

	@Override
	public boolean switchtowindow(String title) {
		try {
			Set<String> windows = getDriver().getWindowHandles();
			for(String eachwindows : windows) {
				getDriver().switchTo().window(eachwindows);
				if(getDriver().getTitle().equals(title)) {
					break;
				}
			}
			reportStep("The window with title "+title+" is switched successfully", "info",name);
			return true;
		}
		catch(NoSuchWindowException e) {
			reportStep("The window with index "+title+" is not availabe\n"+e.getMessage(), "fail", false,name);
		}
		return false;
	}

}
