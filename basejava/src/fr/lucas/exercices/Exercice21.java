package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Saisir le nombre d'éléments: ");
		Scanner clavier = new Scanner (System.in);
		
		int taille = clavier.nextInt();
		int[] tab = new int[taille];
		
		for (int i =0; i <taille; i++) {
			System.out.print("Elément "+ (i+1)+" : ");
			Scanner clavier2 = new Scanner (System.in);
			int nombre = clavier.nextInt();
			tab[i] = nombre;
		}
		for (int i =0; i <taille; i++) {
			System.out.print(tab[i]+" ");			
		}
		
	}

}
