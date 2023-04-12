/*
 * This program gives the fibonacci series
 */
package logicalprogram;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class FibonacciSeries {

	/**
	 * This our main method
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter count for fibonacci series");
		int count = sc.nextInt();

		int num1 = 0, num2 = 1, num3, i;
		/*
		 * printing 0 and 1
		 */

		System.out.print(num1 + " " + num2);

		/*
		 * loop starts from 2 because 0 and 1 are already printed
		 */

		for (i = 2; i < count; ++i) {
			num3 = num1 + num2;
			System.out.print(" " + num3);

			/*
			 * To forward numbers for next term
			 */

			num1 = num2;
			num2 = num3;
		}
	}
}
