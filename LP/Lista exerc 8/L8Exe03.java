/*
3) Escreva um programa para ler um vetor C de N posições, onde N é menor ou igual a
20 e imprimir seus elementos. O usuário deve informar o número de posições e os
elementos. 
 */

import java.util.Scanner;

public class L8Exe03 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int c[]; // nao declarou o valor do array
		int tamanho;
		
		do {
		
		System.out.print ("Entre com o tamanho do vetor: ");
		tamanho = leia.nextInt ();
		
		if ( tamanho < 1 || tamanho > 20) {
			
			System.out.println ("Tamanho invalido! Digite um valor entre 1 e 20");
		}
	} while  ( tamanho < 1 || tamanho > 20) ;
	
	c = new int [ tamanho ];
	
	for (int i = 0 ; i < c.length ; i++) {
			
			System.out.print ("Entre com um numero: ");
			c[i] = leia.nextInt (); 
		}
			
		System.out.print ("Saida : ");
		
		for (int i = 0; i < c.length ; i++) {
			
			System.out.print ( c [ i ]  + " ");
					
		}
		
	}

}
