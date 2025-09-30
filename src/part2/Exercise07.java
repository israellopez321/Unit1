package part2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration number of tickets
		int entradas;
		//Declaration prices  
		final double precioInfantil = 15.50;
		final double precioAdulto = 20;
		//Declaration variable if total cost is greater than 100 euro
		final double mayorDe100 = 0.05;
		
		//Ask the user how many tickets want 
		System.out.println("Cuantos tickets quieres comprar?");
		entradas = sc.nextInt();
		
		
		sc.close();
	}

}
