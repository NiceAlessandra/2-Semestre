/*
37) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 1, 1/2, 2/3, 3/4, 4/5, ...
 */

import java.util.Scanner;

public class L6Exer37TermFrac {
	
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
				// 1, 1/2, 2/3, 3/4, 4/5, 5/6
				// 1   2    3    4    5    6    ...
				numero = 2;
				
				System.out.print("Saida:  ");
			
				for ( int i = 1 ; i <= termos ; i++ ) {
				
				if (i == 1 ) {
				System.out.print ( " " + i);	
				} else {
					if ( i < 3 ){
					System.out.print ( " 1 / " + i); 
				} else {
					
					System.out.print (  numero + " / " + i); 
					numero += 1;
					}
				}					
				System.out.println();	
				}
			}
		}
		 while ( termos != 0 );
			
		System.out.println("\n\tFim do programa!\n");
		
	}
}
	
