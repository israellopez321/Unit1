package unit1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double note1;
		double note2;
		System.out.println("Vamos a calcular su Media Aritmética");
		System.out.println("Introduzca la primera nota: ");
		note1 = reader.nextDouble();
		System.out.println("Introduzca la segunda nota: ");
		note2 = reader.nextDouble();
		System.out.println("Su Media aritmetica es de " + ((note1 + note2)/2));
		reader.close();
	}

}
