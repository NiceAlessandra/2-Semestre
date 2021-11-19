/*
6) Escreva um programa para ler 2 vetores de dimensão n (n<=15) e
comparar os elementos do primeiro vetor com o segundo e informar a
posição em que os elementos são iguais. 
 */

import java.util.Scanner;

public class L8Exe06 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int tamanho;
		
		do {
			System.out.print ("Entre com a quantidade de elementos: ");
			tamanho = leia.nextInt ();
		
		if ( tamanho < 1 || tamanho > 15) {
			
			System.out.println ("Quantidade invalida! Digite um valor entre 1 e 15");
		}
	} while  ( tamanho < 1 || tamanho > 15) ;
	
	int [] vetor1 = new int [tamanho],
		   vetor2 = new int [tamanho]; 
	
	//Vetor 1
		   
	System.out.println ("Entre com elementos do vetor1");	   
	
	for (int i = 0 ; i < vetor1.length ; i++) {
		
		System.out.print ("Elemento " + (i+1) + ": ");
		vetor1[i] = leia.nextInt (); 
	}
	
	//Vetor 2
 
	System.out.println ("Entre com elementos do vetor2");	   
	
	for (int i = 0 ; i < vetor2.length ; i++) {
		
			System.out.print ("Elemento " + (i+1) + ": ");
			vetor2[i] = leia.nextInt (); 
	}
			
		//Comparar os elementos do vetor 1 com o do vetor 2
		System.out.println ("Comparando os elementos do vetor 1 com os do vetor 2");
		
		for (int i = 0; i < vetor1.length ; i++) {
			
			if (vetor1 [i] == vetor2 [i] ){
			
				System.out.println ( "Elemento " + vetor1 [i] + 
				" igual em ambos os vetores, na posicao " + i );
			}
			
		}
	}
}
