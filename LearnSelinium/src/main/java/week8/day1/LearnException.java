package week8.day1;

import org.apache.xmlbeans.impl.xpath.XPath;

public class LearnException {
	
	public static void main(String[] args) {
		int data = 5;
		try {
			throw new RuntimeException();
			/* System.out.println(data); */
			/* throw new RuntimeException(); */
		}
		catch(Exception e){
			System.out.println("arithmetic exception occured");
		}
		finally {
			System.out.println(data);
		}
	}
}
