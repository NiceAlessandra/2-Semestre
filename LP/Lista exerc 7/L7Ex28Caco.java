/*
28) Escreva um programa que leia uma String e dobre ela ao meio concatenado seus
caracteres.
Ex:
Entrada: Macaco Caco quer banana (tamanho ímpar)
Saída: Maancaancaob rCeaucqo
Entrada: Batatinha quando nasce (tamanho par)
Saída: Beactsaatniondhnaa uq 
 */


public class L7Ex28Caco {
	
public static void main (String[] args) {
		
		//String frase = "Macaco Caco quer banana";
		
		String frase = "Batatinha quando nasce";
		
		//String frase = "0123456789"; 
		// "0123456789"
		// "01234" e "56789"
		// "01234" e "98765"
		// "0918273645"

		//String frase = "123456789"; 
		// "123456789"
		// "12345" e "6789"
		// "12345" e "9876"
		// "19283745"

		
		int inicio = 0,
		    termino = frase.length() - 1;
		    
		String saida = "";
		
		System.out.println("Frase: " + frase);
		
		while ( inicio <= termino ) {
			
			saida += frase.charAt(inicio);
			inicio++;
			
			if ( inicio <= termino ) {
				
				saida += frase.charAt(termino);
				termino--;
			}
			
		}
		
		System.out.println("Saida: " + saida);
		
		
		
		
	}
}
