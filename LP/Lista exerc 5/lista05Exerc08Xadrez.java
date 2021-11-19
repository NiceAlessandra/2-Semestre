/*
8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
iniciar em um dia e terminar no dia seguinte 
 */

import java.util.Scanner;

public class lista05Exerc08Xadrez {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int duracaoNegativa = 0;
				
		int hrInicio = 0;
		System.out.print ("Hora inicio: ");
		hrInicio = leia.nextInt();
		
		int hrFim = 0;
		System.out.print ("Hora fim: ");
		hrFim = leia.nextInt();
		
		int duracao = hrFim - hrInicio ;
		if (duracao < 0) {
			duracaoNegativa = duracao + 24;
			System.out.print ("Duracao do jogo: " + duracaoNegativa);
			duracaoNegativa = leia.nextInt();
			}
			System.out.println ("Duracao do jogo: " + duracao);
			duracao = leia.nextInt();
	}
}

