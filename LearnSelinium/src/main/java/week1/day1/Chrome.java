package week1.day1;

public class Chrome {
	
public static void main(String[] args) {
	float version = 91.0f;
	String develper = "Google";
	boolean beta = false;
	int releaseYear = 2008;
	char shortcutKey = 'c';
	System.out.println("The version of the browser is " +version);
	System.out.println("This browser is developed by "+develper);
	if (beta==false) {
		System.out.println("This is not a beta version");
	}
	else
		System.out.println("This is a beta version");
	System.out.println("The browser is released in the year " +releaseYear);
	System.out.println("The shorcut key to open the browser is "+shortcutKey);
}
}
