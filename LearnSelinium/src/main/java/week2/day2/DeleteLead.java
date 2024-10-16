package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main (String[] args) throws InterruptedException {
		ChromeDriver lead = new ChromeDriver();
		  lead.manage().window().maximize();
		  lead.get("http://leaftaps.com/opentaps/");
		  Thread.sleep(3000);
		  lead.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		  lead.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		  Thread.sleep(3000);
		  lead.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		  Thread.sleep(3000);
		  lead.findElement(By.id("button")).click();
		  Thread.sleep(3000);
		  lead.findElement(By.xpath("(//div[@class='x-panel-header'])[2]")).click();
		  Thread.sleep(3000);
		  lead.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		  Thread.sleep(3000);
		  //since the captured value should be returned, we assign a variable using datatype WebElement thereby storing it
		  WebElement text=lead.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
		  String rahul =text.getText();
		  int rahul1=Integer.parseInt(rahul);
		  System.out.println(rahul1);
		  Thread.sleep(2000);
		  lead.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		  Thread.sleep(1000);
		  lead.findElement(By.className("subMenuButtonDangerous")).click();
		  Thread.sleep(1000);
		  lead.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		  Thread.sleep(1000);
		  lead.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[1]")).sendKeys(rahul);
		  Thread.sleep(1000);
		  lead.findElement(By.xpath("(//td[@class='x-panel-btn-td']//button)[6]")).click();
		  Thread.sleep(1000);
		  WebElement delete=lead.findElement(By.xpath("//div[@class='x-paging-info']"));
		  System.out.println(delete.getText());
		  Thread.sleep(2000); 
		  lead.quit();
		}

		}


