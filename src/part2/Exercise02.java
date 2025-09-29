package part2;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		//Declaration a number
		int numero;
		//Declaration number missing to be a multiple of 7
		int numASumar;
		//Declaration rest
		int resto;
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Ask the user for a number
		System.out.println("Introduzca un número para calcular cuanto le queda para ser multiplo de 7:");
		numero = sc.nextInt();
		//Calculation rest
		resto = numero % 7;
		//Calculation number missing to be a multiple of 7
		numASumar = (resto == 0) ? 0 : (7-resto);
		//Print the final message
		System.out.println("Queda " + numASumar + " para que sea multiplo de 7.");
		
		sc.close();
	}
}