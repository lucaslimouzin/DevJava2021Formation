package fr.lucas.exercices;
import java.util.Scanner;


public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Donn�es d'entr�e");
		
		System.out.print("Entrer un nombre : ");
		Scanner clavier = new Scanner (System.in);
		
		int nombre = clavier.nextInt();
				
		double racineCarree = Math.sqrt((double)nombre);
		
		System.out.println("la racine carr�e de " + nombre + " = " + racineCarree);

	}

}
