package part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of two whole numbers
		int numero1;
		int numero2;
		//
		int resto;
		int cociente;
		int faltaParaMultiplo;
		// Ask the user first whole number
		System.out.println("Introduce el primer número entero para ver cuanto le queda para ser multiplo del siguiente introducido:");
		numero1 = sc.nextInt();
		// Ask the user second whole number
	    System.out.println("Introduce el segundo número entero:");
		numero2 = sc.nextInt();
		// Calculate the rest
		resto = numero1 % numero2;
		// Calculate the aware
		cociente = numero1 / numero2;
		// 
		faltaParaMultiplo = numero2 * (cociente + 1) - (numero2 * cociente) - resto;
		// 
		System.out.println("Hay que sumarle " + faltaParaMultiplo + " a " + numero1 + " para que sea multiplo de " + numero2);
		
		
		System.out.println(cociente);
		System.out.println(resto);
		
		sc.close();

	}

}
