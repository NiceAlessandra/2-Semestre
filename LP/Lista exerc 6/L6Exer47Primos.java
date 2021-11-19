/*
47)Imprima somente os números primos existentes na faixa de um 1 até 100.
 */

import java.util.Scanner;

public class L6Exer47Primos {
	
	public static void main (String[] args) {
		
		int contador = 0;
		
		for ( int sequencia = 1 ; sequencia <= 100 ; sequencia++ ) {
		
			contador = 0;
		
			// Log
			//System.out.println ( ">Sequencia: " + sequencia + ", Contador: " + contador );
		
			for ( int i = 1 ; i <= sequencia ; i++ ) {
				
				if ( sequencia % i == 0 ) {
					
					contador++;
					
					// Log
					//System.out.println ( ">>Contador: " + contador );
				}
			}
			
			if ( contador == 2 ) {
				System.out.println ( ">>>" + sequencia + " " );
			}
		}
	}
}


