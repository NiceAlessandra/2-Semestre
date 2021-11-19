/*
22) Dados uma frase e uma palavra, escreva um programa que verifique o número de vezes
que a palavra ocorre na frase. Exemplo: Na frase ANA E MARIANA GOSTAM DE BANANA, a
palavra ANA ocorre 4 vezes.
 */

import java.util.Scanner;

public class L7Ex22Ana {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		String frase = "", palavra = "";
		int contador = 0 ;
		
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine ();
		
		System.out.print ("Entre com uma palavra: ");
		palavra = leiaStr.nextLine ();
		
		for ( int i = 0 ; i< frase.length() ; i++){
			//log
			System.out.print (frase.substring( i ));
			if (frase.substring( i ).startsWith(palavra)){
			//log
			
			System.out.print ("<-- comeca com \"" + palavra + "\" ");
			
			contador++;
			}
			
			//Log
			System.out.println ();
	}
		System.out.println ("Ocorrencias: " + contador);
		
		
		
	}
}

