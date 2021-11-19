/* 16) Escreva um programa para solicitar ao usuário a quantidade de
elementos da sequência de Fibonacci (N<=20) e gerar um vetor V com os
elementos da sequência e imprimir o vetor.*/

import java.util.Scanner;

public class L8Exe16 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a = 0, b = 1, c = 0;
		int tamanho;
		int termoInicial = 0;
		int termoFinal   = 0;
								   
		System.out.print ("Termo Inicial: ");
		termoInicial = leia.nextInt (); 
		
		System.out.print ("Termo Final..: ");
		termoFinal = leia.nextInt (); 		
			
		int [] fibonacci = new int [(termoFinal+3) - (termoInicial-2)];
		//Professor sei que esta saida pode ser melhor
		System.out.print ("Sequencia de Fibonacci: ");
						
		for(int i = 1; i < fibonacci.length+1; i++){
			
			fibonacci[i-1] = a;
			
				System.out.print(a + ", ");
				
				c = a + b;
				a = b;
				b = c;
		}	
		for(int i = 0; i < fibonacci.length; i++){
		}
			tamanho = fibonacci.length - 1 ;
			System.out.print ("\nSaida Invertida: ");
		do {
			System.out.print ( fibonacci[tamanho]  + " ");
			tamanho --; 
			
		} while ( tamanho >= 0 );
	}
}
