package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer une valeur: ");
		int var1 = clavier.nextInt();
		
		System.out.println("Entrer une valeur: ");
		int var2 = clavier.nextInt();
		
		System.out.println(var1 + "*" + var2 + "=" + (var1*var2));
		
	}

}
