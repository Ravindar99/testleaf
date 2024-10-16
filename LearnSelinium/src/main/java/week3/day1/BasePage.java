package week3.day1;

public class BasePage {
public void findElement() {
	System.out.println("element found");
}
public void clickElement() {
	System.out.println("click on the element");
}
public void enterText() {
	System.out.println("enter the text");
}
public void performCommonTasks() {
	System.out.println("perform Common Tasks");
}
public static void main(String[] args) {
	BasePage bp = new BasePage();
	bp.findElement();
	bp.clickElement();
	bp.enterText();
	bp.performCommonTasks();
		
}
}
