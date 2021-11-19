/*
7) Escreva um programa para ler um vetor E (de inteiros), de tamanho N (N<=20),
determinar e imprimir o maior e o menor elemento deste vetor 
 */

import java.util.Scanner;

public class L8Exe07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int tamanho, maior, menor;
		
		do {
			System.out.print ("Entre com a quantidade de elementos: ");
			tamanho = leia.nextInt ();
		
		if ( tamanho < 1 || tamanho > 20) {
			
			System.out.println ("Quantidade invalida! Digite um valor entre 1 e 20");
		}
	} while  ( tamanho < 1 || tamanho > 20) ;
	
	int [] e = new int [tamanho]; 
	
	//Entrar com os elementos do vetor E
		   
	System.out.println ("Entre com elementos do vetor E: ");	   
	
	for (int i = 0 ; i < e.length ; i++) {
		
			System.out.print ("Elemento " + (i+1) + ": ");
			e[i] = leia.nextInt(); 
	}
				
	//Determinar o maior e o menor valor de elemento do vetor E
		
		System.out.println ("Determinando o maior e o menor valor de elemento do vetor E: ");
		
		maior = menor = e[0];
				
		for (int i = 0; i < e.length ; i++) {
			
			if (e[i] > maior ){
				maior = e[i];
			}
			
			if ( e[i] < menor){
				menor = e[i];
			}
		}
		System.out.println ( "Maior elemento " + maior +
						   "\nMenor elemento " + menor);
	}
}
