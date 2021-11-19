/*
6) Escreva um programa que calcule e escreva a quantidade de vezes que um
caractere fornecido pelo usuário aparece em uma frase, também, fornecida pelo
mesmo. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou
minúsculo.
 */

import java.util.Scanner;

public class L7Ex06Carac {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String texto = "",
		       letra = "";
		int contador =  0;
		
		System.out.print ("Entre com um texto: ");
		texto = leiaStr.nextLine ();
		
		System.out.print ("Entre com uma letra: ");
		letra = leiaStr.nextLine ();
					
		System.out.println ("Qual o tamanho do texto? " );
		System.out.println ("O tamanho eh: " + texto.length () );
		
		System.out.println ("O primeiro caracter do texto eh: " +
		                    texto.charAt(0) ); // 1o caracter na posicao zero
	
		System.out.println ("O ultimo caracter do texto eh: " +
		                    texto.charAt(texto.length () -1) ); //subtraindo um caracter 
		                    
		System.out.println ("\nImprimindo uma letra em cada linha");
		
		for (int i = 0 ; i < texto.length() ; i ++) {
			
			System.out.print (texto.charAt ( i ));
				
			if ( texto.toLowerCase ().charAt (i) == letra.toLowerCase().charAt (0)){
				System.out.print ("<-- ");
				contador++;
			}
			System.out.println ();
			
		}
		System.out.println ("\nO texto tem quantos \" " + letra.charAt (0) + "\"? " + contador);
		System.out.print ("Texto: " + texto);
	}
}

