/*
7) Escreva um programa em Java para ler dois valores (considere
*  que não serão lidos valores iguais) e escrevê-los em ordem crescente. 
 */
import java.util.Scanner;

public class lista05Exerc07OrCresc {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a = (int)(Math.random() * 1001);
		int b = (int)(Math.random() * 1001);
		
		System.out.println ("a: " + a);
		System.out.println ("b: " + b);
		
		if ( a > b ) {
			System.out.println (b + " " + a);
			}
			else  {
			System.out.println (a + " " + b);
		}
		
	}
}
