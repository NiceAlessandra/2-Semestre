/*
12) Escreva um programa para ler um vetor de inteiros P de 10 elementos e
imprimir o vetor lido. Ler outro vetor de inteiros Q de 15 elementos e
imprimir este vetor lido. Construir outro vetor R com todos os elementos
lidos de P e de Q e imprimir este vetor obtido. (Concatenação)
 
*/
import java.util.Scanner;
public class L8Exe12 {
	
	public static void main (String[] args) {
		
		int tamanho = 20, posicao = 0;
		int[] pa = new int [(int)(Math.random() *tamanho)+1],
			  pb = new int [(int)(Math.random() *tamanho)+1],
			  pc = new int [pa.length + pb.length];
		
	System.out.print ("Vetor A: ");
	for (int i = 0 ; i < pa.length ; i++){
		pa[i] = (int)(Math.random()*10);
		System.out.print ( pa[i] + " ");
	}
	System.out.print ( "\n\nVetor B: ");
	for (int i = 0 ; i< pb.length ; i++){
		pb[i] = (int)(Math.random()*10);
		System.out.print ( pb[i] + " ");
	}
	//Concatenar
	for  (int i = 0 ; i< pa.length ; i++){
		pc[posicao]= pa[i];
		posicao++;
	}
	for  (int i = 0 ; i< pb.length ; i++){
		pc[posicao]= pb[i];
		posicao++;
	}
	System.out.print ("\n\nVetor C: ");
	for  (int i = 0 ; i< pc.length ; i++){
		System.out.print ( pc [i] + " ");
}

	}
}
