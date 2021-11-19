/*
9) Escreva um programa em Java para ler 10 valores e escrever 
* quantos desses valores lidos estão no intervalo [10,20] 
* (incluindo os valores 10 e 20 no intervalo) e quantos deles 
* estão fora deste intervalo. 
 */

import java.util.Scanner;

public class L6Exer9Intervalo {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero   = 0;
		int contador = 1;
		int dentroIntervalo = 0;
		int foradoIntervalo = 0;
		
		while (contador <= 10){
		
			System.out.print ("Digite um numero: ");
			numero = leia.nextInt ();
			contador ++;
			
			    if( numero >= 10 && numero <= 20 ){
				 dentroIntervalo ++;
				 
			} else {
			  foradoIntervalo ++;
			}
		}
			System.out.println ("Valores dentro do intervalo entre 10 e 20 : " + dentroIntervalo);
			System.out.println ("Valores fora do intervalo entre 10 e 20 : " + foradoIntervalo);
	}
}

