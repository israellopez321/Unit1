package unit1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration constant IVA
		final int IVA = 21;
		//Declaration prices
		double price;
		double finalPrice;
		//Ask the user for the price
		System.out.println("Introduzca el precio del producto para aplicarle el IVA:");
		price = sc.nextDouble();
		//Calculation finalPrice with IVA
		finalPrice = price + price * IVA / 100;
		//Print the user price with IVA
		System.out.println("El precio total con IVA del producto es " + finalPrice);
	}

}
