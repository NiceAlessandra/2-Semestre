/*
5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu). 
 */

import java.util.Scanner;

public class lista05Exerc05Ano {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in) ;
		
		int anoatual = 0, anonascimento = 0, idade = 0;
		
		System.out.print ("Ano Atual: ");
		anoatual = leia.nextInt();
		
		System.out.print ("Ano de nascimento: ");
		anonascimento = leia.nextInt();
		
		idade = anoatual - anonascimento;
		
		System.out.println ("Idade: " + idade);
		
		if ( idade >= 18 ){
			
			if (idade < 70 ){				
				System.out.println ("Voto Obrigatorio");
			} else {
			System.out.println("Voto Facultativo");
		}
		} else {
			if (idade >=16 && idade < 18 ){
				System.out.println("Facultativo");
			} else {
				System.out.println("Nao vota");
			}
		}
	}
}
