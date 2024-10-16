package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.ProjectSPecificMethod;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends ProjectSPecificMethod{
	/*
	 * @Given("launch the browser and load url") public void
	 * launch_the_browser_and_load_url() { driver=new ChromeDriver();
	 * driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 */
	@Given("enter username {string}")
	public void enter_username(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("enter password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("click on the log in button")
	public void click_on_the_log_in_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("verify whether the log in is successful")
	public void verify_whether_the_log_in_is_successful() {
	    System.out.println(driver.findElement(By.xpath("//h2")).getText());
	}
	@But("verify whether the log in is unsuccessful")
	public void verify_whether_the_log_in_is_unsuccessful() {
		System.out.println(driver.findElement(By.xpath("//h2")).getText());
	}

}
