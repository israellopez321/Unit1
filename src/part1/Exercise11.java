package part1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration a ptas
		int ptas;
		float euros;
		// Valor of Pesetas to euros
		final int VALOR_PTAS = 166;
		// Ask the user for ptas number
		System.out.println("Cuántas pesetas quieres convertir a euro?");
		ptas = sc.nextInt();
		euros = ptas / VALOR_PTAS;
		System.out.println("Por " + ptas + " pesetas te vamos a dar " + euros + " euros");
		sc.close();
	}

}
