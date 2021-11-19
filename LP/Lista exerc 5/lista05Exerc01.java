/*
1) Escreva um programa em Java para ler um valor e escrever a mensagem  - É MAIOR QUE
* 10! se o valor lido for maior que 10, caso contrário escrever  - NÃO É MAIOR QUE 10!
 */

import java.util.Scanner;

public class lista05Exerc01 {
	
	public static void main (String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.print ("Digite um numero: ");
		numero = leia.nextInt ();
		
		if (numero > 10 ){
			
			System.out.println ("Eh maior que 10!");
		} else {
			System.out.println ("Nao eh maior que 10!");
		}
	}
}
