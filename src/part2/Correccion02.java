package part2;

import java.util.Scanner;

public class Correccion02 {
	public static void main(String[] args) {
		int numero;
		int numASumar;
		int resto;
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		numero = sc.nextInt();
		
		resto = numerp % 7;
		
		numASumar = (resto == 0) ? 0 : (7-resto);
		
		System.out.println("La cantidad a sumar es: " + numASumar);
	}
}
