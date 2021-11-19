/*
 5 - Crie um arquivo chamado ADivisivelPorBRandom.java. Implemente um 
 * programa em Java que guarde dois valores numéricos inteiros: a e b, 
 * gerados aleatoriamente, sendo a de 0 até 1000 (inclusos) e b de 0 a 20
 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for 
divisível por b ou a mensagem Não é divisível, caso contrário.  
 */
import java.util.Scanner;

public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a = (int)(Math.random() * 1001);
		int b = (int)(Math.random() * 21);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		if (a < 0 || a > 1000 && b < 0 || b > 1000){
			System.out.println ("Valor Invalido!");
		}
		else if (a % b == 0) {
			System.out.println ("Eh divisivel!");
			}
			else  {
			System.out.println ("Nao eh divisivel!");
		}
	}
}

