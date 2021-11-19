/*
12) Escreva um programa que conta e exibe a quantidade de vezes que cada vogal ocorre em
uma frase fornecida pelo usuário.
 */

import java.util.Scanner;

public class L7Ex12Carac {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		int contVogais = 0;
			
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		for ( int i = 0 ; i < frase.length() ; i++){
			
			if ( frase.charAt(i) == 'A' || frase.charAt (i) == 'a'){
				contVogais++;			
			}
			if ( frase.charAt(i) == 'E' || frase.charAt (i) == 'e'){
				contVogais++;			
			}
			if ( frase.charAt(i) == 'I' || frase.charAt (i) == 'i'){
				contVogais++;			
			}
			if ( frase.charAt(i) == 'O' || frase.charAt (i) == 'o'){
				contVogais++;			
			}
			if ( frase.charAt(i) == 'U' || frase.charAt (i) == 'u'){
				contVogais++;			
			}		
		}
		System.out.println ("Quantidade de vogais: " + contVogais);		
		
	}
}

