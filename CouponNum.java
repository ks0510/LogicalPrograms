/*
 * This program take a coupon number and check with random number and report the count
 */
package logicalprogram;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class CouponNumber {

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter coupon number");

		int coupon = sc.nextInt();
		int count = 0, random = 0;

		while (coupon != random) {
			random = (int) Math.floor(Math.random() * 100 + 1);
			count++;
		}
		System.out.println(count + "numbers needed");
	}
}
