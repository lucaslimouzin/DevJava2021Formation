package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.print("Entrer la lettre à vérifier : ");
		Scanner clavierLettre = new Scanner (System.in);
		String lettre = clavierLettre.nextLine();
		char cLettre = lettre.charAt(0); // place dans une variable char le string (comme y a qu'une valeur = 0 dans le tableau)
		if (cLettre == 'a') 
			System.out.println(" a est une voyelle");
			
		else if (cLettre == 'e') 
			System.out.println(" e est une voyelle");
		else if (cLettre == 'i') 
			System.out.println(" i est une voyelle");
		else if (cLettre == 'o') 
			System.out.println(" 0 est une voyelle");
		else if (cLettre == 'u') 
			System.out.println(" u est une voyelle");
		else 
			System.out.println(lettre +" est une consonne");
	}

}
