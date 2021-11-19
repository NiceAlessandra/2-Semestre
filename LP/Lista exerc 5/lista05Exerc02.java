/*
2) Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
(considere o valor zero como positivo). 
 */

import java.util.Scanner;

public class lista05Exerc02 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0 ;
		
		System.out.print ("Digite um numero: ");
		numero = leia.nextInt ();
		
		if (numero >= 0 ){
			System.out.println ("O numero e positivo");
		} else {
			System.out.println ("O numero e negativo");
		}
		
	}
}
