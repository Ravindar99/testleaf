package PracticeCodes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver d = new ChromeDriver(options);
	d.get("https://login.salesforce.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
	d.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
	d.findElement(By.xpath("//input[@id='Login']")).click();
	d.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	d.findElement(By.xpath("//button[text()='View All']")).click();
	Thread.sleep(4000);
	d.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
	Thread.sleep(4000);
	WebElement oppo=d.findElement(By.xpath("//span[text()='Opportunities']"));
	d.executeScript("arguments[0].click();", oppo);
	Thread.sleep(4000);
	//label click
	WebElement element2 = d.findElement(By.xpath("//a[@title='Show 2 more actions']"));
	d.executeScript("arguments[0].click();", element2);
	Thread.sleep(4000);
	/* WebElement element = */d.findElement(By.xpath("(//li[@class='uiMenuItem'])[1]")).click();
	/* d.executeScript("arguments[0].click();", element); */
	d.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Ravindar");
	d.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
	d.findElement(By.xpath("//input[@name='CloseDate']")).click();
	WebElement element3 = d.findElement(By.xpath("//button[@name='today']"));
	d.executeScript("arguments[0].click();", element3);
	d.findElement(By.xpath("//button[@aria-label='Stage']")).click();
	d.findElement(By.xpath("//div//lightning-base-combobox-item//span[text()='Needs Analysis']")).click();
	d.findElement(By.xpath("(//lightning-button//button[text()='Save'])[2]")).click();
	Thread.sleep(4000);
	System.out.println(d.getTitle());
}
}
