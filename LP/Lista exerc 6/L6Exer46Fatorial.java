/*

 */

import java.util.Scanner;

public class L6Exer46Fatorial {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		int contador = 0;
		
		System.out.print ("Entre com um numero: ");
		numero = leia.nextInt ();
		
		for (int i = 1; i <=numero ; i++){
		
			if ( numero % i == 0 ) {
				
				contador++;
			}
		}
		
		System.out.println ("Quantidade de divisores: " + contador );
		
		if (contador == 2) {
			
			System.out.println ("Eh primo: " );
		} else {
		
			System.out.println ("Nao eh primo: " );
		
		} 
	}
}



