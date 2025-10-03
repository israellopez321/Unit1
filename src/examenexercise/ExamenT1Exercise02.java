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
		//Declaration gross salary
		double salarioBruto;
		//Declaration discount if you charge more than 1000
		final double MAS_DE_MIL = 0.15;
		//Declaration discount if you charge less than 1000
		final double MENOS_DE_MIL = 0.10;
		//Declaration net salary
		double salarioNeto;
		//Ask the user for hours worked
		System.out.println("¿Cuántas horas has trabajado está semana?");
		horasTrabajadas = sc.nextInt();
		//Ask the user for hourly wage
		System.out.println("¿Cuánto te pagan por hora?");
		salarioHora = sc.nextDouble();
		//Calculation gross salary
	    salarioBruto = horasTrabajadas * salarioHora;  
		//Calculation net salary 
		salarioNeto = salarioBruto - salarioBruto * ((salarioBruto > 1000) ? MAS_DE_MIL : MENOS_DE_MIL);
		//Print the weekly salary
		System.out.println("El salario semanal es de " + salarioNeto + " euros");
		
		sc.close();
	}
}
