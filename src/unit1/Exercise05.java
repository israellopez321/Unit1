package unit1;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration variables
		double radio;
		double length;
		double area;
		//Ask the user for the radio
		System.out.println("Introduzca el radio de la circunferencia en cm:");
		radio = sc.nextDouble();
		//Calculation the length and area
		length = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio,2);
		//Print the final message
		System.out.println("La longitud de la circunferencia es " + length + " cm.");
		System.out.println("El radio de la circunferencia es " + area + " cm.");
		
		sc.close();
	}
}
