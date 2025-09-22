package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner reader = new Scanner(System.in);
		//Declare a variable
		long age;
		//Ask the user for his age
		System.out.println("Introduzca su edad:");
		age = reader.nextLong();
		//Calculate the age next year
		age++;
		//Print the final message
		System.out.println("Tu tendrás " + age + " años el siguiente año");
				
		reader.close();
	}

}
