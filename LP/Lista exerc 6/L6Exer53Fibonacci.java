/*
53) Imprima os números da sequência de Fibonacci que estão presentes na faixa de 1 
até 250.
*/
public class L6Exer53Fibonacci {
	
	public static void main (String[] args) {
	
		int a, b, c;
		a = 0;
		b = 1;
		
		for (int elemento = 1  ; elemento <= 20; elemento++) {
		 	 
		 c = a + b;
		 a = b;
		 b = c;
		 
		 if ( a <= 250 ){
			 
			  System.out.print ( a + " ");
		 }	
		 		
		}
	}
}
