package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	@Test(dataProvider = "sendData")
	public void RunCreateLead(String cname,String fname,String lname,String phNo) {

		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.get("http://leaftaps.com/opentaps/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 * 
		 * driver.findElement(By.linkText("CRM/SFA")).click();
		 */
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		/* driver.close(); */
	}
	@DataProvider
	public String [][] sendData() throws IOException{
		return ReadExcell.IntegrateExcell();
	}
}
