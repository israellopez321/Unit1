package unit1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration age
		int age;
		// Ask the user his age
		System.out.println("Introduzca su edad:");
		// Use of "if" to check if you are of legal age
		age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		sc.close();
	}

}
