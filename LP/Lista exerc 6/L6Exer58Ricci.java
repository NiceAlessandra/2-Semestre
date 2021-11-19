/*
58) Solicite ao usuário os dois primeiros termos da sequência de Ricci e gere os 10 
próximos termos.
*/
import java.util.Scanner;

public class L6Exer58Ricci {
	
	public static void main (String[] args) {
/*	
4   9   13  22  35 
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
		
		int termos = 10, a, b, c;
			
		System.out.print ("Entre com o primeiro termo da sequencia de Ricci: ");
		a = leia.nextInt ();
		
		System.out.print ("Entre com o primeiro termo da sequencia de Ricci: ");
		b = leia.nextInt ();
					
		for (int elemento = 1 ; elemento <= termos ; elemento++) {
		  		 
		 c = a + b;
		 a = b;
		 b = c;
	 
		 System.out.print ( c + " "); 
		}
	}
}

