/*
11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
e ‘/’. Calcule e mostre a operação efetuada e o seu resultado.  
 */

import java.util.Scanner;

public class lista05Exerc11OperAritIf {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner (System.in); //scanner para ler numeros
		Scanner leiaStr = new Scanner (System.in); //scanner para ler string
		
		int numero01  = 0;
		int numero02  = 0;
		double resultado = 0.0;
		
		String operacao;
		
		System.out.print("Primeiro Valor: ");
		numero01 = leia.nextInt();
		
		System.out.print("Segundo Valor: " );
		numero02 = leia.nextInt();
		
		System.out.print("Qual a operacao [+, -, *, /] : " );
		operacao = leiaStr.nextLine();
		
		char op = operacao.charAt (0);
		
		if ( op == '+') {
			resultado = numero1 + numero2;
		}
		if ( op == '-') {
			resultado = numero1 - numero2;
		}
		if ( op == '*') {
			resultado = numero1 * numero2;
		}
		if ( op == '/') {
			resultado = numero1 / numero2;
		}
		System.out.println ("O resultado eh: " + resultado);
	}
}
