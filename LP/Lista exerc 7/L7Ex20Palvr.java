/*
20) Escreva um programa que receba uma frase, conte e imprima o número de palavras desta
frase.
 */
import java.util.Scanner;

public class L7Ex20Palvr {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = " ";
		String palavra = " ";
		int contador = 1 ;
		
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine ();
		
		for ( int i = 0 ; i < frase.length() ; i++){
			
			if (frase.charAt( i ) ==  ' ' ) { 
			      contador ++;
			      palavra = palavra + 1;
			} 
		}
		System.out.println("O numero de palavras eh: " + contador);
	}
}


