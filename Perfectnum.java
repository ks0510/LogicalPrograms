/*
 * This program check whether given number is perfect or not
 */
package logicalprogram;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int sum = 0, i = 1;

		/*
		 * Loop to get prime factors and their sum
		 */
		while (i <= number / 2) {
			if (number % i == 0) {
				sum += i;
			}
			i++;
		}

		if (sum == number) {
			System.out.println(number + " is a perfect number.");
		} else {
			System.out.println(number + " is not a perfect number.");
		}
      }
}
