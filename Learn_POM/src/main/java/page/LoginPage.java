package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.MediaEntityBuilder;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
public LoginPage enterUserName() {
	try {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./snaps/img1.png"));
		test.pass("username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img1.png").build());
	} catch (Exception e) {
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./snaps/img1.png"));
			test.fail("incorrect username "+e,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img1.png").build());
		} catch (Exception e1) {
			
		}
	}
	return this;
}
public LoginPage enterPassword() {
	try {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./snaps/img2.png"));
		test.pass("password entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img2.png").build());
	} catch (Exception e) {
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./snaps/img2.png"));
			test.fail("incorrect password "+e,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img2.png").build());
		} catch (Exception e1) {
		} 
	}
	return this;
}
public WelcomePage clicklogin() {
	try {
		driver.findElement(By.className("decorativeSubmit")).click();
		test.pass("loged in successfully");
	} catch (Exception e) {
		test.fail("failed to log in "+e);
	}
	return new WelcomePage();
}
}
