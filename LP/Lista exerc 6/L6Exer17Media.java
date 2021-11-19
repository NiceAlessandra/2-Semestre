/*
17) Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a 
média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. 
*Ao final da execução a mensagemNOVO CaLCULO (S/N)? deve ser apresentada. Se for respondido S deve 
retornar e executar um novo cálculo, caso contrário deverá encerrar o programa. 
*/

import java.util.Scanner;

public class L6Exer17Media {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner (System.in);
		Scanner leiaStr = new Scanner (System.in);
			
		int nota1;
		int nota2;
		double media;
		char resposta = 'n';
		
		do {
			do {
				System.out.print ("Entre com a nota 1: ");
				nota1 = leia.nextInt();
				
				if (nota1 < 0 || nota1 > 10) {
				System.out.print ("Nota invalida: ");
				}
			} while (nota1 < 0 || nota1 > 10);
			
			do {
				System.out.print ("Entre com a nota 1: ");
				nota2 = leia.nextInt();
			
				if ( nota2 < 0 || nota2 > 10) {
				System.out.print ("Nota invalida: ");
				
				}
			} while (nota2 < 0 || nota2 > 10);
			media = ( nota1 + nota2 ) / 2.0;
			System.out.println ("A media eh: " + media);
			
			System.out.print ("\nNovo calculo [s/n]: ");
			
			String respostaDoUsuario   = leiaStr.nextLine();
			String respostaEmMaiusculo = respostaDoUsuario.toUpperCase();
			
			resposta = leiaStr.nextLine().toLowerCase().charAt(0);
			
		} while ( resposta == 's' || resposta =='S');
	}
}




