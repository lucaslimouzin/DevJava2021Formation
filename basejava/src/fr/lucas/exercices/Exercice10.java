package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Données d'entrée");
		
		System.out.print("Entrer un nombre : ");
		Scanner clavier = new Scanner (System.in);
		
		int nombre1 = clavier.nextInt();
		System.out.print("Entrer un nombre : ");
		int nombre2 = clavier.nextInt();
		System.out.print("Entrer un nombre : ");
		int nombre3 = clavier.nextInt();
		
		if( nombre1 >= nombre2 && nombre1 >= nombre3)
	          System.out.println("Le plus grand nombre est: "+nombre1);
	      else if (nombre2 >= nombre1 && nombre2 >= nombre3)
	          System.out.println("Le plus grand nombre est: "+nombre2);
	      else
	          System.out.println("Le plus grand nombre est: "+nombre3);
		
		
	}

}
