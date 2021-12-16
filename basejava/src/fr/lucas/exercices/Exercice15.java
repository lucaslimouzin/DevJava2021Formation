package fr.lucas.exercices;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Entrer un nombre: ");
		Scanner clavierNombre = new Scanner (System.in);
		String nombre = clavierNombre.nextLine();
		char minChar = nombre.charAt(0);
		char maxChar = nombre.charAt(nombre.length()-1);// place dans une variable char le string (comme y a qu'une valeur = 0 dans le tableau)
		
		int min = Character.getNumericValue(minChar);
		int max = Character.getNumericValue(maxChar);
		System.out.println("Premier chiffre = " + min);
		System.out.println("Dernier chiffre = " + max);
		
		System.out.println(" ----------------------");
		// version avec boucle 
		System.out.print("Entrer un nombre: ");
		Scanner clavier = new Scanner (System.in);
		
		int nombre2 = clavier.nextInt();
		
		ArrayList<Integer> tab = new ArrayList<Integer>();
		int i =0;
		int reste = 0;
		while (nombre2 %10 !=0) {
			reste = nombre2 % 10;
			nombre2 = nombre2 / 10;
			tab.add(i, reste);
			i++;
		}
		int size = tab.size()-1; // la taille du tableau
		System.out.println("Premier chiffre = " + tab.get(size));
		System.out.println("Dernier chiffre = " + tab.get(0));
	}

}
