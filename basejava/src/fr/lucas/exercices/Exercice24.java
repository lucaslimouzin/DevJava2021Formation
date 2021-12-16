package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Saisir le nombre d'éléments: ");
		Scanner clavier = new Scanner (System.in);
		
		int taille = clavier.nextInt();
		int[] tab = new int[taille];
		int repet =0;
		int temp =0;
		
		//créer le tableau
		for (int i =0; i <taille; i++) {
			System.out.print("Elément "+ (i+1)+" : ");
			Scanner clavier2 = new Scanner (System.in);
			int nombre = clavier.nextInt();
			tab[i] = nombre;
				
			}
		
		// parcours le tableau	
		for (int k =0; k <taille; k++) {
				temp = tab[k] ;
				repet = 0;
			for (int j = 0; j < taille; j++) {
				if (tab[j] == temp ) 
					repet++;					
			}
			System.out.println(temp+ " se produit " + repet + " fois");
		}	
	}
}

