package part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration first lengths
		double mlLongitud;
		double cmLongitud;
		double mLongitud;
		// Declaration variable for result
		double total;
		// Declaration variable for conversion
		double ml_cm;
		double m_cm;
		// Ask the user for about measurements
		System.out.println("Introduzca la medida en milímetros:");
		mlLongitud = sc.nextDouble();
		System.out.println("Introduzca la medida en centímetros:");
		cmLongitud = sc.nextDouble();
		System.out.println("Introduzca la medida en metros:");
		mLongitud = sc.nextDouble();
		// Convert millimeters to centimeters
		ml_cm = (double) mlLongitud / 10;
		m_cm = (double) mLongitud * 10;
		// Calculation the total
		total = cmLongitud + ml_cm + m_cm;
		// Print the total
		System.out.println("La suma de las tres longitudes da un total de " + total + " cm.");

		sc.close();
	}
}
