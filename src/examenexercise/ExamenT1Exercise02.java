package examenexercise;

import java.util.Scanner;

public class ExamenT1Exercise02 {
	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration hours worked
		int horasTrabajadas;
		//Declaration hourly wage
		double salarioHora;
		//Declaration if the salary is greater than 1000
		double descuento;
		//Declaration discount if you charge more than 1000
		final int masDeMil = 15;
		//Declaration discount if you charge less than 1000
		final int menosDeMil = 10;
		//Declaration weekly salary
		double salarioSemanal;
		//Ask the user for hours worked
		System.out.println("¿Cuántas horas has trabajado está semana?");
		horasTrabajadas = sc.nextInt();
		//Ask the user for hourly wage
		System.out.println("¿Cuánto te pagan por hora?");
		salarioHora = sc.nextDouble();
		//Ask the user if you charge more or less than 1000
	    
		//Calculation of weekly salary 
		salarioSemanal = (double) horasTrabajadas * salarioHora * (salario) ? masDeMil : menosDeMil; / 100
		//Print the weekly salary
	}
}
