/*
6) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrever o maior deles.
 */

import java.util.Scanner;

public class lista05Exerc06Maiornr {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
				
		int valor1 = (int)(Math.random() * 1000);
		int valor2 = (int)(Math.random() * 1000);
		
		System.out.println("Valor 01: " + valor1);
		System.out.println("Valor 02: " + valor2);
				
				
		if (valor1 >= valor2){
			System.out.println("O maior valor eh o: " + valor1);
			
		} else {
			System.out.println("O maior valor eh o: " + valor2);
			}
						
	}
}

