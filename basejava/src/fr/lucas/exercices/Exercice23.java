package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Saisir le nombre d'éléments: ");
		Scanner clavier = new Scanner (System.in);
		
		int taille = clavier.nextInt();
		int[] tab = new int[taille];
		int max =0;
		int min = 0;
		
		for (int i =0; i <taille; i++) {
			System.out.print("Elément "+ (i+1)+" : ");
			Scanner clavier2 = new Scanner (System.in);
			int nombre = clavier.nextInt();
			tab[i] = nombre;
			if (nombre >max) {
				max = nombre;
				
			}
			min = tab[0];
			for (int k =0; k <taille; k++) {
				 if (tab[k] <= min) 
						min = tab[k];			 			
			}
		}
		
		System.out.println("Maximun = " + max);
		System.out.print("Minimum = " + min);	

	}

}
