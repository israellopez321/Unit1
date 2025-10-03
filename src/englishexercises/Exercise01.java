package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration price
		double price;
		//Declaration tax
		final int TAX;
		//Declaration new price
		double finalPrice;
		//Display program title
		System.out.println("TAX CALCULATOR");
		//Display prompt for price 
		System.out.println("Enter the price to calculate the final price:");
		//Enter price
		price = sc.nextDouble();
		//Display prompt for tax
		System.out.println("Enter the applicable tax:");
		//Enter tax
		TAX = sc.nextInt();
		//Set price to price 
		finalPrice = price * (1 + (double)TAX / 100);
		//Display new price
		System.out.println("The final price is " + finalPrice + " euros");
		
		sc.close();
	}
}