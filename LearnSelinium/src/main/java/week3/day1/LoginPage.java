package week3.day1;

public class LoginPage extends BasePage {
	public void performCommonTasks(){
		System.out.println("peform tasks");
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
		//new super obj to super class
		BasePage ll = new BasePage();
		ll.performCommonTasks();
		// new super obj to sub class
		BasePage lk = new LoginPage();
		lk.performCommonTasks();
		//old super object to sub class
		BasePage bp = new LoginPage();
		bp.performCommonTasks();
		//old or new sub cobj to super class not possible
	}

}
