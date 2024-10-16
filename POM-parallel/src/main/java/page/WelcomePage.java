package page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

	public WelcomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public WelcomePage verifyTitle() {
		System.out.println(driver.getTitle());
		return this;
	}
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}
	public LoginPage clicklogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
}
