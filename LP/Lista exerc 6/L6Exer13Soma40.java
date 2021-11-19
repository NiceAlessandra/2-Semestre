/*
13) Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40 
devem ser somados. Escreva o valor final da soma efetuada.
 */

import java.util.Scanner;
public class L6Exer13Soma40 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero   = 0;
		int contador = 1;
		double inferiores  = 0;
		double superiores  = 0;
		double somaInferiores  = 0;
		double somaSuperiores  = 0;
		
		while ( contador <= 10 ) {
			
		System.out.print ("Digite 10 numeros: ");
		numero = leia.nextInt ();
		contador++;
					
			if ( numero < 40 ) {
			inferiores ++;
			somaInferiores = somaInferiores + numero;
			} else {
			  superiores ++;
			  somaSuperiores = somaSuperiores + numero;
			  }
		}
		System.out.println ("Quantidade de  valores inferiores a 40: " + inferiores);	
		System.out.println ("Quantidade de  valores superiores a 40: " + superiores );	
		System.out.println ("Soma valores inferiores a 40: " + somaInferiores);	
		System.out.println ("Soma valores superiores a 40: " + somaSuperiores );	
	}
}
