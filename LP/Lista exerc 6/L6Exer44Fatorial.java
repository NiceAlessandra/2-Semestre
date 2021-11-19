/*
44) Solicite ao usuário a quantidade de termos da sequência de fatoriais e 
imprima o resultado.
 */

import java.util.Scanner;

public class L6Exer44Fatorial {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		int fatorial = 1; 
		int termos = 0;
		
		System.out.print ("Digite a quantidade de termos: ");
		termos = leia.nextInt ();
		
			for (int i =1 ; i<= termos; i++){
				
			System.out.print ("De qual numero calcular o fatorial? ");
			numero = leia.nextInt ();	
			
			fatorial *= i;
			{
			System.out.println ("O fatorial eh: " + fatorial);
		}
	}
}

}

