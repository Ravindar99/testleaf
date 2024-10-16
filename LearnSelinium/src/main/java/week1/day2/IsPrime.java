package week1.day2;

import java.util.Iterator;

public class IsPrime {
	public static void main(String[] args) {
		for(int i=2;i<=102;i++) {
			int prime=0;
			for (int j = 2; j <i; j++) {
		
				if (i%j==0) {
					prime=1;
					System.out.println("The number "+i+" is not prime");
					break;
					}
			}
				if (prime==0) {
					System.out.println("The number "+i+" is prime");
					
				}
			
		}

	}
} 
