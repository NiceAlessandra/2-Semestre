/*
39) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50 
termos. Apresentar a soma desta sequência no final.
 */

import java.util.Scanner;

public class L6Exer39V2TermFrac {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		int termos = 0, a, b, numero = 0;
		double soma = 0.0;
		a = 1;
		b = 49;
		do {
			System.out.print("Entre com a quantidade de termos: ");
			termos = leia.nextInt();
			
			if ( termos < 0 ) {
				System.out.println("\n\tQuantidade de termos deve ser positiva. Zero para sair.\n");
			}
			if ( termos > 0 ) {
				
				// fazer a sequencia
				// 1, 1/2, 1/3, 1/4, 1/5, 1/6
				// 1   2    3    4    5    6    ...
				numero = 0;
				
				System.out.print("Saida:  ");
				
				for (int i = 1 ; i < termos ; i++) {
		   
					System.out.print ( a + " / " + (b+1));
					System.out.print (  " + " );
		  		    a += 1;
				    b -= 1;	
					}
							
				System.out.println();	
			}
		
		} while ( termos != 0 );
			
		System.out.println("\n\tFim do programa!\n");
	}
}

