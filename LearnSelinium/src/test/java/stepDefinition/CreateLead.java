package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSPecificMethod{
	@Given("enter username")
	public void enter_username() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	@Given("enter password")
	public void enter_password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("click on the crmsfa button")
	public void click_on_the_crmsfa_button() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("click on the leads button")
	public void click_on_the_leads_button() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("click on create lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("enter company name {string}")
	public void enter_company_name(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@Given("enter first name {string}")
	public void enter_first_name(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}

	@Given("enter last name {string}")
	public void enter_last_name(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@When("click submit button")
	public void click_submit_button() {
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}

}
