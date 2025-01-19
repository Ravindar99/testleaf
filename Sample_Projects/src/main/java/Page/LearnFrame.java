package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	
	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/nested_frames");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement left = d.findElement(By.xpath("//frame[@name='frame-left']"));
		d.switchTo().frame(left);
	}

}
