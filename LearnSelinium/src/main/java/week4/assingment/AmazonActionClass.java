package week4.assingment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActionClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter text,keys.enter method
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro"+Keys.ENTER);
		//price 
		String price = d.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		String p =price.replaceAll("[^0-9]","");
		System.out.println("The price of the first product is "+p);
		//rating
		String rating = d.findElement(By.xpath("((//div[@class='a-row a-size-small'])[1]/span)[2]")).getText();
		String r=rating.replaceAll("[^0-9]", "");
		System.out.println("The number of reviewers for the first product are "+r);
		//click on the first link
		d.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		//windowhandle method, intial return type string
		Set<String> windowHandles = d.getWindowHandles();
		//set converted to list to access get method
		List<String> ww =new ArrayList <String>(windowHandles);
		//get method,switch to method
		d.switchTo().window(ww.get(1));
		//take screenshot
		WebElement element = d.findElement(By.xpath("//div[@id='centerCol']"));
		File screenshot = element.getScreenshotAs(OutputType.FILE);
		//save in location
		FileUtils.copyFile(screenshot, new File("./Selenium Screenshots/Amaozn assignment screen shot.png"));
		System.out.println("Screenshot is captured");
		//screensot cropped,only window bellow the url bar is shown
	}

}
