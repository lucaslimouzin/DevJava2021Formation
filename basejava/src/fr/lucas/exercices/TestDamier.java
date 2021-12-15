package fr.lucas.exercices;

public class TestDamier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] damier = new int[3][3];
		
		for (int i = 0; i < damier.length; i++) {
			for (int j = 0; j < damier.length; j++) {
				damier [i][j] = 0;
				System.out.print(damier [i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
