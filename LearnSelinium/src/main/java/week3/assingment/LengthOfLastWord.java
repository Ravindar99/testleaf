package week3.assingment;

public class LengthOfLastWord {
	public static int length(String last) {
		//using trim function to remove spaces in the border of string not in between
		String l = last.trim();
		int count =0;
		for (int i =l.length()-1; i>=0; i--) {
			//length is exact i.e it starts from 1 2 3......, array index starts from 0 1 2 3 ....... since this is an reverse loop 
			//i should be greater than 0 
			if (l.charAt(i)==' ')
				//if there is a space in the char the if loop is terminated
			{
				break;
			}
			else {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		LengthOfLastWord input = new LengthOfLastWord();
		int output = input.length("Hello World");
		System.out.println("The length of the last word is "+output);
	}

}