/*
13) Escreva um programa para ler um vetor de inteiros P de N elementos (N<=10) e
imprimir o vetor lido. Ler outro vetor de inteiros Q de M elementos (M<=15) e imprimir
este vetor lido. Construir outro vetor R com todos os elementos lidos de P e de Q e
imprimir este vetor obtido. (Concatenação)
*/
import java.util.Scanner;

public class L8Exe13 {
	
	public static void main (String[] args) {
		
		int [p];
		int [q];
		int [r];
		int tamanho , posicao;
		
		int[] pp = new int [(int)(Math.random() *tamanho)+1],
			  pq = new int [(int)(Math.random() *tamanho)+1],
			  pr = new int [pplength + pqlength];
		
	System.out.print ("Vetor P: ");
	for (int i = 0 ; i < pp.length ; i++){
		pp[i] = (int)(Math.random()*10);
	
		if ( tamanho < 1 || tamanho > 10) {
			
			System.out.println ("Tamanho invalido! Digite um valor entre 1 e 10");
		}
		System.out.print ( pp[i] + " ");
	}
	System.out.print ( "\n\nVetor Q: ");
	for (int i = 0 ; i< pq.length ; i++){
		pq[i] = (int)(Math.random()*10);
		
		if ( tamanho < 1 || tamanho > 15) {
			
			System.out.println ("Tamanho invalido! Digite um valor entre 1 e 15");
		}
		System.out.print ( pq[i] + " ");
	}
	//Concatenar
	for  (int i = 0 ; i< pp.length ; i++){
		pr[posicao]= pp[i];
		posicao++;
	}
	for  (int i = 0 ; i< pq.length ; i++){
		pr[posicao]= pq[i];
		posicao++;
	}
	System.out.print ("\n\nVetor R ");
	for  (int i = 0 ; i< pr.length ; i++){
		System.out.print ( pr [i] + " ");
}

	}
}
