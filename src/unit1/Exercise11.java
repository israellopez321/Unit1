package unit1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration a ptas
		int ptas;
		float euros;
		// Valor of Pesetas to euros
		final int valorPtas = 166;
		// Ask the user for ptas number
		System.out.println("Cuántas pesetas quieres convertir a euro?");
		ptas = sc.nextInt();
		euros = ptas / valorPtas;
		System.out.println("Por " + ptas + " pesetas te vamos a dar " + euros + " euros");
		sc.close();
	}

}
