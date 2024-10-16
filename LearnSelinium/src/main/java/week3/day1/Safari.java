package week3.day1;

public class Safari extends Browser{
public static void readerMode() {
	System.out.println("The reader mode is on");
}
public static void fullScreenMode() {
	System.out.println("The screen is maximized");
}
public static void main(String[] args) {
	Safari s=new Safari();
	s.loadUrl();
	String BrowserName=s.Name("Safari");
	double browserVersion=s.Version(5.6);
	s.readerMode();
	s.fullScreenMode();
	s.closeBrowser();
}
}
