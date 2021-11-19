/*
9) Escreva um programa para ler 5 elementos do vetor G de inteiros. Criar e imprimir
um novo vetor H, tal que, este seja formado pelos elementos pares do vetor G lido.
* Supor que o vetor poderá não ter nenhum elemento com esta propriedade e neste
caso, mostrar uma mensagem e encerrar o programa.
 vetor de tamanho aleatorio*/

import java.util.Scanner;

public class L8Exe09V2 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int tamanho = (int)(Math.random() * 16) + 5;//varia de 5 ate 20 elementos alatoriamente
		int contador = 0 ;
		  
		int[]g = new int[tamanho];
			
		System.out.println ("Entre os " + g.length + " elementos do vetor G");
								
		for (int i = 0 ; i < g.length; i++) {
					
		  g[i] = (int)(Math.random()* 50) + 1; 
		  System.out.print ( g[i] + " ");
		
		if (g[i] % 2 == 0 ){
			contador++;
			}
		}
		System.out.println ("\nQuantidade de elementos pares do vetor G: " + contador);
				
		if (contador == 0 ){
			
		System.out.println ("\nNao existem elementos pares no vetor G");
		
		} else {
				
		int h[] = new int [ contador ];
		
		System.out.println ("\nImprimindo os elementos do vetor H: " );				
		for (int i = 0, j = 0 ; i < g.length ; i++) {
				
			if (g[i] % 2 == 0 ){
				h[j] = g[i];
				System.out.print ( h[j] + " ");
				j++;
				}
			}
		}
	}
}



