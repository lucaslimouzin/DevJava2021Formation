package fr.lucas.exercices;

import java.util.Scanner;

public class AnneeBissextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Programme qui v�rifie si une ann�e est bissextile");
		
		System.out.print("Entrer une ann�e : ");
		Scanner clavier = new Scanner (System.in);
		
		int annee = clavier.nextInt();
		
		int resteDe4;
		int resteDe100;
		int resteDe400;
		
		resteDe4 = annee % 4 ;
		resteDe100 = annee %100;
		resteDe400 = annee %400;
		
		// v�rifie si l'ann�e est divisible
		if ((resteDe4 == 0 && resteDe100 != 0) || resteDe400 ==0) {
			System.out.println( annee + " est une ann�e bissextile");
			
		}else {
			System.out.println( " Ann�e simple");
		}
	}

}
