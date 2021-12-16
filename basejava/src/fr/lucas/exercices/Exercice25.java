package fr.lucas.exercices;

import java.util.Scanner;

public class Exercice25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.print("Saisir le nombre d'éléments: ");
				Scanner clavier = new Scanner (System.in);
				
				int taille = clavier.nextInt();
				int[] tab = new int[taille];
				
				// créer le tableau
				for (int i =0; i <taille; i++) {
					System.out.print("Elément "+ (i+1)+" : ");
					Scanner clavier2 = new Scanner (System.in);
					int nombre = clavier.nextInt();
					tab[i] = nombre;
						
				}
				
				int newLength = tab.length;
			    // trouve la taille du nouveau tableau
			    for (int i = 1; i < tab.length; i++) {
			        for (int j = 0; j < i; j++) {
			            if (tab[i] == tab[j]) {   // si y a un duplicate réduit la taille de 1
			                newLength--;
			                break;
			            }
			        }
			    }
				
			    int[] newArray = new int[newLength]; // créé un nouveau tableau
			    newArray[0] = tab[0];  // premier élément du tableau
			    int inx = 1;            // index le deuxième element du tableau
			    boolean isDuplicate;
			    
			    for (int i = 1; i < tab.length; i++) {
			        isDuplicate = false;
			        for (int j = 0; j < i; j++) {
			            if (tab[i] == tab[j]) {  // si y a duplicate change le boolean en vrai et break
			                isDuplicate = true;
			                break;
			            }
			        }
			        if (!isDuplicate) {     // si ce n'est pas dupliqué, placé dans un nouveau tableau
			            newArray[inx] = tab[i];
			            inx++;
			        }
			    }
			    for (int k=0; k<newArray.length; k++)  
			           System.out.print(newArray[k]+" "); 
			    
	}
}
