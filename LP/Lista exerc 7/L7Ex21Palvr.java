/*
21) Escreva um programa que receba uma frase, imprima cada palavras desta frase em uma
linha.
 */
import java.util.Scanner;

public class L7Ex21Palvr {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = " ";
			
		System.out.println ("Entre com uma frase: ");
		frase = leiaStr.nextLine ();
		
		System.out.println ( " \n " + frase  );
		
	}
}


