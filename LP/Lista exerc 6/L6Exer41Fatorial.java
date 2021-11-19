/*

 */

import java.util.Scanner;

public class L6Exer41Fatorial {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		int fatorial = 1; //fatorial é multiplicação, então não pode ser zero
	
		System.out.print ("Entre com um numero: ");
		numero = leia.nextInt ();
		
		//for ( int i = numero ; i>=1; i--){
			for (int i =1 ; i<= numero; i++){
			fatorial *= i; // fatorial = fatorial * i
				
			}
		System.out.println ("O fatorial eh: " + fatorial);
		}
		
	
	
	}



