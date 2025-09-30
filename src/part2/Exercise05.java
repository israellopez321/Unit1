package part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration seconds
		int segundos;
		//Declaration minute and rest 
		int min;
		double restMinutos;
		//Declaration hours and rest
		double horas;
		double restHoras;
		//Declaration second return
		double devSegundos;
		//Ask the user the seconds and scan the input
		System.out.println("Introduzca la cantidad de segundos:");
		segundos = sc.nextInt();
		//Calculation of hours
		horas = (double) segundos / 3600;
		restHoras = horas - (int) horas ;
		horas = (int) horas;
		//Calculation of minutes
		restMinutos = (double) restHoras * 60;
		min = (int) restMinutos;
		//Calculation seconds
		devSegundos = (int)((double)(restMinutos - min) * 60);
		//Print the final result
		System.out.println(segundos + " segundos es igual a " + horas + "horas, " + min + " minutos y " + devSegundos + " segundos");
		
		sc.close();
		
	}

}
