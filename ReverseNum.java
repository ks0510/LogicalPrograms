/*
 * This program is created to reverse number
 */

package logicalprogram;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class ReverseNumber {

	/**
	 * This our main method
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number");

		int num = sc.nextInt();

		/*
		 * For loop to reverse number
		 */

		int reverse = 0;
		for (; num != 0; num = num / 10) {
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder;
		}
		System.out.println("Reverse number is " + reverse);
	}
}
