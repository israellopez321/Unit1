package unit1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner reader = new Scanner (System.in);
		//Declare a variable 
		int numero;
		//Aske the user for a number
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();
		//print the final message
		System.out.println("Has escrito el número " + numero);
		
		reader.close();
	}

}
