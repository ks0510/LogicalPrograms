/*
 * This program take date, month and year and report week day on that date
 */
package junittesting;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class DayofWeek {
	/**
	 * This our main method
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DayofWeek day = new DayofWeek();

		/*
		 * Calling out dayofWeek function to get week day
		 */

		day.dayofWeek(sc);

	}

	/*
	 * This our second function to check day using Gregorian formula To take input
	 * from user day,month and year
	 */

	public static void dayofWeek(Scanner sc) {

		System.out.println("Enter Year");
		int year = sc.nextInt();

		System.out.println("Enter month");
		int month = sc.nextInt();

		System.out.println("Enter date");
		int day = sc.nextInt();

		/*
		 * To find week day number using formulae
		 */

		int y1 = year - (14 - month) / 12;

		int x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);

		int m1 = month + 12 * ((14 - month) / 12) - 2;

		int d1 = (day + x + (31 * m1 / 12)) % 7;

		/*
		 * To display week day number 0 for sunday ,1 for monday and so forth
		 */

		System.out.println(d1);
	}
}
