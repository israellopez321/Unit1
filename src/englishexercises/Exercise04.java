package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration of pounds
		double pounds;
		//Declaration of kilos
		double kilos;
		//Ask the user for pounds
		System.out.println("Enter the pounds to convert them to kilos: ");
		//Enter pounds
		pounds = sc.nextDouble();
		//Calculation of kilos
		kilos = pounds / 2.2;
		//Display value in kilos
		System.out.println("There are " + kilos + "kilos");
		
		sc.close();
	}

}
