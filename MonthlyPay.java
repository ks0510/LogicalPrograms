/*
 * This program takes rate of interest,principal and number of years and report
 * monthly installment of loan
 */
package junittesting;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class Monthlypayemnt {

	/*
	 * This our main method in this method we call out another method in it
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(monthlyPayment(sc));

	}

	/*
	 * This monthlyPayement() method return the monthly installment of loan
	 */

	public static double monthlyPayment(Scanner sc) {

		System.out.println("Enter Principal amount");
		double p = sc.nextInt();

		System.out.println("Enter number of years");
		double y = sc.nextInt();

		System.out.println("Enter rate of intrest");
		double R = sc.nextInt();

		double n = 12 * y;
		double r = R / (12 * 100);

		double payment = (p * r) / (1 - (Math.pow(1 + r, -n)));

		return payment;
	}
}
