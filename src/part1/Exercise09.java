package part1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration age
		int age;
		boolean esMayorDeEdad;
		// Ask the user his age
		System.out.println("Introduzca su edad:");
		// Use of "if" to check if you are of legal age
		age = sc.nextInt();
		esMayorDeEdad = age >= 18;
				System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
		sc.close();
	}

}