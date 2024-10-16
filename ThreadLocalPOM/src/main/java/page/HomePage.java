package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	public LeadsPage clickLeadsTab() {
		getDriver().findElement(By.xpath("//a[text()='Leads']")).click();
		return new LeadsPage();
	}
	public void clickAccountsTab() {
	}
	public void clickContactsTab() {
	}
}
