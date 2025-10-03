package part1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration the weight of apples and pears
		double kgApples;
		double kgPears;
		double finalPrice;
		//Declaration the prices of apples and pears
		final double PRICES_APPLES = 2.35;
		final double PRICES_PEARS = 1.95;
		//Ask the user apples kg and pears kg
		System.out.println("Introduzca el kilo de manzanas vendidos:");
		kgApples = sc.nextFloat();		
		System.out.println("Introduzca el kilo de peras vendidos:");
		kgPears = sc.nextFloat();
		//Calculation final prices
		finalPrice = (kgApples * PRICES_APPLES) + (kgPears * PRICES_PEARS);
		
		System.out.println("El importe total de " + kgApples + " kg y " + kgPears +" kg es igual a " + finalPrice + " euros");
		
		sc.close();
		
		
	}

}
