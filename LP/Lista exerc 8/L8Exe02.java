/*
2) Escreva um programa para ler um vetor B de 15 posições 
* e imprimir em ordem invertida. 
 */

import java.util.Scanner;

public class L8Exe02 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int b[] = new int [15]; 
		int posicao;
		
		for (int i = 0 ; i < b.length ; i++) {
			
			System.out.print ("Entre com um numero: ");
			b[i] = leia.nextInt (); 
		}
		
		System.out.println ("\n... leu os valores ...\n");
		
		posicao = b.length - 1 ; //começo na ultima posição
		System.out.print ("Saida Invertida: ");
		
		do {
			System.out.print ( b [ posicao ]  + " ");
			posicao --; //qdo se tornar negativo estoura o laço
		
		} while ( posicao >= 0 );
	}
}
