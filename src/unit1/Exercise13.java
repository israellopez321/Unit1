package unit1;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
	//Creation a new scanner
	Scanner sc = new Scanner(System.in);
	//Declaration of the questions
	boolean estaLloviendo;
	boolean terminoTareas;
	boolean irBiblioteca;
	boolean salir;
	//Ask the user for the questions
	System.out.println("¿Esta lloviendo?");
	estaLloviendo = sc.nextBoolean();
	
	System.out.println("¿Has echo la tarea?");
	terminoTareas = sc.nextBoolean();
	
	System.out.println("¿Tienes que ir a la biblioteca?");
	irBiblioteca = sc.nextBoolean();
	
	salir = (!estaLloviendo && terminoTareas) || irBiblioteca;
	//Print the final message
	System.out.println("¿Puede salir a la calle? " + salir);
	sc.close();
}
}
