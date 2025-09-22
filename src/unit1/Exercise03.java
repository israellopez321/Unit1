package unit1;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		//Creation a new scanner
		Scanner reader = new Scanner(System.in);
		//Declaration variable
		float year;
		float birthYear;
		//Ask the user the current year and year of birth
		System.out.println("Introduzca el año actual:");
		year = reader.nextFloat();
		System.out.println("Introduzca su año de nacimiento:");
		birthYear = reader.nextFloat();
		//Print the final message
		System.out.println("Usted tiene " + (year-birthYear ) + " años");
		
		reader.close();
	}
}
