package examenexercise;

import java.util.Scanner;

public class ExamenT1Exercise01 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration first notes of course
		int firstNote;
		// Declaration second notes of course
		int secondNote;
		// Declaration third notes of course
		int thirdNote;
		// Declaration average grade
		double averageNote;
		// Ask the user for the three notes
		System.out.println("Introduzca las tres notas del curos para calcular la media:");
		firstNote = sc.nextInt();
		secondNote = sc.nextInt();
		thirdNote = sc.nextInt();
		// Calculation average note
		averageNote = (double) (firstNote + secondNote + thirdNote) / 3;
		// Print average note
		System.out.println("La nota media es " + averageNote);
		sc.close();

	}

}
