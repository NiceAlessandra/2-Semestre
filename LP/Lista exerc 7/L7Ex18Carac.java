/*
18) Desenvolva um programa que leia uma cadeia de caracteres e através de uma mensagem
indique se esta cadeia representa uma sequência binária de 8 bit’s ou não. 
Ex: 
- não é uma sequência de 8bit’s: 01101, 10192898, 10001jaA
- é uma sequência de 8bit’s: 01101011, 10110101, 10000000
 */

import java.util.Scanner;

public class L7Ex18Carac {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		String caracter = "", sequencia = "";
		int contador = 0;
			
		System.out.print ("Digite uma seguencia de caracteres: ");
		caracter = leiaStr.nextLine ();
		
		for (int i = 1 ; i < caracter.length (  ) ; i ++) {
			
			if ( caracter.charAt (i) == '0' || caracter.charAt (i) == '1'){
				contador++;
			System.out.println ("Eh uma sequencia de 8 bits: " + caracter);
			} else {
				System.out.println ("Nao eh uma sequencia de 8 bits!!" + caracter);	
			} 
		}
	}
}
