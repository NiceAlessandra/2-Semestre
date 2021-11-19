/*
54) Solicite ao usuário o termo inicial e o termo final da sequência de Fibonacci 
(intervalo fechado) e imprima o resultado.
*/
import java.util.Scanner;

public class L6Exer54Fibonacci {
	
	public static void main (String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int inicial = 0;
		int fim  = 0;
		int a, b, c;
		a = 0;
		b = 1;
		
		System.out.print ("Digite o termo inicial da sequencia de Fibonacci: ");
		inicial = leia.nextInt ();
		
		System.out.print ("Digite o termo final da sequencia de Fibonacci: ");
		fim = leia.nextInt ();
		
		for (int elemento = 1 ; elemento <= fim; elemento++) {
		 	 
		 c = a + b;
		 a = b;
		 b = c;
		 
		 if ( a > inicial && a <= fim ){ 
			 
			  System.out.print (a + " ");
		 }	
		 		
		}
	}
}

