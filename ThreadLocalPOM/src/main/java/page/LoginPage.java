package page;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import com.aventstack.extentreports.MediaEntityBuilder;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{
@And("enter username")
public LoginPage enterusername() {
	try {
		getDriver().findElement(By.id("username")).sendKeys("DemoSalesManager");
		FileUtils.copyFile(getDriver().getScreenshotAs(OutputType.FILE), new File("./snaps/img1.png"));
		getNode().pass("username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img1.png").build());
	} catch (Exception e) {
		try {
			FileUtils.copyFile(getDriver().getScreenshotAs(OutputType.FILE), new File("./snaps/img1.png"));
			getNode().fail("incorrect username "+e,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img1.png").build());
		} catch (Exception e1) {
			
		}
	}
	return this;
}
@Given("enter password")
public LoginPage enterPassword() {
	try {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		FileUtils.copyFile(getDriver().getScreenshotAs(OutputType.FILE), new File("./snaps/img2.png"));
		getNode().pass("password entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img2.png").build());
	} catch (Exception e) {
		try {
			FileUtils.copyFile(getDriver().getScreenshotAs(OutputType.FILE), new File("./snaps/img2.png"));
			getNode().fail("incorrect password "+e,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img2.png").build());
		} catch (Exception e1) {
		} 
	}
	return this;
}
@When("click on the log in button")
public WelcomePage clicklogin() {
	try {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		/* test.pass("loged in successfully"); */
	} catch (Exception e) {
		getNode().fail("failed to log in "+e);
	}
	return new WelcomePage();
}
/*
 * @But("verify whether the log in is unsuccessful") public void
 * verify_whether_the_log_in_is_unsuccessful() {
 * System.out.println(getDriver().findElement(By.xpath("//h2")).getText()); }
 */
}
