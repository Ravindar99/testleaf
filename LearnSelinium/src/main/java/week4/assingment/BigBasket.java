package week4.assingment;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.bigbasket.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.findElement(By.xpath("(//div[@class='relative h-full']/button)[2]")).click(); //shop by category
		Actions action = new Actions(d);//action class
		Thread.sleep(3000);
		WebElement element = d.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		action.moveToElement(element).perform();//mouse over on food oil masala
		action.moveToElement(d.findElement(By.xpath("//a[text()='Rice & Rice Products']"))).perform();//rice
		action.moveToElement(d.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).click().perform();//click on Boiled & Steam Rice"
		Thread.sleep(3000);
		WebElement element1 = d.findElement(By.xpath("//input[@id='i-BBRoyal']"));//bb royal
		d.executeScript("arguments[0].click();", element1);
		Thread.sleep(3000);
		WebElement element2 = d.findElement(By.xpath("//input[@id='i-PonniBoiledRice']"));//ponni boiled rice
		d.executeScript("arguments[0].click();", element2);
		Thread.sleep(3000);
		WebElement element3 = d.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));//tamil ponni boiled rice
		d.executeScript("arguments[0].click();", element3);
		Set<String> windowHandles = d.getWindowHandles();
		List<String> wh=new ArrayList<String>(windowHandles);
		d.switchTo().window(wh.get(1));//switch to windows
		Thread.sleep(3000);
		WebElement element4 = d.findElement(By.xpath("//span[text()='5 kg']/parent::div/parent::div/parent::div"));//5 kg
		d.executeScript("arguments[0].click();", element4);
		String element5 = d.findElement(By.xpath("//td[text()='Price: ']")).getText();
		String price = element5.replaceAll("[^0-9]", "");//price of the rice
		d.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		TakesScreenshot screenshot = (TakesScreenshot)d;//screenshot
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Selenium Screenshots/BB assignment screen shot.png"));
		d.switchTo().window(wh.get(0)).close();
		d.switchTo().window(wh.get(1)).close();
	}
}
