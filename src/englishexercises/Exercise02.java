package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of age
		int age;
		// Declaration of year
		final int YEAR = 2025;
		// Declaration of birth year
		int birthYear;
		// Ask the user for their age
		System.out.println("How old are you?");
		// Enter age
		age = sc.nextInt();
		// Calculation of birth year
		birthYear = YEAR - age;
		// Display birth year
		System.out.println("At " + age + " years old you were born in the year " + birthYear);

		sc.close();
	}
}
