package part1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner reader = new Scanner(System.in);
		// Declaration number
		int numero;
		// Ask the user for a number
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();
		// Print the final message
		System.out.println("Has escrito el número " + numero);

		reader.close();
	}

}
