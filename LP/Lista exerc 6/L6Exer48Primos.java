/*
48) Solicite ao usuário a quantidade de termos da sequência de números primos e 
imprima o resultado.
 */

import java.util.Scanner;

public class L6Exer48Primos {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int contador = 0;
		int termos = 0;
		
		System.out.print ("Digite a quantidade de termos: ");
		termos = leia.nextInt ();
		
		for ( int sequencia = 1 ; sequencia <= termos ; sequencia++ ) {
			contador = 0;
		
			System.out.println ( ">Sequencia: " + sequencia + ", Contador: " + contador );
		
			for ( int i = 1 ; i <= sequencia ; i++ ) {
				
				if ( sequencia % i == 0 ) {
					
					contador++;
					
				}
			}
			
			if ( contador == 2 ) {
				System.out.println ( ">>>" + sequencia + " " );
			}
		}
	}
}


