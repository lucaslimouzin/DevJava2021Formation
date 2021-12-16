package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.print("Saisir le nombre d'éléments: ");
				Scanner clavier = new Scanner (System.in);
				
				int taille = clavier.nextInt();
				int[] tab = new int[taille];
				int somme =0;
				
				for (int i =0; i <taille; i++) {
					System.out.print("Elément "+ (i+1)+" : ");
					Scanner clavier2 = new Scanner (System.in);
					int nombre = clavier.nextInt();
					tab[i] = nombre;
					somme += tab[i];
				}
				
				System.out.print("la somme = " + somme);			

	}

}
