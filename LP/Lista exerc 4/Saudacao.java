/*
7 - Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma 
variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a 
mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11], 
Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23]. 
Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre 
fazendo todas as validações necessárias. 
 */

import java.util.Scanner; 

public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int hora = (int)(Math.random() * 24);
		int op   = 0;
				
		System.out.print ("Digite a opcao 1 ou 2: ");
		op = leia.nextInt();
		
		if ( op == 1 ){
		System.out.print ("Digite a hora atual: ");
		hora = leia.nextInt();
		}
		System.out.println("Hora: " + hora);
		System.out.print(hora >= 0 && hora <=  6 ? "Zzzzz"     : "");
		System.out.print(hora >= 7 && hora <= 11 ? "Bom dia"   : "");
		System.out.print(hora >=12 && hora <= 17 ? "Boa tarde" : "");
		System.out.print(hora >=18 && hora <= 24 ? "Boa noite" : "");
		
	}
}

