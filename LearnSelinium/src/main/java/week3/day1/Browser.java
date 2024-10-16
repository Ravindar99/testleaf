package week3.day1;

public class Browser {
public String Name(String BrowserName) {
	System.out.println("The browser name is "+BrowserName);
	return BrowserName;
}
public double Version(double browserVersion) {
	System.out.println("The version is "+browserVersion);
	return browserVersion;
}
public void loadUrl(){
	System.out.println("The url is loaded");
}
public void closeBrowser() {
	System.out.println("The borwser is closed");
}
public void navigateBack() {
	System.out.println("navigated back to the previous window");
}

}
