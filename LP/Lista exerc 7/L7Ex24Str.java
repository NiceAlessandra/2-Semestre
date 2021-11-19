/*
lista 7 exercicio 24
 * 
 * 
 */

public class L7Ex24Str {
	
	public static void main (String[] args) {
		
		int tamanho  = (int)(Math.random()*40) + 1;//de 01 ate 40
		int contador = 0;
		int maior    = 0;
		
		String texto = "";
		
		for (int i = 1 ; i <= tamanho ; i++){
			
			texto = texto +(int)(Math.random()*2);
		}
		
		//texto = "11110000000000000000";
		System.out.println ("Texto = " + texto);
		
		for (int i = 0 ; i < texto.length() ; i++){
			
			if ( texto.charAt (i) == '1' ){
				contador++;
				
			} else {
				
				System.out.println ("Contador de 1's: " + contador);
				contador = 0;
			}
			
			if ( contador > maior ) {
				
				maior = contador;
			}
		}
		System.out.println (">>> Contador de 1's: " + contador);
	}
}

