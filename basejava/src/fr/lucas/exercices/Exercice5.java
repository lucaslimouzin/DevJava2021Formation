package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Donn�es d'entr�e");
		
		System.out.print("Entrer la longueur : ");
		Scanner clavier = new Scanner (System.in);
		
		int longueur = clavier.nextInt();
		System.out.print("Entrer la largeur : ");
		Scanner clavierd = new Scanner (System.in);
		int largeur = clavierd.nextInt();
		
		int perimetre = 2*(longueur+largeur);
		
		System.out.println("le p�rim�tre est de " + perimetre);
	}

}
