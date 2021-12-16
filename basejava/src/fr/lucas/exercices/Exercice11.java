package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		System.out.println("Données d'entrée");
		
		System.out.print("Entrer le premier nombre : ");
		Scanner clavier = new Scanner (System.in);
		
		int nombre1 = clavier.nextInt();
		System.out.print("Entrer l'opérateur arithmétiques : ");
		Scanner clavierOperateur = new Scanner (System.in);
		String operateur = clavierOperateur.nextLine();
		System.out.print("Entrer le deuxième nombre: ");
		int nombre2 = clavier.nextInt();
		
		switch (operateur) {
			case "x": 
				result = nombre1*nombre2;
				System.out.println(nombre1 + " "+ operateur +" "+ nombre2 +" = " + result);
				break;
			case "*": 
				result = nombre1*nombre2;
				System.out.println(nombre1 + " "+ operateur +" "+ nombre2 +" = " + result);
				break;
			case "+": 
				result = nombre1+nombre2;
				System.out.println(nombre1 + " "+ operateur +" "+ nombre2 +" = " + result);
				break;
			case "/": 
				result = nombre1/nombre2;
				System.out.println(nombre1 + " "+ operateur +" "+ nombre2 +" = " + result);
				break;
			default: 
				
				System.out.println("impossible de faire le calcul !");
				break;
		}
				
	}
}


