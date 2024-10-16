package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.MediaEntityBuilder;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;

public class WelcomePage extends ProjectSpecificMethod{
	@Then("verify whether the log in is successful")
	public WelcomePage verifyTitle() {
		try {
			System.out.println(driver.getTitle());
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./snaps/img3.png"));
			test.pass("Logged in successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img3.png").build());
		} catch (Exception e) {
			System.out.println(driver.getTitle());
			try {
				FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./snaps/img3.png"));
				test.fail("Login failed",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img3.png").build());
			} catch (Exception e1) {
			}
		}
		return this;
	}
	
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}
	public LoginPage clicklogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}
}
