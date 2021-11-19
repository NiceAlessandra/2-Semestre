/*
51) Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima 
o resultado
*/
import java.util.Scanner;

public class L6Exer51Fibonacci {
	
	public static void main (String[] args) {
/*	
0   1   1   2   3 5 8 13
|	|   ^   ^   ^
v	v	|   |   |
a + b = c   |	|   
    |   |   |   |
    v   v   |   |
    a + b = c   |
        |   |   |
        v   v   |
        a + b = c 
        */
		Scanner leia = new Scanner (System.in);
		
		int termos = 0, a, b, c;
			
		System.out.print ("Entre com a quantidade de termos da sequencia de Fibonacci: ");
		termos = leia.nextInt ();
		
		a = 0;
		b = 1;
		
		for (int elemento = 1 ; elemento <= termos ; elemento++) {
		 
		 System.out.print (a + " ");
		 
		 c = a + b;
		 a = b;
		 b = c;
		 		
		}
	}
}

