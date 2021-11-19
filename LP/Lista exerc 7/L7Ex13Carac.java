/*
13) Escreva um programa que imprima o número de consoantes de uma frase fornecida pelo
usuário.
 */

import java.util.Scanner;

public class L7Ex13Carac {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		int totalConsoantes = 0, totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
		int totalVogal = 0 ;
		int totalEspacos = 0 ;
		int texto[] = new int[8];
			
		System.out.print ("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		for (int i = 0 ; i < frase.length(); i++ ){
			
		if(frase.charAt(i)=='a' || frase.charAt(i)=='A'){
			totalA+=1;
			texto[0] = totalA;
		}
		else if(frase.charAt(i)=='e' || frase.charAt(i)=='E'){
			totalE+=1;
			texto[1] = totalE;
		}
		else if(frase.charAt(i)=='i' || frase.charAt(i)=='I'){
			totalI+=1;
			texto[2] = totalI;
		}
		else if(frase.charAt(i)=='o' || frase.charAt(i)=='P'){
			totalO+=1;
			texto[3] = totalO;
		}
		else if(frase.charAt(i)=='u' || frase.charAt(i)=='U'){
			totalU+=1;
			texto[4] = totalU;
		}
		else if(frase.charAt(i)==' ' || frase.charAt(i)==' '){
			totalEspacos+=1;
			texto[5] = totalU;
		}
		else{
			totalConsoantes+=1;
			texto[6] = totalConsoantes - totalEspacos;
			totalVogal = texto[0] + texto[1] + texto[2] + texto[3] + texto[4];
		}
				
			} System.out.println ("Quantidade de vogais: " + totalVogal);
			  System.out.println ("Quantidade de consoantes: " + totalConsoantes);
			  System.out.println ("Quantidade de espacos: " + totalEspacos);
}
}
