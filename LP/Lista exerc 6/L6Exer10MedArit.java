/*
 10) Escreva um programa em Java para ler 10 valores,
 *calcular e escrever a média aritmética desses valores lidos
 */

import java.util.Scanner;

public class L6Exer10MedArit {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int     numero  =   0;
		int     soma    =   0;
		double  media   = 0.0;
		
		for ( int contador = 1 ; contador <= 10 ; contador ++ ){
		
			System.out.print ("Digite um numero: ");
			numero = leia.nextInt ();
			//      0   +  5 = 5 soma ira receber 5
			// 2a litura = 5 + 2o numero digitado ex 7 = 12 -> soma recebe 12
			soma = soma + numero;
			System.out.println (">>>" + soma);//mostra o valor acumulado
		}
		
		media = (double) soma / 10; //cast para possivel numero fracionado
		System.out.println ("Media: " + media);
		
	}
}

