package englishexercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Creation a new scanner 
		Scanner sc = new Scanner(System.in);
		//Declaration of height 
		double height;
		//Declaration of weight 
		double weight;		
		//Declaration of IMC 
		double IMC;
		//Ask the user for their height
		System.out.println("How tall are you? Enter the height in meters:");
		//Enter height
		height = sc.nextDouble();
		//Ask the user for their weight
		System.out.println("How much do you weigh? Enter the weight in kilos:");
		//Enter weight
		weight = sc.nextDouble();
		//Calculation IMC
		IMC = weight / Math.pow(height, 2);
		//Display value of IMC
		System.out.println("Your value of IMC is " + IMC);
		
		sc.close();
	}

}
