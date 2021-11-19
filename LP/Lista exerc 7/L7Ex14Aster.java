/*
 14) Escreva um programa para ler uma frase e um caractere. Sempre que o caractere lido
aparecer na frase ele deve ser substituído por asterisco. Por exemplo, se os valores fornecidos
fossem para a frase: o dia esta nublado, e para o caractere: a, o programa deverá fornecer o
seguinte resultado: o di* est* nubl*do.
 */

import java.util.Scanner;

public class L7Ex14Aster {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "", letra = "", saida = ""; //saida por conta da imutabilidade da string
		
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine ();
		
		System.out.print ("Entre com uma letra: ");
		letra = leiaStr.nextLine ();
		
		for ( int i =0; i < frase.length() ; i++){
			
			if ( frase.toLowerCase().charAt (i) ==
			     letra.toLowerCase().charAt (0) ){
				
				 saida = saida + "*"; //saida + string *
			} else {
				saida += frase.charAt (i);
			}
		}
		frase = saida;
		System.out.println("Saida: " + saida);
	}
}

