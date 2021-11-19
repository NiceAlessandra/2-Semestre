/*
32) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo 
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja 
positivo imprimir a sequência de termos: 0, 2, 4, 6, ...
 */

import java.util.Scanner;

public class L6Exer32Entrada {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in);
		
		int numero;
		do {
			System.out.print ("Entre com um numero: ");
			numero = leia.nextInt ();
			
			if ( numero > 0 ){
				for ( int i = 0 ; i <= numero; numero++) {
					
					System.out.print (i + " ");
					i =  i + 2;
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

