/*
11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
e ‘/’. Calcule e mostre a operação efetuada e o seu resultado.  
 */

import java.util.Scanner;

public class lista05Exerc11OperArit {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner (System.in); //scanner para ler numeros
		Scanner leiaStr = new Scanner (System.in); //scanner para ler string
		
		int numero01  = 0;
		int numero02  = 0;
		double resultado = 0;
		
		String operacao;
		
		System.out.print("Primeiro Valor: ");
		numero01 = leia.nextInt();
		
		System.out.print("Segundo Valor: " );
		numero02 = leia.nextInt();
		
		System.out.print("Qual a operacao [+, -, *, /] : " );
		operacao = leiaStr.nextLine();
		
		// char op = operacao.charAt (0);  depende da versao do java
		//ex: Banana Nanica
		//    012345678910 
		//             1112
		//"+"
		switch (operacao) {
			
			case "+": // mudar para apostrofo utilizando o char at
			resultado = (double) numero01 + numero02;
			break;
			case "-":
			resultado = (double) numero01 - numero02;
			break;
			case "*":
			resultado = (double) numero01 * numero02;
			break;
			case "/":
			resultado = (double) numero01 / numero02;
			break;
			default:
			resultado = 0;
			System.out.println ("Operacao Invalida!!");
			
			}
		System.out.println ("O resultado eh: " + resultado);
	}
}

