/*
 14) Escreva um programa para ler uma frase e um caractere. Sempre que o caractere lido
aparecer na frase ele deve ser substituído por asterisco. Por exemplo, se os valores fornecidos
fossem para a frase: o dia esta nublado, e para o caractere: a, o programa deverá fornecer o
seguinte resultado: o di* est* nubl*do.

 */

import java.util.Scanner;

public class L7Ex14AsterV2 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "", letra = ""; //saida por conta da imutabilidade da string
		
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine ();
		
		System.out.print ("Entre com uma letra: ");
		letra = leiaStr.nextLine ();
		
		frase = frase.replace(letra.charAt(0), '*');//reconstruindo a string com o replace
		
		System.out.println("Saida: " + frase);
	}
}

