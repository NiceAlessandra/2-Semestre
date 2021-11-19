/*
16) Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15 
(inclusive) e 100 (inclusive).
 */

public class L6Exer16MediaArit {
	
	public static void main (String[] args) {
		
		int     cont =   0;
		int     soma =   0;
		double media = 0.0;
		
		
		for (int contador = 15 ; contador <= 100 ; contador ++ ){
		soma = soma + contador;
		cont++;
		}
		System.out.println ("Soma dos numeros: " + soma);
		media = (double) soma / cont; //
		System.out.println ("Media: " + media); //resposta 57,5
		
	}
}

	


