package week7.day1;

import org.testng.annotations.Test;

public class LearnDependency {
@Test
public void runCreateaccount() {
	System.out.println("create");
	throw new RuntimeException();
}
@Test(dependsOnMethods = {"runDeleteaccount","week5.day1.EditLead.RunEditLead"})
public void runEditaccount() {
	System.out.println("edit");
}
@Test(dependsOnMethods ={"runCreateaccount"},alwaysRun = true)
public void runDeleteaccount() {
	System.out.println("delete");
}
}
