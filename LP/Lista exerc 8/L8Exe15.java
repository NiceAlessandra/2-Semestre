/* 15) Escreva um programa para ler um vetor de inteiros S de N elementos (N<=10) e
imprimir o vetor lido. Ler outro vetor de inteiros T de M elementos (M<=15) e imprimir
este vetor lido. Construir outro vetor U com todos os elementos lidos de S e de T e
imprimir este vetor obtido. (Intercalação)
*/

import java.util.Scanner;

public class L8Exe15 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int S[] = new int[(int)(Math.random()*10)];
		int T[] = new int[(int)(Math.random()*15)];
		int U[] = new int[S.length+T.length];
		
		System.out.print("Termo S: ");
		for(int i = 0; i < S.length; i++){
			S[i] = (int)(Math.random()*100+1);
			System.out.print(S[i] + " ");
		}
		
		System.out.println();
		System.out.print("Termo T: ");
		for(int i = 0; i < T.length; i++){
			T[i] = (int)(Math.random()*100+1);
			System.out.print(T[i] + " ");
		}
		
		int j = 0;
		for(int i = 0; i < U.length; ){
			if(i < S.length){
				U[i++] = S[j];
			}	
			if(i < T.length){
				U[i++] = T[j];
			}
			j++;
			
			System.out.println();
		System.out.print("Termo U: ");
		for( i = 0; i < U.length; i++){
			System.out.print(U[i] + " ");
		}
		
		
		}
		
		
		
	}
}
