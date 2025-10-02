package part2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration problem identifier
		int id;
		// Declaration of volume of problem
		int volumen;
		// Ask the user for the problem identifier
		System.out.println("Introduzca el identificador del problema:");
		id = sc.nextInt();
		// Calculate the volume of problem identifier
		volumen = id / 100;
		// Print the final message
		System.out.println("El problema " + id + " está en el volumen " + volumen);

		sc.close();
	}

}
