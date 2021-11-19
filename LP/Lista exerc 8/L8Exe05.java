/*
5) Escreva um programa para ler 2 vetores de dimensão n (n<=15) e calcular a soma
entre eles gerando um terceiro vetor de mesma dimensão. 
 */

import java.util.Scanner;

public class L8Exe05 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int tamanho;
		
		do {
			System.out.print ("Entre com a quantidade de alunos: ");
			tamanho = leia.nextInt ();
		
		if ( tamanho < 1 || tamanho > 15) {
			
			System.out.println ("Quantidade invalida! Digite um valor entre 1 e 15");
		}
	} while  ( tamanho < 1 || tamanho > 15) ;
	
	int [] nota1 = new int [tamanho],
		   nota2 = new int [tamanho],
		   soma  = new int [tamanho]; 
	
	//Nota 1 vai de 0 ate 4
		   
	System.out.println ("Entre com nota da 1a avaliacao dos alunos: ");	   
	
	for (int i = 0 ; i < nota1.length ; i++) {
		do {
			System.out.print ("Aluno " + (i+1) + ": ");
			nota1[i] = leia.nextInt (); 
			if  ( nota1 [i] < 0 || nota1 [i] > 4); {
				System.out.print ("Nota Invalida! Entre com valor entre 0 e 4");
			}
		} while ( nota1 [i] < 0 || nota1 [i] > 4);
	}
	
	// Nota 2 vai de 0 ate 6
	
		System.out.println ("Entre com nota da 2a avaliacao dos alunos: ");	   
		for (int i = 0 ; i < nota2.length ; i++) {
			do {
				System.out.println ("Aluno " + (i+1) + ": ");
				nota2[i] = leia.nextInt (); 
				if  ( nota2 [i] < 0 || nota2 [i] > 6); {
				System.out.println ("Nota Invalida! Entre com valor entre 0 e 6");
			}
			} while (nota2 [i] < 0 || nota2 [i] > 6);
		}
			
			//Soma nota 1 com nota 2 não passará de 10
		System.out.println ("Soma das notas 1 e 2 de cada aluno: ");
		
		for (int i = 0; i < soma.length ; i++){
			
			soma [i] = nota1 [i] + nota2 [i];
			
			System.out.println ( "Aluno" + (i+1) + ": " + soma [ i ]);
					
		}
		
	}

}
