/*
4) Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
também a média calculada. 
 */

import java.util.Scanner;

public class lista05Exerc04Notas {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double notap1 = 0, notap2 = 0, md = 0;
				
		System.out.print ("Nota da Primeira Avaliacao: ");
		notap1 = leia.nextDouble();
		
		System.out.print ("Nota da  Segunda Avaliacao: ");
		notap2 = leia.nextDouble();
		
		md = ((notap1 + notap2) / 2);
				
		if ( md < 6 ) {
			System.out.println ("Media aritmetica simples: " + md);
			System.out.print ("Reprovado");
		} else {
			System.out.println ("Media aritmetica simples: " + md);
			System.out.print ("Aprovado");
		}
		
	}
}

