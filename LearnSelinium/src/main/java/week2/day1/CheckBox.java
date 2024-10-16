package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver cb = new ChromeDriver();
	cb.get("https://leafground.com/checkbox.xhtml");
	Thread.sleep(2000);
	cb.manage().window().maximize();
	Thread.sleep(2000);
	cb.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	Thread.sleep(2000);
	cb.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	Thread.sleep(2000);
	cb.findElement(By.xpath("(//table[@id='j_idt87:basic']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
	Thread.sleep(2000);
	cb.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	Thread.sleep(2000);
	cb.findElement(By.xpath("//div[@id='j_idt87:j_idt100']/div[@class='ui-toggleswitch-slider']")).click();
	Thread.sleep(2000);
	cb.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	Thread.sleep(2000);
	// it is better to take a unique xpath value
	cb.findElement(By.xpath("(//div[@id='j_idt87:multiple_panel']//div[@class='ui-chkbox ui-widget'])[2]")).click();
	Thread.sleep(2000);
	//if i use this xpath //label[@for='6609b44d-c2be-4128-978b-f7a95b1f232c']/preceding-sibling::div[@class='ui-chkbox ui-widget'] the box is not checked
	cb.findElement(By.xpath("(//div[@id='j_idt87:multiple_panel']//div[@class='ui-chkbox ui-widget'])[5]")).click();
	Thread.sleep(2000);
	cb.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
	Thread.sleep(5000);
	cb.getTitle();
	System.out.println(cb.getTitle());
	Thread.sleep(2000);
	//object.quit();closes all the tab in the browser
	cb.quit();
	}
}
