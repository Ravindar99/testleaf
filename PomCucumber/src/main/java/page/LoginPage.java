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
@Given("enter password")
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
@When("click on the log in button")
public WelcomePage clicklogin() {
	try {
		driver.findElement(By.className("decorativeSubmit")).click();
		/* test.pass("loged in successfully"); */
	} catch (Exception e) {
		test.fail("failed to log in "+e);
	}
	return new WelcomePage();
}
@But("verify whether the log in is unsuccessful")
public void verify_whether_the_log_in_is_unsuccessful() {
	System.out.println(driver.findElement(By.xpath("//h2")).getText());
}
}
