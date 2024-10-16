package page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public LeadsPage clickLeadsTab() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return new LeadsPage(driver);
	}
	public void clickAccountsTab() {
	}
	public void clickContactsTab() {
	}
}
