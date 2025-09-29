package part1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of name
		String nombre;
		// Declaration andress
		String direc;
		// Declaration telephone number
		String telefono;
		// Ask the user for the name
		System.out.println("Introduzca el nombre:");
		nombre = sc.next();
		// Ask the user for the andress
		System.out.println("Introduzca la dirección:");
		direc = sc.next();
		// Ask the user for the telephone number
		System.out.println("Introduzca el número de teléfono:");
		telefono = sc.next();
		// Print the final message
		System.out.println("El nombre introducido es " + nombre);
		System.out.println("La dirección introducida es " + direc);
		System.out.println("El teléfono introducido es " + telefono);

		sc.close();
	}

}
