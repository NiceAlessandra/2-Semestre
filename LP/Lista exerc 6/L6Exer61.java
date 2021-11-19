/*
61) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a 
soma dos termos.
 * 2/1 + 4/3 + 6/5 + 8/7 + 10/9 + 12/11 = ???
   

termos: 6
*/
import java.util.Scanner;

public class L6Exer61 {
	
	public static void main (String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int termos = 0, a, b;
		double soma = 0.0;
			
		System.out.print ("Entre com a quantidade de termos: ");
		termos  = leia.nextInt ();
		a = 2;
		b = 1;
			
		for (int i = 1 ; i <=termos ; i++) {
		   
		 System.out.print ( a + "/" + b + " + ");
		
		 soma += (double) a / b;
		 a += 2;
		 b += 2;
		
		}
		System.out.print ( a + "/" + b + " + ");
		soma += (double) a / b;
		 
			System.out.println ("\nSoma: " + soma);
	}
}

