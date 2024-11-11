package Base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;

import Design.Browser;
import utils.Reporter;

public class SeleniumBase extends Reporter implements Browser{

	@Override
	public void StartApp(String browser, String url) {
		getDriver().get(url);
		getDriver().manage().window().maximize();
	}

	@Override
	public void SwitchFrame(int index) {
		try {
			Thread.sleep(100);
			getDriver().switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			reportStep("No such frame with index "+index+ "is availble\n" + e.getMessage(), "warning", false, "null");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}catch (Exception e) {
			reportStep("No such frame with index "+index+ "is availble\n" + e.getMessage(), "fail", false, "null");
		}
	}

	@Override
	public void SwitchFrame(WebElement ele) {
		try {
			getDriver().switchTo().frame(ele);
		} catch (NoSuchFrameException e) {
			reportStep("No such frame with webelement "+ele+ "is availble\n" + e.getMessage(), "warning", false, "null");
		}catch (Exception e) {
			reportStep("No such frame with webelement "+ele+ "is availble\n" + e.getMessage(), "fail", false, "null");
		}
		
	}

	@Override
	public void SwitchFrame(String value) {
		try {
			getDriver().switchTo().frame(value);
		} catch (NoSuchFrameException e) {
			reportStep("No such frame with string "+value+ "is availble\n" + e.getMessage(), "warning", false, "null");
		}catch (Exception e) {
			reportStep("No such frame with string "+value+ "is availble\n" + e.getMessage(), "fail", false, "null");
		}
		
	}

	@Override
	public void LocateElement(String value) {
		try {
			getDriver().findElement(By.xpath(value));
		} catch (NoSuchElementException e) {
			reportStep("No such element with value "+value+" is found\n" + e.getMessage(), "warning", false, "null");
		}catch (Exception e) {
			reportStep("No such element with value "+value+" is found\n" + e.getMessage(), "fail", false, "null");
		}
		
	}

	@Override
	public void SwitchWindow(int index) {
		try {
			Set<String> allWindows = getDriver().getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			getDriver().switchTo().window(allhandles.get(index));
			reportStep("The window with index "+index+" is swithced successfully", "info", false, "null");
		} catch (NoSuchWindowException e) {
			reportStep("The window with index "+index+" is not found\n" +e.getMessage(), "warning", false, "null");
		} catch(Exception e) {
			reportStep("The window with index "+index+" is not found\n" +e.getMessage(), "fail", false, "null");
		}
	}

}
