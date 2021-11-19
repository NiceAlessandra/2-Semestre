/*
40) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 1, 2, 3, ..., 10, 10, 9, 8, ..., 1. Exemplo com entrada de 20 
termos.
 */

import java.util.Scanner;

public class L6Exer40TermFrac {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		int termos = 0,  numero = 0;
			
		do {
			System.out.print("Entre com a quantidade de termos: ");
			termos = leia.nextInt();
			
			if ( termos < 0 ) {
				System.out.println("\n\tQuantidade de termos deve ser positiva. Zero para sair.\n");
			}
			if ( termos > 0 ) {
				
				numero = 1;
				
				System.out.print("Saida:  ");
				
				for (int i = 1 ;  i < termos ; i++) {
		   
					System.out.print ( "  " + numero );
		  		    numero++;
					}
					for (int j = 1 ; j < termos ; j++) {
					
					System.out.print ( "  " + numero );
		  		    numero--;
					}
				System.out.println();	
			}
		
		} while ( termos != 0 );
			
		System.out.println("\n\tFim do programa!\n");
	}
}

	
