package week3.day2;

import java.util.Iterator;

public class FindOccurance {
public static void main(String[] args) {
	String find = "testleaf";
	char []f=find.toCharArray();
	int c=0;
	for (int i = 0; i < find.length(); i++) {
		if(f[i]=='e') {
			c++;
		}
	}
	System.out.println("The occurance of e is "+c);
}
}