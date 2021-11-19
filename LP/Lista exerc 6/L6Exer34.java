/*
34) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 0, 1, 3, 6, 10, 15, ...
 */

import java.util.Scanner;

public class L6Exer34 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int termos = 0, numero = 0;
		
		do {
			System.out.print ("Entre com  quantidade de termos: ");
			termos = leia.nextInt();
			
			if (termos < 0){
				System.out.println("\n\tQuantidade de termos deve ser positiva. Zero para sair.\n: ");
			} 
				if (termos > 0) {
					//fazer a sequencia
					// 0,1,3,6,10,15,21,28
					//1 2 3 4 5 6 7 ....
					numero = 0; //inicilizar com a variavel numero novamente
					
					System.out.print ( "Saida: ");
					for (int i = 1 ; i <= termos ; i++) {
						
						System.out.print ( numero + " ");
						numero = numero + i;
					}
					System.out.println ();
				}
		} while (termos != 0 );
		
		System.out.println ("\n\tFim do Programa!\n");
			
			
			
			
		}
}


