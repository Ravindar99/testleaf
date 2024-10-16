package page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	
	public LeadsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public CreateLeadsPage clickCreateLeadLink() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new CreateLeadsPage(driver);
	}
	public FindLeadsPage clickFindLeadlink() {
		return new FindLeadsPage();
	}
	public void clickMergeLeadLink() {
	}
}
