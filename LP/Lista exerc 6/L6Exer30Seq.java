/*
30) Escreva um programa em Java que imprima sequência 6:
1, 1
2, 2 4
3, 1 3 5
4, 2 4 6 8
5, 1 3 5 7 9
6, 2 4 6 8 10 12
7, 1 3 5 7 9 11 13
8, 2 4 6 8 10 12 14 16
9, 1 3 5 7 9 11 13 15 17
10, 2 4 6 8 10 12 14 16 18 20
 */
public class L6Exer30Seq {
	
		public static void main (String[] args) {
		
		int numero = 0;
		
		for ( int i = 1 ; i <= 10 ; i++) {
			System.out.print (i + ", ");
			numero = 0;
			for ( int j = 1 ; j <= i ; j++){ 
				if ( i % 2 == 0){ 
					numero += 2 ;
				} else {
					numero += 1;
					if ( i % 2 == 1 && numero > 1){
						numero += 1;
					}
				}
				System.out.print (numero + " ");
			}
			System.out.println ();
		}
	}
}


