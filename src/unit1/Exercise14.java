package unit1;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		int firstNote;
		int secondNote;
		int thirdNote;
		int notaMediaBoletin;
		double notaMediaExpediente;
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Ask the user his notes
		System.out.println("Introduzca la primera nota:");
		firstNote = sc.nextInt();
		System.out.println("Introduzca la segunda nota:");
		secondNote = sc.nextInt();
		System.out.println("Introduzca la tercera nota:");
		thirdNote = sc.nextInt();
		// Calculation bulletin and expedient
		notaMediaBoletin = (firstNote + secondNote + thirdNote) / 3;
		notaMediaExpediente = (double) ((firstNote + secondNote + thirdNote)) / 3.0;
		// Print the final message
		System.out.println("Nota media del curso en el boletin de calificaciones: " + notaMediaBoletin);
		System.out.println("Nota media del curso en el expediente académico: " + notaMediaExpediente);

		sc.close();
	}
}
