/*
16) Escreva um programa que informe se todos os caracteres alfabéticos de uma frase
fornecida pelo usuário são maiúsculos
 */
import java.util.Scanner;

public class L7Ex16Maiusc {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		int contMaiusculas = 0,
			contMinusculas = 0;
			
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		for ( int i = 0 ; i < frase.length() ; i++){
			
			if ( frase.charAt(i) >= 'A' && frase.charAt (i) <= 'Z'){
				contMaiusculas++;			
			}
			if ( frase.charAt(i) >= 'a' && frase.charAt (i) <= 'z'){
				contMinusculas++;			
			}
		}
		System.out.println ("Quantidade de caracteres maiusculos: " + contMaiusculas);	
		System.out.println ("Quantidade de caracteres minusculos: " + contMinusculas);	
		}
}

