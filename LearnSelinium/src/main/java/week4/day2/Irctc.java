package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Irctc {
public static void main(String[] args) {
	//closing options
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//click on flights
	driver.findElement(By.xpath("//li[@id='flight']//span")).click();
	//window handling, intial return type set string,window handles to get data address
	Set<String> windowHandles = driver.getWindowHandles();
	//set converted to list to access get method
	List<String> flights = new ArrayList<String>(windowHandles);
	//switch to method to swtich windows
	driver.switchTo().window(flights.get(1));
	System.out.println(driver.getTitle());
	driver.switchTo().window(flights.get(0));
	driver.close();
	}
}
