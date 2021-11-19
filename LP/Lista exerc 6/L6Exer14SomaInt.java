/*
14) Escreva um programa em Java para ler 2 valores,
* calcular e escrever a soma dos inteiros existentes 
entre os 2 valores lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será 
sempre maior que o primeiro valor lido.
 * 
 */
import java.util.Scanner;

public class L6Exer14SomaInt {
	
	public static void main (String[] args) {
			
		Scanner leia = new Scanner (System.in);
		
		int primeiroValor = 0;
		int segundoValor = 0;
		int soma = 0;
		
			System.out.print ("Digite um numero: ");
			primeiroValor = leia.nextInt ();
			System.out.print ("Digite um numero: ");
			segundoValor = leia.nextInt ();
							
		while ( primeiroValor <= segundoValor ){
		soma = soma + primeiroValor;
		primeiroValor++;
		} 
		System.out.println ("Soma dos inteiros no intervalo digitado: " + soma);
	}
}
