/*
55) Solicite um número inteiro ao usuário e informe se o número é perfeito ou não.
 */
import java.util.Scanner;

public class L6Exer55Perfeito {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0 , soma = 0;
			
		System.out.print ("Entre com um numero: ");
		numero = leia.nextInt ();
		
		for ( int i = 1 ; i < numero ; i++) {
			if ( numero % i == 0 ){
				
				soma = soma + i;
			}
		}
			if ( numero == soma ) {
				
				System.out.println ("Esse numero eh perfeito!!!");
		} else {
		
			System.out.println ("Esse numero nao eh perfeito... =(");
		}
	}
}

