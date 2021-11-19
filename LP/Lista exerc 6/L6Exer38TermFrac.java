/*
38) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 0 (0/1), 1/2, 2/3, 3/4, 4/5, ...
 */

import java.util.Scanner;

public class L6Exer38TermFrac {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		int termos = 0, numero = 0;
		
		do {
			System.out.print("Entre com a quantidade de termos: ");
			termos = leia.nextInt();
			
			if ( termos < 0 ) {
				System.out.println("\n\tQuantidade de termos deve ser positiva. Zero para sair.\n");
			}
			if ( termos > 0 ) {
				
				// fazer a sequencia
				// 0 (0/1), 1/2, 2/3, 3/4, 4/5
				// 0   1     2    3    4    5       ...
				numero = 2;
				
				System.out.print("Saida:  ");
			
				for ( int i = 0 ; i <= termos ; i++ ) {
				
				if (i == 0 ) {
				System.out.print ( " " + i);	
				} else {
					
					System.out.print ( (i-1) + "  / " + i); 
				}
									
				System.out.println();	
				}
			}
		}
		 while ( termos != 0 );
			
		System.out.println("\n\tFim do programa!\n");
		
	}
}
	
