package Design;

import org.openqa.selenium.WebElement;

public interface Browser {
	
	void StartApp(String browser, String url);
	// launch the browser with the given url
	
	void SwitchFrame(int index);
	void SwitchFrame(WebElement ele);
	void SwitchFrame(String value);
	
	void LocateElement(String value);
	
	void SwitchWindow(int index);
	/* void SwitchWindow(String value); */
	
}
