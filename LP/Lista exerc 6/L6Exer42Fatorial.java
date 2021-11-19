/*
42) Construa um programa para mostrar o fatorial dos números inteiros na 
faixa de 1 a 10.
 */

public class L6Exer42Fatorial {
	
	public static void main (String[] args) {
		
		int fatorial = 1; 
	
		
		for ( int sequencia = 1 ; sequencia <= 10 ; sequencia ++){		
			
			fatorial = 1;
			
			for ( int i = 1 ; i <= sequencia ; i++){
			
				fatorial *= i; // fatorial = fatorial * i
				
			}
			System.out.println (sequencia  + " !: " + fatorial );
		}
		
	}
}


