/*
 8) Escreva um programa em Java para ler 10 valores e 
 * escrever quantos desses valores lidos são NEGATIVOS. 
 */
import java.util.Scanner;

public class L6Exer8NumerosNeg {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int positivos = 0;
		int negativos = 0;
		int numero    = 0;
		int contador  = 1;
				
		while( contador <= 10 ){
			
		System.out.print ("Digite 10 valores: ");
		numero = leia.nextInt ();
		contador ++;
			
			if ( numero > 0){ 
				
				positivos ++;
								
			} else {
				negativos++;
			}	
		}
				System.out.println ( "A quantidade de positivos eh: " + positivos);
				System.out.println ( "A quantidade de negativos eh: " + negativos);
	}
}

