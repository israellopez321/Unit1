package part2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration a number 
		double numero;
		int numeroRedondeado;
		//Ask the user the number
		System.out.println("Escribe el número que quieras redondear:");
		numero = sc.nextDouble();
		//Calculation a 
		numeroRedondeado = (int) (numero + 0.5);
		System.out.println("El número redondeado es " + numeroRedondeado);
		
		sc.close();
	}

}
