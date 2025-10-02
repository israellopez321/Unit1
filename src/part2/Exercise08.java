package part2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration variable of length
		double mLongitud;
		double cmLongitud;
		// Declaration of result
		int resultado;
		// Ask the user how many throw length
		System.out.println("Introduzca la longitud de lanzamiento realizada en metros:");
		mLongitud = sc.nextDouble();
		// Conversion meters to centimeters
		cmLongitud = mLongitud * 100;
		// Take the whole part
		resultado = (int) cmLongitud;
		// Print the final result
		System.out.println("La longitud de lanzamiento es de " + resultado + " cm.");

		sc.close();
	}

}
