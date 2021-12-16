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
	
	//Methode qui retourne un double et prend en paramètre deux doubles (decimal)
	
	public static double sommeDouble(double val1, double val2) {
		double result = 0;
		result = val1+ val2;
		return result;
	}
	//Methode qui retourne la somme des éléments d'un tableeau de double. La somme retournée est un double.
	public static double sommeTab(double [] tab, int taille) {
		double result =0;
		for (int i =0; i < taille ; i++) {
			result += tab[i];
		}
		return result;

	}
	//Méthode qui renvoie la moyenne des éléments d'un tableau (double)
	public static double moyenneTab(double [] tab, int taille) {
		double result =0;
		for (int i =0; i < taille ; i++) {
			result += tab[i];
		}
		result = result/taille;
		return result;

	}
	//Methode qui renvoie l'élément le plus petit d'un tableau (int)
	
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
