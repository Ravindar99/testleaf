package week2.day1;

public class Palindorme {
	public String ispalindrome(String input) {
		/* char[] in = input.toCharArray(); */
		System.out.println(input);
		String output ="";
		for (int i = input.length()-1; i>=0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println(output);
		if (input.equals(output)) {
			System.out.println("The given string "+input+" is a palindorme");
			
		}
		else {
			System.out.println("The given string "+input+" is not a palindorme");
			
		}
		return output;
		}
	public static void main(String[] args) {
		Palindorme pali=new Palindorme();
		String input=pali.ispalindrome("121");
		
	}
}
