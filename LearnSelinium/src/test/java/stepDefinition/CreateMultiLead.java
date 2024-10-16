package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateMultiLead extends ProjectSPecificMethod{

	@Given("enter company name (.*)$")
	public void enter_company_name(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@Given("enter first name (.*)$")
	public void enter_first_name(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}

	@Given("enter last name (.*)$")
	public void enter_last_name(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@Given("enter phone number (.*)$")
	public void enter_phone_number(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}
	@When("click the submit button")
	public void click_the_submit_button() {
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}

}
