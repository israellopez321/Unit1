package unit1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration first number
		double number1;
		//Declaration second number
		double number2;
		//Declaration addition
		double add;
		//Declaration subtraction
		double sub;
		//Declaration multiplication
		double mul;
		//Declaration division
		double div;
		//Ask the user for the first number
		System.out.println("Introduzca el primer número:");
		number1 = sc.nextDouble();
		//Ask the user for the second number
		System.out.println("Introduzca el segundo número:");
		number2 = sc.nextDouble();
		//Calculation the addition
		add = number1 + number2;
		//Calculation subtraction
		sub = number1 - number2;
		//Calculation multiplication
		mul = number1 * number2;
		//Calculation division
		div = number1 / number2;
		//Print the final message
		System.out.println("La suma de los numeros " + number1 + " y " + number2 + " es igual a " + add );
		System.out.println("La resta de los numeros " + number1 + " y " + number2 + " es igual a " + sub );
		System.out.println("La multiplicación de los numeros " + number1 + " y " + number2 + " es igual a " + mul );
		System.out.println("La división de los numeros " + number1 + " y " + number2 + " es igual a " + div );
		
		sc.close();
	}
}
