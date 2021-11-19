/*
11) Escreva um programa que conte e exiba, separadamente, a quantidade de caracteres
alfabéticos e de dígitos numéricos existentes em uma frase fornecida pelo usuário.
 */

import java.util.Scanner;

public class L7Ex11Carac {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		int contMaiusculas = 0,
			contMinusculas = 0,
			contNumeros = 0;
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		for ( int i = 0 ; i < frase.length() ; i++){
			
			if ( frase.charAt(i) >= 'A' && frase.charAt (i) <= 'Z'){
				contMaiusculas++;			
			}
			if ( frase.charAt(i) >= 'a' && frase.charAt (i) <= 'z'){
				contMinusculas++;			
			}
			if ( frase.charAt(i) >= '0' && frase.charAt (i) <= '9'){
				contNumeros++;			
			}
		}
		System.out.println ("Quantidade de caracteres maiusculos: " + contMaiusculas);	
		System.out.println ("Quantidade de caracteres minusculos: " + contMinusculas);	
		System.out.println ("Quantidade de caracteres numericos: " + contNumeros);	
		
		}
}

