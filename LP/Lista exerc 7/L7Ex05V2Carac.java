/*
 3) Declarar uma variável do tipo String com seu valor inicial igual a branco e a
seguir atribuir as letras minúsculas do alfabeto (abcde...z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.
 */

import java.util.Scanner;

public class L7Ex05V2Carac {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String texto = "";
		int contador =0;
		
		System.out.print ("Entre com um texto: ");
		texto = leiaStr.nextLine ();
		//contar caracteres maiusculos e minusculos
		//                     0123
		//           01234567891111 vai de 0 a 13
		// texto <- "Qualquer coisA"
		//Qual o tamanho do texto?
	
		System.out.println ("Qual o tamanho do texto? " );
		System.out.println ("O tamanho eh: " + texto.length () );
		
		System.out.println ("O primeiro caracter do texto eh: " +
		                    texto.charAt(0) );
	
		System.out.println ("O ultimo caracter do texto eh: " +
		                    texto.charAt(texto.length () -1) );
	
		System.out.println ("Imprimindo uma letra em cada linha");
		for (int i = 0 ; i < texto.length() ; i ++) {
			System.out.println (texto.charAt (i));
			
			if ( texto.toLowerCase().charAt (i) == 'a' ){ //exerc 6 variavel no lugar do a
								
				contador++;
			}
		}
		
		System.out.println ("O texto tem quantos 'a'? " + contador);
		System.out.println ("Texto: " + texto);
	
	}
	
}

