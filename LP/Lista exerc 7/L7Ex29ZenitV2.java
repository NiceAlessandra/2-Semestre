/*
29) Escreva um programa que apresente um menu com 3 opções:
1 – Criptografar
2 – Descriptografar
3 – Sair
Caso o usuário digite uma opção inválida, uma mensagem de erro deve ser apresentada e
novamente, solicitado uma estrada.
Se selecionado a opção 1, criptografar, solicitar a entrada do texto plano e como saída, exibir o
resultado do Zenit Polar e retornar ao menu principal.
Se selecionado a opção 2, descriptografar, solicitar a mensagem cifrada com Zenit Polar e
como saída, apresentar a mensagem original e retornar ao menu principal.
Por último, se selecionado a opção 3, finalizar o programa. 
>>> este é um algoritmo ciclico de criptografia - zenitpolar e o rot13 */

import java.util.Scanner;

public class L7Ex29ZenitV2 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr= new Scanner (System.in);
	
		String texto = "", 
			zp    = "zenitpolar", 
			pz    = "polarzenit",
			saida    = "";
		boolean encontrou = false;
		
		System.out.print ("Entre com um texto: ");
		texto = leiaStr.nextLine();

		for (int i = 0 ; i< texto.length() ; i++){
			
			encontrou = false;
			
			for (int j = 0 ; ! encontrou && j < zp.length() ; j++){
			
				if ( texto.charAt (i) == zp.charAt (j) ){
					encontrou = true;
					saida = saida + pz.charAt (j);
				} 
				//System.out.println ("T.: " + texto.charAt (i));
				//System.out.println ("ZP: " + zp.charAt (j));
				//System.out.println ("Saida: " + saida);
			}
			if ( ! encontrou ) {
				saida = saida + texto.charAt (i);
			}
			
		}
		System.out.println ("Saida: " + saida);
	}
}
