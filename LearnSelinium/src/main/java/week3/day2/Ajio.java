package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {
public static void main(String[] args) throws InterruptedException {
	//disable notification
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver aj = new ChromeDriver(option);
	//get url
	aj.get("https://www.ajio.com/");
	aj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//maximize window
	aj.manage().window().maximize();
	aj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//search box
	aj.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Bags");
	aj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//press enter
	aj.findElement(By.xpath("//span[@class='ic-search']")).click();
	aj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//men section
	aj.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	//works when i give throws method not when i give implicitly wait
	//why implicitly wait is not working 
	Thread.sleep(2000);
	//fashion bags
	aj.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	Thread.sleep(2000);
	//search results and get the integer
	WebElement element = aj.findElement(By.xpath("//div[@class='length']"));
	String sres = element.getText();
	String sresult=sres.replaceAll("[^0-9]","");
	System.out.println("The total number of bags found is "+sresult);
	//get brand list and bag name
	List<WebElement>search=aj.findElements(By.xpath("//div[@class='brand']"));
	List<WebElement> elements = aj.findElements(By.xpath("//div[@class='nameCls']"));
	for (int i = 0; i <search.size(); i++) {
		String text = search.get(i).getText();
		System.out.println("Brand : "+text);
	//able to get brand and detail of first 45 results only
		for (int j = i; j <=i; j++) {
			String text2 = elements.get(j).getText();
			System.out.println("Detail : "+text2);
			}

	}

}
}
