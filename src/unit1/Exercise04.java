package unit1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration variables
		double note1;
		double note2;
		//Ask the user for the notes
		System.out.println("Vamos a calcular su Media Aritmética");
		System.out.println("Introduzca la primera nota: ");
		note1 = sc.nextDouble();
		System.out.println("Introduzca la segunda nota: ");
		note2 = sc.nextDouble();
		//Print the final message
		System.out.println("Su Media aritmetica es de " + ((note1 + note2)/2));
		sc.close();
	}
}
