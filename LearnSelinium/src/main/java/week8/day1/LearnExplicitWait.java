package week8.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		//
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ww = new ArrayList<String>(windowHandles);
		driver.switchTo().window(ww.get(2));
		System.out.println(driver.getTitle());
	}
}
