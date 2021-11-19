/*
1) Escreva um programa para ler um vetor A de 15 posições 
* e imprimir seus elementos.
 */

import java.util.Scanner;

public class L8Exe01 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a[] = new int [15]; //int a - sinal de vetor de 15 posições
		int posicao;
		
		for (int i = 0 ; i < a.length ; i++) {
			
			System.out.print ("Entre com um numero: ");
			a[i] = leia.nextInt (); 
		}
		
		System.out.println ("\n... leu os valores ...\n");
		
		posicao = 0 ;
		System.out.print ("Saida: ");
		while ( posicao < a.length )  {
			System.out.println ( "[" + (posicao + 1) + "]" + a [ posicao ] );
			System.out.print ( a [ posicao ]  + " ");
			posicao ++;
		
		}
		
	}

}
