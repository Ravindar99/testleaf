package design;

import org.openqa.selenium.WebElement;

public interface Browser {

	public void load(String url);
	//open browser and load url
	
	public void close();
	//close browser
	
	public void quit();
	//close only the window
	
	public WebElement locateElement(Locators type,String value);
	//locators type,locate the webElement 
	
	public void switchtowindow(int index);
	//switch to tab of index
	
	public boolean switchtowindow(String title);
	//switch window using title
	
}
