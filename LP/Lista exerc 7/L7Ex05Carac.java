/*
5) Escreva um programa que calcule e escreva a quantidade de vezes que o
caractere ‘a’ aparece em uma frase fornecida pelo usuário. Nota Importante: para a
contagem, o caractere pode ser maiúsculo ou minúsculo.
 */

import java.util.Scanner;

public class L7Ex05Carac {
	
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
			
			if ( texto.charAt (i) == 'a' || texto.charAt (i) == 'A'){
				contador++;
			}
		}
		System.out.println ("O texto tem quantos 'a'? " + contador);
	
	
	}
	
}

