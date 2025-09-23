
package unit1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration of name 
		String name;
		//Declaration of age
		Double age;
		//Ask the user the name
		System.out.println("Introduzca su nombre:");
		name = sc.next();
		//Ask the user the age
		System.out.println("Introduzca su edad:");
		age = sc.nextDouble();
		//Print the final message
		System.out.println("Hola " + name + " , tienes " + age + " años, ¡qué mayor eres!");
			
		
		sc.close();
			
			
		}
		
		
	}


