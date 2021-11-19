/*
59) Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois 
solicite a quantidade de termos que ele deseja gerar. Imprimir o resultado.
*/
import java.util.Scanner;

public class L6Exer59Ricci {
	
	public static void main (String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int termos = 10, a, b, c;
			
		System.out.print ("Entre com o primeiro termo da sequencia de Ricci: ");
		a = leia.nextInt ();
		
		System.out.print ("Entre com o segundo termo da sequencia de Ricci: ");
		b = leia.nextInt ();
		
		System.out.print ("Entre com quantidade de termos: ");
		termos = leia.nextInt ();
			
		for (int elemento = 1 ; elemento <= termos ; elemento++) {
				 		 
		 c = a + b;
		 a = b;
		 b = c;
	 
		 System.out.print ( c + " "); 
		
		}

	}
}

