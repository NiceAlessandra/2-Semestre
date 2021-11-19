/*
9) Fazer um programa para contar quantos espaços em branco existem em uma frase
fornecida pelo usuário.
 */

import java.util.Scanner;

public class L7Ex09Espac {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String texto = "";
		int contador =0;
		
		System.out.print ("Entre com um texto: ");
		texto = leiaStr.nextLine ();
			
		for (int i = 0 ; i < texto.length() ; i ++) {
				
			if ( texto.charAt (i) == ' '){
				contador++;
			}
		}
		System.out.println ("O texto tem quantos '  '? " + contador);
	
	
	}
	
}
