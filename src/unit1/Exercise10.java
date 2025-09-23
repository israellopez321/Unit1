package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration a number
		int number;
		int rest;
		// Ask the user for a number
		System.out.println("Introduzca un número para verificar si es par o impar:");
		number = sc.nextInt();
		// Calculation the rest of number
		rest = number % 2;
		// Using "if" to check if the number is even
		if (rest == 0) {
			System.out.println(number + " es un número par.");
		} else {
			System.out.println(number + " es un número impar.");
		}
		sc.close();
	}

}