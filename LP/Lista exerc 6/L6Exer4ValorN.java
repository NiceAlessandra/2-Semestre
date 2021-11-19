/*
4) Escreva um programa em Java para ler um valor N e imprimir 
* todos os valores inteiros entre 1 (inclusive) e N (inclusive). 
* Considere que o N será sempre maior que ZERO 
 */

import java.util.Scanner;

public class L6Exer4ValorN {
	
	public static void main (String[] args) {
		
		int N     = 1 ;
		int valor = 0;
			
		Scanner leia = new Scanner (System.in);
		
		System.out.print ("Digite um numero: ");
		valor = leia.nextInt ();
		
		for ( ; N < valor ; N  ++ ) {
							
			System.out.print (N + " ");
			
			} 		
	}
}

