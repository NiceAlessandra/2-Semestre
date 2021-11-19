/*
8) Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem onde
consta o caractere e na frente a quantidade de ocorrências. Caso a quantidade de
ocorrências de um caractere seja zero, não apresentar o caractere na listagem. Não
diferenciar maiúsculo de minúsculo.
 */

import java.util.Scanner;

public class L7Ex08Frase {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
				
		for (int letra = 'a' ; letra <= 'z' ; letra++) {
			
			contador = 0; // para zerar o contador
			
			for ( int i = 0 ; i < frase.length (); i++){
			
				if (letra == frase.toLowerCase().charAt (i) ){
					contador++;
				}
			}
		if ( contador > 0 ){ //diferença do exerc anterior
			
		System.out.println ( (char)letra + ": " + contador);
		}
	}
}
}		
