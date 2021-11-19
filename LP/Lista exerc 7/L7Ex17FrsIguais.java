/*
17) Escreva um programa que leia duas frases e a seguir informe se as frases fornecidas são
iguais. Observação: realizar esta verificação caractere por caractere.
 */

import java.util.Scanner;

public class L7Ex17FrsIguais {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		String frase1 = "", frase2 = "";
		
			
		System.out.print ("Entre com uma frase: ");
		frase1 = leiaStr.nextLine ();
		
		System.out.print ("Entre com a segunda frase: ");
		frase2 = leiaStr.nextLine ();
		
		if ( frase1.equals(frase2) ){
			
			System.out.println ("As frases sao iguais!!");
		} else {
		
		System.out.println ("As frases nao sao iguais!!");
		}		
	}
}

