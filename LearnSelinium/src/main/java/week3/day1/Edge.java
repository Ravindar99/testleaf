package week3.day1;

public class Edge extends Browser {
public static void takeSnap() {
	System.out.println("The snap is taken");
}
public static void clearCookies() {
	System.out.println("The cookies are cleared");
}
public static void main(String[] args) {
	Edge e=new Edge();
	e.loadUrl();
	String BrowserName=e.Name("Edge");
	double browserVersion=e.Version(1.5); 
	e.takeSnap();
	e.clearCookies();
	e.closeBrowser();
}
}
