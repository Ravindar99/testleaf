package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonBags {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver amz=new ChromeDriver(option);
		amz.get("https://www.amazon.in/");
		//implicit wait 
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		amz.manage().window().maximize();
		//click search box and type bag for boys
		amz.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for Boys");
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click search button
		amz.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to get the search results
		WebElement results = amz.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		System.out.println(results.getText());
		//click the first brand filter
		amz.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click the second brand filter
		amz.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//sort by filter
		amz.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//newest arrivals
		amz.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//first search result
		WebElement name=amz.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
		System.out.print(name.getText());
		Thread.sleep(2000);
		//title
		WebElement title=amz.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]"));
		System.out.println(" "+title.getText());
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Actual price
		WebElement ActualPrice=amz.findElement(By.xpath("(//span[@class='a-price a-text-price'])[1]"));
		System.out.println("The Actual price is "+ActualPrice.getText());
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//final discounted price
		WebElement FinalPrice=amz.findElement(By.xpath("(//span[@class='a-price'])[1]"));
		System.out.println("The Final price is "+FinalPrice.getText());
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get page title and close window
		System.out.println(amz.getTitle());
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		amz.quit();

	}

}
