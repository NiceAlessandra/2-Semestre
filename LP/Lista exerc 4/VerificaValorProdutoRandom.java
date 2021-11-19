/*
3 - Crie um arquivo chamado VerificaValorProdutoRandom.java. 
* Gere dois números aleatórios entre 1 e 1000 (inclusos), atribuindo 
* as variáveis precoProduto1 e precoProduto2. O programa deve 
exibir a mensagem O produto 1 é o mais barato quando o preço do 
* primeiro produto for menor. Caso contrário, se o preço do 
* segundo produto for menor, a mensagem O produto 2 é o mais 
* barato deve ser exibida. Caso contrário, a mensagem Os preços 
* dos dois produtos são iguais é que deve ser exibida.  
 */

import java.util.Scanner;

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);		
		
		int prProd1 = (int)(Math.random() * 1000);
		int prProd2 = (int)(Math.random() * 1000);
		
		System.out.println("Preco Produto 01: " + prProd1);
		System.out.println("Preco Produto 02: " + prProd2);
		
		if ( prProd1 >= prProd2 ){
			System.out.println ("O produto 2 eh o mais barato!");
			 }
			 else if (prProd2 >= prProd1) {
				System.out.println ("O produto 1 eh o mais barato!");
			 }
				else {
				System.out.println ("Os precos dos produtos sao iguais!");
		}
	}
}
