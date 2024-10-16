package week4.assingment;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TatacliqTestcase {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver d = new ChromeDriver(option);
	d.get("https://www.tatacliq.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//mouse over on brands
	WebElement brands = d.findElement(By.xpath("(//div[text()='Brands'])[1]"));
	Actions action =new Actions(d);
	action.moveToElement(brands).perform();
	//mouse over on watch and accessories
	WebElement wa = d.findElement(By.xpath("//div[text()='Watches & Accessories']"));
	action.moveToElement(wa).perform();
	//click on the first brand
	WebElement t = d.findElement(By.xpath("(//div[@class='DesktopHeader__featureBrands']/div)[2]"));
	action.moveToElement(t).click().perform();
	//click on new arrivals
	d.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']/option[text()='New Arrivals']")).click();
	//click on men in category
	d.findElement(By.xpath("(//div[@class='ReactCollapse--collapse']//div[@class='FilterDesktop__newFilCheckbox'])[1]")).click();
	List<String> prices = new ArrayList<String>();
	//printing discounted prices
	Thread.sleep(5000);
	int discount = d.findElements(By.xpath("//div[@class='ProductDescription__discount ProductDescription__priceHolder']/h3")).size();
	for (int i = 1; i <=discount; i++) {
		String dprice = d.findElement(By.xpath("(//div[@class='ProductDescription__discount ProductDescription__priceHolder']/h3)["+i+"]")).getText();
		System.out.println("The discounted price is "+dprice);
		prices.add(dprice);
	}
	System.out.println();
	//printing normal prices
	Thread.sleep(5000);
	int normal = d.findElements(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3)")).size();
	for (int j = 1; j <=discount; j++) {
		String nprice = d.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3)["+j+"]")).getText();
		System.out.println("The normal price is "+nprice);
		prices.add(nprice);
	}
	System.out.println();
	//click on the first product
	WebElement element = d.findElement(By.xpath("(//div[@class='ProductDescription__content'])[1]"));
	//since the link is not clickable we java click
	d.executeScript("arguments[0].click();", element);
	//window handles to switch tab, initial return type string
	Set<String> windowHandles = d.getWindowHandles();
	//set converted to list to access get method
	List<String> newwin=new ArrayList <String>(windowHandles);
	//switch to new window
	d.switchTo().window(newwin.get(1));
	//to check if both prices are similar
	/* created a list containing all prices but failed to 
	 * 
	 */
	//add to bag
	d.findElement(By.xpath("//div[@class='ProductDescriptionPage__buttonAddToBag ']/div[@class='Button__base']/span[text()='ADD TO BAG']")).click();
	Thread.sleep(5000);
	//click on the cart, using action method for summa
	WebElement element2 = d.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']"));
	action.moveToElement(element2).click().perform();
	//cart information
	System.out.println("Watch: "+d.findElement(By.xpath("//div[@class='CartItemForDesktop__informationText']")).getText());
	String text = d.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']")).getText();
	System.out.println("The total amount is "+d.findElement(By.xpath("(//div[@class='DesktopCheckout__info DesktopCheckout__label'])[2]")).getText());
	d.switchTo().window(newwin.get(0)).close();
	d.close();
}
}
