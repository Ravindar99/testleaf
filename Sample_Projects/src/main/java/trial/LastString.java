package trial;

public class LastString {
	
	public String word(String input) {
		String in = input.trim();
		String output ="";
		for (int i = 0; i < in.length(); i++) {
			if (in.charAt(i)==' ') {
				output = "";
			}
			else {
				output = output + in.charAt(i);
			}
		}
		String ot = output.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(ot);
		return ot;
	}
	
	public static void main(String[] args) {
		LastString ls = new LastString();
		String input = ls.word("The replaceAll() method replaces all.");
	}
}
