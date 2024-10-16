package week1.day2;

public class Browser {
public String launchBrowser(String browserName) {
		System.out.println("The Browser name is " +browserName );
		return browserName;
	}
public void loadUrl() {
	System.out.println("Application Url is loaded successfully");
}
public static void main(String[] args) {
	Browser chrome = new Browser();
	String browserName = chrome.launchBrowser("chrome");
	System.out.println("Browser is launched successfully");
	chrome.loadUrl();
	
	
}
}
