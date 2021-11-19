/*
15) Escreva um programa que informe se em uma frase fornecida pelo usuário existem
caracteres numéricos.
 */

import java.util.Scanner;

public class L7Ex15Num {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		int	contNumeros = 0;
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		for ( int i = 0 ; i < frase.length() ; i++){
			
			if ( frase.charAt(i) >= '0' && frase.charAt (i) <= '9'){
				contNumeros++;			
			}
		}
		System.out.println ("Quantidade de caracteres numericos: " + contNumeros);	
		
		}
}

