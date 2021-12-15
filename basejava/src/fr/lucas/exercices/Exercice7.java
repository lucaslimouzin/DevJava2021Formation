package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Données d'entrée");
		
		System.out.print("Entrer un nombre : ");
		Scanner clavier = new Scanner (System.in);
		
		int angle1 = clavier.nextInt();
		int angle2 = clavier.nextInt();
		
		int angle3 = 180 - (angle1+angle2);
		
		System.out.println("3ème angle = " + angle3);

	}

}
