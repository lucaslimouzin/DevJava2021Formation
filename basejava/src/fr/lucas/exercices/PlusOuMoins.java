package fr.lucas.exercices;

import java.util.Scanner;

public class PlusOuMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Devine le nombre");
		
		//Pour instancier un nombre random
		int min = 1;
		int max = 100;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		boolean  finDuJeu = false ;
		int nombreATrouver = random_int;
		int essai = 0;
		int temp =0;
		System.out.print("Entrer un nombre entre 1 et 1000 : ");
		Scanner clavier = new Scanner (System.in);
		
		int nombreJoueur = clavier.nextInt();
		
		while (!finDuJeu) {
			
			if (nombreJoueur == nombreATrouver) {
				finDuJeu = true;
				essai++;
				break;
			} else if (nombreJoueur > nombreATrouver){
				
				System.out.println("Votre nombre est trop grand !");
				System.out.print("Entrer un nombre entre 1 et "+ nombreJoueur+ " : ");
				Scanner clavierHaut = new Scanner (System.in);
				
				 nombreJoueur = clavierHaut.nextInt();
				 
				 essai++;
			}else {
				System.out.println("Votre nombre est trop petit !");
				
				System.out.print("Entrer un nombre entre "+ nombreJoueur+ " et " +temp + " :");
				Scanner clavierBas = new Scanner (System.in);
				
				 nombreJoueur = clavierBas.nextInt();
				 essai++;
			}
				
		}
		
		//fin du jeu affiche essai
		System.out.println("Trouver en " + essai + " essais ! Bien joué !");
		
		
	}

}
