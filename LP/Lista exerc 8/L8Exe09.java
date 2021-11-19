/*
9) Escreva um programa para ler 5 elementos do vetor G de inteiros. Criar e imprimir
um novo vetor H, tal que, este seja formado pelos elementos pares do vetor G lido.
* Supor que o vetor poderá não ter nenhum elemento com esta propriedade e neste
caso, mostrar uma mensagem e encerrar o programa.
 */

import java.util.Scanner;

public class L8Exe09 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int tamanho = 5, soma = 0, contador = 0 ;
		int []g = new int [tamanho];
		
		//Entrando com os elementos do vetor G
		System.out.println ("Entre com os 5 elementos do vetor G");
								
		for (int i = 0 ; i < g.length; i++) {
			
			System.out.print ("Elemento" + (i+1) + ": ");
		    g[i] = leia.nextInt(); 
		    
		//Contar os elementos pares do vetor G
		if (g[i] % 2 == 0 ){
				contador++;
			}
		}
				//Imprimir a quantidade de elementos pares
		System.out.println ("Quantidade de elementos pares do vetor G: " + contador);
				
		if (contador == 0 ){
			
		System.out.println ("Nao existem elementos pares no vetor G");
		
		} else {
		
		// Criar o vetor H com o tamanho igual a quantidade de elementos pares do vetor G
		int h[] = new int [ contador ];
		
		//Copiar os elementos pares do vetor G para o vetor H				
		for (int i = 0, j= 0 ; i < g.length ; i++) {
				
			if (g[i] % 2 == 0 ){
				h[j] = g[i];
				j++;
			}
		}
		//Imprimir o vetor H que contem os elementos pares do vetor G
		System.out.println ("\nImprimindo os elementos do vetor H: " );
		for ( int i = 0 ; i < h.length ; i++ ) {
			System.out.print ( h[i] + " " );
			}
		}
	}
}


