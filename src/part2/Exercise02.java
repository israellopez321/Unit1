package part2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration a whole number
		int numero;
		// Declaration rest
		int resto;
		// Declaration aware
		int cociente;
		int faltaParaMultiplo7;
		// Ask the user a whole number
		System.out.println("Introduce un número entero para ver cuanto le queda para ser un multiplo de 7:");
		numero = sc.nextInt();
		// Calculate the rest
		resto = numero % 7;
		// Calculate the aware
		cociente = numero / 7;
		// Calculate how many numbers are left to be a multiple of 7
		faltaParaMultiplo7 = 7 * (cociente + 1) - (7 * cociente) - resto;
		// Print how many numbers are left to be a multiple of 7
		System.out.println("Hay que sumarle " + faltaParaMultiplo7 + " para que sea multiplo de 7");
		sc.close();
	}

}