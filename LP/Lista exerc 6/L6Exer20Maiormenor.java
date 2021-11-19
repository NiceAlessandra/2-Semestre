/*
20) Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido. 
 * 
 */
import java.util.Scanner;

public class L6Exer20Maiormenor {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		int maior  = 0;
		int menor  = 0;
		
		System.out.print ("Digite o primeiro numero: ");
		numero = leia.nextInt ();
		
		for (int contador = 1 ; contador <= 5 ; contador ++ ){
		numero++;
		System.out.print (" " + numero);
		
			if( numero > maior && numero!=0 ) {
            maior = numero;
			}
				if( numero < menor && numero!=0 ) {
			    menor = numero;
				}
		}
				System.out.println("\nMaior valor eh: " + maior);
				System.out.println ("Menor valor eh: " + menor);
	}
}
