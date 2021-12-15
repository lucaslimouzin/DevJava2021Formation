package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Données d'entrée");
		
		System.out.print("Entrer un nombre : ");
		Scanner clavier = new Scanner (System.in);
		
		int note1 = clavier.nextInt();
		int note2 = clavier.nextInt();
		int note3 = clavier.nextInt();
		int note4 = clavier.nextInt();
		int note5 = clavier.nextInt();
		
		int total = note1 + note2 + note3 + note4 + note5;
		
		int moyenne = total / 5;
		
		System.out.println("la moyenne est de " + moyenne);
	}

}
