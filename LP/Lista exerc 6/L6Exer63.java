/*
63) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a 
soma dos termos.
 1    1    2    3    5    8  
 -- + -- + -- + -- + -- + --
 2     3    5    7   11   13
* em cima sequência de Fibonacci e embaixo sequência de Primos.  

*/
import java.util.Scanner;

public class L6Exer63 {
	
	public static void main (String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int termos = 0;
		int c = 1;
		int a = 1;
		int b = 1;
		double soma = 0.0;
			
		System.out.print ("Entre com a quantidade de termos: ");
		termos  = leia.nextInt ();
			
			a = 0 ;
			b = 1;
			
			for (int i = 1 ; i <= termos ; i++) { 
			
			c = a + b;
			a = b;
			b = c;
			
			if ( b % 1 == b || b % b == 1 ){ 
				
				soma += (double) a / b;
				}
				
			System.out.print ( a + "  /  " + b );
			System.out.print (  "  +  " );		
						
				
		 }
	 	 System.out.print (soma);
	}
}

