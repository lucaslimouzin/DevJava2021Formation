package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Entrer un nombre: ");
		Scanner clavier = new Scanner (System.in);
		
		int nombre = clavier.nextInt();
		 System.out.print("Les nombres impars de 1 à " + nombre + " sont : ");
		for (int i =1; i <= nombre; i++) {
			if (i%2 !=0)
				System.out.print(i + " ");
		}
			
	}

}
