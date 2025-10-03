package part2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration number of tickets
		int entradasInfantil;
		int entradasAdulto;
		// Declaration prices
		final double PRECIO_INFANTIL = 15.50;
		final double PRECIO_ADULTO = 20;
		// Declaration variable if total cost is greater than 100 euro
		final double MAYOR_DE_100 = 0.05;
		// Declaration variable for save cost of tickets
		double costeEntradas;
		double costeFinal;
		double costeDescuento;
		// Ask the user how many tickets want
		System.out.println("Cuantos entradas infantiles quieres comprar?");
		entradasInfantil = sc.nextInt();
		System.out.println("Cuantos entradas adultos quieres comprar?");
		entradasAdulto = sc.nextInt();
		// Calculation the cost of tickets
		costeEntradas = PRECIO_INFANTIL * entradasInfantil + PRECIO_ADULTO * entradasAdulto;
		// Calculation cost of discount
		costeDescuento = costeEntradas * MAYOR_DE_100;
		// Apply the discount
		costeFinal = (costeEntradas > 100) ? costeEntradas - costeDescuento : costeEntradas;
		// Print final cost
		System.out.println("El coste final de las entradas es " + costeFinal + " euros.");

		sc.close();
	}
}
