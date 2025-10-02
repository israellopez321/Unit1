package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of length
		double length;
		// Declaration of height
		double height;
		// Declaration of perimeter and area
		double perimeter;
		double area;
		// Ask the user for the perimeter
		System.out.println("Enter the length of the rectangle:");
		// Enter length
		length = sc.nextDouble();
		// Ask the user for the area
		System.out.println("Enter the height of the rectangle:");
		// Enter height
		height = sc.nextDouble();
		// Calculation the perimeter of rectangle
		perimeter = 2 * (length + height);
		// Calculation the area of rectangle
		area = length * height;
		// Display the perimeter and area
		System.out.println("The area of rectangle is " + perimeter + " and the perimeter of rectangle is " + area);

		sc.close();
	}

}
