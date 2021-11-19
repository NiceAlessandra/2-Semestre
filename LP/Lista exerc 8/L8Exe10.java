/*
10) Escreva um programa para ler dois vetores PA e PB de inteiros de 5
elementos e imprimir os vetores lidos. Construir outro vetor PC de tamanho
10, com todos os elementos lidos de PA e de PB e imprimir este vetor obtido.
(Concatenação) 
*/

import java.util.Scanner;

public class L8Exe10 {
	
	public static void main (String[] args) {
		
		int tamanho = 5;
		int[] pa = new int [tamanho],
			  pb = new int [tamanho],
			  pc = new int [pa.length + pb.length];
	
	for (int i = 0 ; i < tamanho ; i++){
		pa[i] = (int)(Math.random()*10);
		pb[i] = (int)(Math.random()*10);
	}
	System.out.print ("Vetor A: ");
	for (int i = 0 ; i < tamanho ; i++){
		System.out.print ( pa[i] + " ");
	}
	System.out.print ( "\n\nVetor B: ");
	for (int i = 0 ; i< tamanho ; i++){
		System.out.print ( pb[i] + " ");
	}
	//Concatenar
	for  (int i = 0 ; i< tamanho ; i++){
		pc[i]= pa[i];
		pc[i + tamanho]= pb[i];
	}
	System.out.print ("\n\nVetorC: ");
	for  (int i = 0 ; i< pc.length ; i++){
		System.out.print ( pc [i] + " ");
}

	}
}

