/*
 10) Escreva um programa em Java para ler 10 valores,
 *calcular e escrever a média aritmética desses valores lidos
 */

import java.util.Scanner;

public class L6Exer10MedAritWhile {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int     numero   =   0;
		int     soma     =   0;
		double  media    = 0.0;
		int     contador = 1;
		while ( contador <= 10){
		
			System.out.print ("Digite um numero: ");
			numero = leia.nextInt ();
			soma = soma + numero;
			contador ++;
			//System.out.println (">>>" + soma);//mostra o valor acumulado
		}
		
		media = (double) soma / 10; //cast para possivel numero fracionado
		System.out.println ("Media: " + media);
		
	}
}

