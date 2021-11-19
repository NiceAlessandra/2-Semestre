/*
6) Escreva um programa em Java para ler dois valores 
* (considere que não serão lidos valores iguais) e escrever o maior deles. 
 */
import java.util.Scanner;

public class lista05Exerc06DoisValores {
	
	public static void main (String[] args) {
		
			Scanner leia = new Scanner (System.in);
		
		int a = (int)(Math.random() * 1001);
		int b = (int)(Math.random() * 1001);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		if (a > b) {
			System.out.println ("O maior valor eh o a: " + a);
			}
			else  {
			System.out.println ("O maior vaor eh o b: " + b);
		}
	}
}
// int max = Math.max (10, 20); // retorna o maior dos dois valores que são passados como parâmetros
//System.out.println ("max = " + max);
