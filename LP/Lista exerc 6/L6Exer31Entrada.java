/*
31) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 1, 2, 3, 4, ... 
 */

import java.util.Scanner;

public class L6Exer31Entrada {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in);
		
		int numero;
		do {
			System.out.print ("Entre com um numero: ");
			numero = leia.nextInt ();
			
			if ( numero > 0 ){
				for ( int i = 1 ; i <= numero; i++) {
					System.out.print (i + " ");
				}
				System.out.println ();
				
			} else {
				if (numero < 0 ) {
					System.out.println ("\n\tNumero invalido. Entre com um nr positivo: ");
				}
			}
			
		} while (numero != 0 );
		
	}
}

