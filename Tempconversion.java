/*
 * This program convert temperature from fahrenheit to celcius and 
 * from celcius to fahrenheit
 */
package junittesting;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class TempratureConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		temperatureConversion(sc);
	}

	/*
	 * This is temperatureconversion method to convert temperature
	 */

	public static void temperatureConversion(Scanner sc) {

		System.out.println("Choose conversion 1 for C to F and 2 for F to C");

		int value = sc.nextInt();

		System.out.println("Enter temperature");
		int temperature = sc.nextInt();

		if (value == 1) {

			/*
			 * To convert temprature into fahrenheit
			 */

			double fahrenheit = (double) (temperature * 9 / 5) + 32;
			System.out.println("Temperature converted from celcius to fahrenheit " + fahrenheit);
		}

		if (value == 2) {

			/*
			 * To convert fahrenheit to celcius
			 */
			double celcius = (double) (temperature - 32) * 5 / 9;
			System.out.println("Temperature converted from fahrenheit to celcius " + celcius);

		}
	}
}
