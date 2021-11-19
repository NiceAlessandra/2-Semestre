/*
43) Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial 
desse número
 */

import java.util.Scanner;

public class L6Exer43Fatorial {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		int fatorial = 1; 
	
			for (int i =1 ; i<= 7; i++){
			System.out.print ("Digite sete numeros inteiros: ");
			numero = leia.nextInt ();	
			fatorial *= i;
			{
			System.out.println ("O fatorial eh: " + fatorial);
		}
	}
}

}

