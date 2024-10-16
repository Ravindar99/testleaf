package week3.day1;

public class OverLoading {
public static void reportStep(String msg,String status) {
	System.out.println("The messgae is "+msg);
	System.out.println("The status is "+status);
}
public static void reportStep(String msg,String status,boolean snap) {
	System.out.println("reply is "+msg);
	System.out.println("stauts is "+status);
	if (snap==true) {
		System.out.println("Take screenshot");
		
	}
	else {
		System.out.println("unable to take screenshot");
	}

}
public static void main(String[] args) {
	OverLoading r=new OverLoading();
	r.reportStep("Hi", "Avilable");
	r.reportStep("Hello", "Unavilable",false);
	
}
}
