package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice17 {

	public static void main(String[] args) {
		int temp;
		int s;
		int i = 0;
		Scanner sc=  new Scanner(System.in);
		
		System.out.print("Entrer une valeur : ");
		int n = sc.nextInt();
		temp = n;
		
		while (n > 0) {
			s = n%10;
			n = n/10;
			i = i*10 + s;
		}
		
		if (temp == i)
			System.out.println("C'est un palindrome");
		else 
			System.out.println("Ce n'est pas un palindrome");
	}

}
