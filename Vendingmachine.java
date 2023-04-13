/*
* This is  a Program to calculate the minimum number 
* of Notes as well as the Notes to be returned by the Vending Machine as a
* Change
*/

package junittesting;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class Vendingmachine {

	/**
	 * To count the number of notes given by vending machine
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount in vending machine");

		int amount = sc.nextInt();
		int count = 0;

		/*
		 * To count number of notes of 1000 Rs
		 */

		if (amount >= 1000) {
			System.out.println("1000 Rs note given by vending machine in change");
		}

		while (amount >= 1000) {
			amount -= 1000;
			count++;
		}

		/*
		 * To count number of notes of 500 Rs
		 */
		if (amount >= 500) {
			System.out.println("500 Rs note given by vending machine in change");
		}
		while (amount >= 500) {
			amount -= 500;
			count++;
		}

		/*
		 * To count number of notes of 100 Rs
		 */
		if (amount >= 100) {
			System.out.println("100 Rs note given by vending machine in change");
		}
		while (amount >= 100) {
			amount -= 100;
			count++;
		}

		/*
		 * To count number of notes of 50 Rs
		 */
		if (amount >= 50) {
			System.out.println("50 Rs note given by vending machine in change");
		}

		while (amount >= 50) {
			amount -= 50;
			count++;
		}

		/*
		 * To count number of notes of 10 Rs
		 */
		if (amount >= 10) {
			System.out.println("10 Rs note given by vending machine in change");
		}

		while (amount >= 10) {
			amount -= 10;
			count++;
		}

		/*
		 * To count number of notes of 5 Rs
		 */
		if (amount >= 5) {
			System.out.println("5 Rs note given by vending machine in change");
		}

		while (amount >= 5) {
			amount -= 5;
			count++;
		}

		/*
		 * To count number of notes of 2 Rs
		 */
		if (amount >= 2) {
			System.out.println("2 Rs note given by vending machine in change");
		}

		while (amount >= 2) {
			amount -= 2;
			count++;

		}

		/*
		 * To count number of notes of 1 Rs
		 */
		if (amount >= 1) {
			System.out.println("1 Rs note given by vending machine in change");
		}

		while (amount >= 1) {
			amount -= 1;
			count++;
		}
		System.out.println("Number of notes given by vendor machine " + count);
    }
}
