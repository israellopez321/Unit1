package englishexercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		//Declaration of students
		int students;
		//Declaration of team size
		int size;
		//Declaration of team
		int team;
		//Declaration of leftover
		int leftover;
		//Ask the user for students of class
		System.out.println("Enter the number of students in the class:");
		//Enter students
		students = sc.nextInt();
		//Ask the user for team size
		System.out.println("Enter the size of team:");
		//Enter team size
		size = sc.nextInt();
		//Calculation teams and leftover students
		team = students / size;
		leftover = students % size;
		//Display teams and leftover students
		System.out.println(team + " groups of students of " + size + " students are formed and " + leftover + " students are left over.");
		
		sc.close();
	}
}
