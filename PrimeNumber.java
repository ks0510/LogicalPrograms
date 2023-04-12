/*
 * This program check the number is prime or not
 */

package logicalprogram;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class PrimeNumber {
	
	/**
	 * This is our main method to check number prime or not
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int count = 0;

		/*
		 * To check prime number by modulus
		 */

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is a not  prime number");
		}
	}
}
