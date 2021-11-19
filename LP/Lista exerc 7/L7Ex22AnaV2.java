/*
22) Dados uma frase e uma palavra, escreva um programa que verifique o número de vezes
que a palavra ocorre na frase. Exemplo: Na frase ANA E MARIANA GOSTAM DE BANANA, a
palavra ANA ocorre 4 vezes.
* utilizando o split - não funcionou em todos os testes
 */

import java.util.Scanner;

public class L7Ex22AnaV2 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		String frase = "", palavra = "";
		int contador = 0 ;
		
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine ();
		
		System.out.print ("Entre com uma palavra: ");
		palavra = leiaStr.nextLine ();
		
		String[] saida = frase.split(palavra);		
			
		// "ana e mariana gostam de banana"
		// "ana"
		// [0] "" ficou " e mariana gostam de banana"
		// [1] " e mari" ficou " gostam de banana"
		// [2] " gostam de b" ficou "na"
		// [3] "na"
		// total de elementos :4
		
		for ( int i = 0 ; i<  saida.length ; i++){
			
			System.out.println (saida [i]);
			
		}
		System.out.println ("Ocorrencias: " + saida.length);
		
		
		
	}
}

