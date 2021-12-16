package fr.lucas.exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice16 {

	public static void main(String[] args) {

		System.out.print("Entrer un nombre: ");
		Scanner clavier = new Scanner (System.in);
		
		int nombre2 = clavier.nextInt();
		
		
		int i =0;
		int reste = 0;
		while (nombre2 %10 !=0) {
			reste += nombre2 % 10;
			nombre2 = nombre2/10;
		}
		
		System.out.println("la somem est égale à " + reste);
		
	}
}


