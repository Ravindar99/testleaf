package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailTable {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//clear form
	driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
	//enter mas using +Keys.Enter
	driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS"+Keys.ENTER);
	//clear to
	driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
	//enter mdu using keys.enter
	driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU"+Keys.ENTER);
	//unselect option
	driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	//xpath to select table list size
	int rowCount = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//tr")).size();
	System.out.println(rowCount);
	//xpath to select train names and iterating it
	//we use set as we are not supposed to store duplicate values
	Set <String> trainss=new LinkedHashSet<String>(rowCount);
	for (int i = 2; i <=rowCount; i++) {
		String text = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]//tr["+i+"]//td[2]/a")).getText();
		trainss.add(text);
	}
	if ((rowCount-1)==trainss.size()) {
		System.out.println("There is a duplicate train");
	}
	driver.close();
}
}
