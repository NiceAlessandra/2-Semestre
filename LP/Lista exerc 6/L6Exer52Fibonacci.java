/*
52) Solicite um número inteiro ao usuário e informe se ele pertence a sequência
de Fibonacci ou não.
*/
import java.util.Scanner;

public class L6Exer52Fibonacci {
	
	public static void main (String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int termos = 0, a, b, c;
		int numero = 0;
		
		System.out.print ("Entre com um numero inteiro: ");
		numero = leia.nextInt ();
			
		System.out.print ("Entre com a quantidade de termos da sequencia de Fibonacci: ");
		termos = leia.nextInt ();
		
		a = 0;
		b = 1;
		
		for (int elemento = 1 ; elemento <= termos ; elemento++) {
		 
		 System.out.print (a + " ");
		 
		 c = a + b;
		 a = b;
		 b = c;
		 
		 if (elemento < a || elemento > a) {
			
			System.out.println ("Pertence a Fibonacci: " );
		} else {
		
			System.out.println ("Nao pertence a Fibonacci: " );
		
		}
	}	
}
}
