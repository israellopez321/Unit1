package part2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration current year
		int year;
		int century;
		//Ask the user the year 
		System.out.println("Introduzca el año:");
		year = sc.nextInt();
		//Calculate the century according to a year
		century = (year - 1) / 100 + 1;
		
		System.out.println("En el año " + year + " estamos en el siglo " + century);
		
		sc.close();
	}
}
