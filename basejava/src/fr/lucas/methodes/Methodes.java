package fr.lucas.methodes;

public class Methodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public static int somme(int val1, int val2) {
		int result = 0;
		result = val1+ val2;
		return result;
	}
	
	//Methode qui retourne un double et prend en param�tre deux doubles (decimal)
	
	public static double somme(double val1, double val2) {
		double result = 0;
		result = val1+ val2;
		return result;
	}
	//Methode qui retourne la somme des �l�ments d'un tableeau de double. La somme retourn�e est un double.
	public static double sommeTab(double [] tab, int taille) {
		double result =0;
		for (int i =0; i < taille ; i++) {
			result += tab[i];
		}
		return result;

	}
	
	// version 2 avec un foreach
	public static double somme(double [] tab) {
		double result =0;
		for (double item : tab) {
			result += item;
		}
		return result;

	}
	//M�thode qui renvoie la moyenne des �l�ments d'un tableau (double)
	public static double moyenneTab(double [] tab) {
		
		return somme(tab)/tab.length;

	}
	//Methode qui renvoie l'�l�ment le plus petit d'un tableau (int)
	
	public static double minTab(double [] tab, int taille) {
		double result =0;
		double min = tab[0];
		for (int k =0; k <taille; k++) {
			 if (tab[k] <= min) 
					min = tab[k];			 			
		}
		result = min;
		return result;

	}
	
}
