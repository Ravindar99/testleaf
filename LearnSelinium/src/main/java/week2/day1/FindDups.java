package week2.day1;

import java.util.Arrays;

public class FindDups {
public static void main(String[] args) {
	int[] num={2, 5, 7, 7, 5, 9, 2, 3};
	System.out.println("The duplicate values are");
	Arrays.sort(num);
	System.out.println(num.length);
	for (int i = 0; i < num.length-1; i++) {
			if (num[i]==num[i+1]) {
				System.out.println(num[i]);
				/* i++; */
			}
		
		
	}
}
}
