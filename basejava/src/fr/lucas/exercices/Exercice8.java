package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Données d'entrée");
		
		System.out.print("Entrer un nombre : ");
		Scanner clavier = new Scanner (System.in);
		
		int cote1 = clavier.nextInt();
		
		double surface = ((Math.sqrt(3))/4)* cote1 * cote1;
		
		System.out.println("la surface du triangle = " + surface);
	}

}
