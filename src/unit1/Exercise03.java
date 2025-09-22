package unit1;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float year;
		float birthYear;
		
		System.out.println("Introduzca el año actual:");
		year = reader.nextFloat();
		System.out.println("Introduzca su año de nacimiento:");
		birthYear = reader.nextFloat();
		System.out.println("Usted tiene " + (year-birthYear ) + " años";
		
		reader.close()
	}
}
