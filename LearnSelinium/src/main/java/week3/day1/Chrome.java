package week3.day1;

public class Chrome extends Browser{
public void openIncognito() {
	System.out.println("The incognito window is opened");
}
public void clearCache() {
	System.out.println("The cache is cleared");
}
public static void main(String[] args) {
	Chrome c=new Chrome();
	c.loadUrl();
	String BrowserName=c.Name("chorme");
	double browserVersion=c.Version(2.0);
	c.openIncognito();
	c.clearCache();
	c.navigateBack();
	c.closeBrowser();
	
}
}
