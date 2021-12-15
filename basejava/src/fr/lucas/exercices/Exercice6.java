package fr.lucas.exercices;
import java.util.Scanner;


public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Données d'entrée");
		
		System.out.print("Entrer un nombre : ");
		Scanner clavier = new Scanner (System.in);
		
		int nombre = clavier.nextInt();
				
		double racineCarree = Math.sqrt((double)nombre);
		
		System.out.println("la racine carrée de " + nombre + " = " + racineCarree);

	}

}
