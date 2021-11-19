/*
56)Imprima os números perfeitos na faixa de 1 a 900.
 */
public class L6Exer56Perfeito {
	
	public static void main (String[] args) {
			
		int numero = 0 , soma = 0;
		
		for ( numero = 1 ; numero <= 900 ; numero++ ) {		
			
			soma = 0;
			
			for ( int i = 1 ; i < numero ; i++) {
				if ( numero % i == 0 ){
					
					soma = soma + i;
				}
			}
				if ( numero == soma ) {
					
				System.out.println ("Perfeitos na faixa de 1 a 900: " + numero);
			}
		}	
	}
}

