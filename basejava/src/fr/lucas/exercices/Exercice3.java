package fr.lucas.exercices;

public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 9 ;
		int temp ;
		
		// après le switch 
		temp = b ;
		b = a ;
		a = temp;
		
		System.out.println(a + ""+ b);
	}

}
