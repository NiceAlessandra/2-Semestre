/*
60) Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois 
solicite a número e verifique se o número informado pertence a sequência de 
Ricci ou não.
*/
import java.util.Scanner;

public class L6Exer60Ricci {
	
	public static void main (String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int termos = 0, a, b, c;
		int numero = 0;
			
		System.out.print ("Entre com o primeiro termo da sequencia de Ricci: ");
		a = leia.nextInt ();
		
		System.out.print ("Entre com o segundo termo da sequencia de Ricci: ");
		b = leia.nextInt ();
		
		System.out.print ("Digite o numero de termos: ");
		termos = leia.nextInt ();
		
		System.out.print ("Digite o numero a ser verificado: ");
		numero = leia.nextInt ();
			
		for (int elemento = 1 ; elemento <= termos ; elemento++) {
		
		 c = a + b;
		 a = b;
		 b = c;
		 
		 System.out.println ( c + " " ); 
		 
			if ( numero > a && numero < b){
			System.out.println ("O numero " + numero + " NAO pertence a sequencia de Ricci!!");
		}
			if ( numero == c){
			System.out.println ("O numero " + numero + " pertence a sequencia de Ricci!!");
		}  
		} 

	}
}
