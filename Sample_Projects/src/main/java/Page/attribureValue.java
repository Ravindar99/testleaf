package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class attribureValue {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://www.itmagination.com/blog/bdd-testing-in-java-with-cucumber");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement element = driver.findElement(By.xpath("//input[@id='w-node-_62f48df1-b57e-7aa7-5238-029b9b744339-9b744313']"));
	element.getAttribute("value");
	System.out.println(element.getAttribute("value"));
	// gets a certain value of a web element 
	WebElement element1 = driver.findElement(By.xpath("//div[@class='navbar w-nav']"));
	String color = element1.getCssValue("background-color");
	System.out.println(color);
	//if the "background-color" property is set as "green" in the HTML source, 
	//the returned value could be "rgba(0, 255, 0, 1)" if implicit opacity value is preserved 
	//or "rgb(0,255, 0)" if it is omitted. 
}
}
