package part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Declaration two numbers
		int numero1;
		int numero2;
		// Declaration number missing to be a multiple of 7
		int numASumar;
		// Declaration rest
		int resto;
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Ask the user for a number
		System.out.println("Introduzca dos números para calcular cuanto el falta para ser multiplo del segundo numero:");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		// Calculation rest
		resto = numero1 % numero2;
		// Calculation number missing to be a multiple of 7
		numASumar = (resto == 0) ? 0 : (numero2 - resto);
		// Print the final message
		System.out.println("Queda " + numASumar + " para que " + numero1 + " sea multiplo de " + numero2);

		sc.close();

	}

}
