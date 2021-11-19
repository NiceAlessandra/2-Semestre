/*
29) Escreva um programa em Java que imprima sequência 5:
1, 1 3 5 7 9
2, 2 4 6 8 10
3, 1 3 5 7 9
4, 2 4 6 8 10
5, 1 3 5 7 9
6, 2 4 6 8 10
7, 1 3 5 7 9
8, 2 4 6 8 10
9, 1 3 5 7 9
10, 2 4 6 8 10
 */

public class L6Exer29Seq {
	
	public static void main (String[] args) {
		
		for ( int i = 1 ; i <= 10 ; i++) {
			
			System.out.print (i + ", ");
			
			for ( int j = 2 - ( i % 2 ) ; j <= 10 ; j += 2) {					
			System.out.print (j + " ");
			}
			System.out.println ();
		}
	}
}


