/*
7) Escreva um programa em Java para ler um valor inteiro (aceitar 
* somente valores entre 1 e 10) e escrever 
a tabuada de 1 a 10 do valor lido. 
 */

import java.util.Scanner;

public class L6Exer7TabuadaQq {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		int tabuada = 0;
		
		System.out.print ("Digite a tabuada desejada: ");
		tabuada = leia.nextInt ();
		
		do {
		System.out.println (tabuada + " x " + numero + " = " + (tabuada * numero));
		numero ++;
		} while ( numero <= 10);
	}
}

