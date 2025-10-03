package part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration three numbers (A,B and C)
		int numeroA;
		int numeroB;
		int numeroC;
		// Declaration two numbers (X and Y)
		double numeroX;
		double numeroY;
		// Ask the user by the values A
		System.out.println("Introduzca los valores A para calcular una ecuación de 2º grado:");
		// Enter values of A
		numeroA = sc.nextInt();
		// Ask the user by the values B
		System.out.println("Introduzca los valores B para calcular una ecuación de 2º grado:");
		// Enter values of B
		numeroB = sc.nextInt();
		// Ask the user by the values ​​C
		System.out.println("Introduzca los valores C para calcular una ecuación de 2º grado:");
		// Enter values of C
		numeroC = sc.nextInt();
		// Ask the user by the values ​​X
		System.out.println("Introduzca los valores X para calcular una ecuación de 2º grado:");
		// Enter values of X
		numeroX = sc.nextInt();
		// Calculate the quadratic
		numeroY = numeroA * Math.pow(numeroX, 2) + numeroB * numeroX + numeroC;
		// Print result of quadratic
		System.out.println("El valor de Y es igual a " + numeroY);

		sc.close();
	}
}
