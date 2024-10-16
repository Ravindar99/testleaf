package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PvrCinemas {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver pvr = new ChromeDriver(option);
	pvr.get("https://www.pvrcinemas.com/");
	//implicit wait
	pvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	pvr.manage().window().maximize();
	Thread.sleep(1000);
	//city
	pvr.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
	Thread.sleep(1000);
	//cinema or movie
	pvr.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
	Thread.sleep(1000);
	//place
	pvr.findElement(By.xpath("//div[@id='cinema']")).click();
	Thread.sleep(1000);
	pvr.findElement(By.xpath("(//ul[@class='p-dropdown-items']//li)[1]")).click();
	Thread.sleep(1000);
	//select date
	pvr.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
	pvr.findElement(By.xpath("(//ul[@class='p-dropdown-items']//li)[2]")).click();
	Thread.sleep(1000);
	//slect movie
	pvr.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
	pvr.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
	Thread.sleep(1000);
	//show time
	pvr.findElement(By.xpath("//div[@id='time']")).click();
	pvr.findElement(By.xpath("(//ul[@class='p-dropdown-items']//li)[1]")).click();
	Thread.sleep(1000);
	//book button
	pvr.findElement(By.xpath("//button[@class='p-button p-component sc-ikkyvV putEh bgColor filter-btn']")).click();
	Thread.sleep(5000);
	//terms and condition
	pvr.findElement(By.xpath("//button[@class='sc-jlZhRR ewzZVH reject-terms']")).click();
	Thread.sleep(1000);
	//seat selection
	pvr.findElement(By.xpath("(//span[@class='seat-current-pvr'])[1]")).click();
	Thread.sleep(1000);
	//seat summary
	WebElement sum=pvr.findElement(By.xpath("//div[@class='movies-summary']"));
	System.out.println(sum.getText());
	Thread.sleep(1000);
	//seat info
	WebElement seat=pvr.findElement(By.xpath("//div[@class='seat-info']"));
	System.out.println(seat.getText());
	Thread.sleep(1000);
	//1st total
	WebElement total=pvr.findElement(By.xpath("(//div[@class='grand-amount']//h6)[2]"));
	Thread.sleep(1000);
	//proceed button
	pvr.findElement(By.xpath("//button[@class='sc-fUnNpA hWNYVF btn-proceeded']")).click();
	Thread.sleep(5000);
	//final total
	WebElement total2=pvr.findElement(By.xpath("(//div[@class='grand-tota col-md-3']//h6)[2]"));
	System.out.println("The grand total is "+total2.getText());
	Thread.sleep(2000);
	//get title
	System.out.println(pvr.getTitle());
	pvr.quit();
	
}
}
