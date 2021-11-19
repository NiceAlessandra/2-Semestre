/*
24) Escreva um programa em Java que imprima a tabuada do 
* 1 ao 10, para os números de 0 a 10
 */

public class L6Exer24Tabuada {
	
	public static void main (String[] args) {
		
		for (int contador = 1 ; contador <= 10 ; contador++ ) {
		
			for (int numero = 0 ; numero <= 10 ; numero++ ) {
			System.out.println (contador + " x " + numero + " = " + (contador * numero));
			
			} System.out.println ();		
		}	
		  
	}
}


