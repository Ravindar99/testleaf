package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnAlert {
	public static void main(String[] args) {
		ChromeDriver prompt=new ChromeDriver();
		prompt.get("https://www.leafground.com/alert.xhtml");
		prompt.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		prompt.manage().window().maximize();
		prompt.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		prompt.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		Alert p = prompt.switchTo().alert();
		p.sendKeys("Ravi");
		p.accept();
		WebElement element = prompt.findElement(By.xpath("//span[@id='confirm_result']"));
		System.out.println(element.getText());
		prompt.quit();
	}

}
