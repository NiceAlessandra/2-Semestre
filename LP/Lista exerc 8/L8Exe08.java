/*
8) Escreva um programa para ler 5 elementos do vetor F de inteiros. Calcular
e imprimir a soma dos elementos ímpares. Supor que o vetor poderá não ter
nenhum elemento com esta propriedade e neste caso, mostrar uma
mensagem.
 */

import java.util.Scanner;

public class L8Exe08 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int tamanho = 5, soma = 0, contador = 0 ;
		int []f = new int [tamanho];
		
		//Entrando com os elementos do vetor F
		System.out.println ("Entre com os 5 elementos do vetor F");
								
		for (int i = 0 ; i < f.length; i++) {
			
			System.out.print ("Elemento" + (i+1) + ": ");
		    f[i] = leia.nextInt(); 
		}
		
		//Somar os elementos impares do vetor F
		
		System.out.println ("Somando os elementos impares do vetor F");
				
		for (int i = 0; i < f.length ; i++) {
				
			if (f[i] % 2 != 0 ){
				soma += f[i];
				contador++;
				System.out.println (f[i] + " <- Impar"); 
			}
		}
		if (contador == 0) {
			System.out.println ("Nao tem elementos impares!");
		} else {
		System.out.println ( "Soma dos elementos impares: " + soma);
	}
}
}


