package part1;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		// Creation a new scanner
		Scanner reader = new Scanner(System.in);
		// Declaration year
		float year;
		// Declaration birth year
		float birthYear;
		// Ask the user the current year and year of birth
		System.out.println("Introduzca el año actual:");
		year = reader.nextFloat();
		System.out.println("Introduzca su año de nacimiento:");
		birthYear = reader.nextFloat();
		// Print the final message and show your age
		System.out.println("Usted tiene " + (year - birthYear) + " años");

		reader.close();
	}
}
