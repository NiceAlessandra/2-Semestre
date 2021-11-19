/*
 12) Desenvolva um programa em Java que receba o preço de um produto e seu código de
origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
valor final a ser pago pelo produto, conforme tabela a seguir: 
 */

import java.util.Scanner;

public class lista05Exerc12Prod {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner (System.in);
		Scanner leiaStr = new Scanner (System.in);
			
		double  preco;
		double  valorFinal;
		double  frete;
		int     cod;
		
		String procedencia, Norte, Sul, Leste, Oeste, Importado;
			
		System.out.print ("Preco do produto R$: ");
		preco = leia.nextDouble();
		
		System.out.print ("Codigo de origem:  ");
		cod = leia.nextInt();
				
			if (cod == 1) {
			procedencia = "Norte";
			frete = preco * 0.1;
			valorFinal = preco + frete;
			} else if (cod ==  2 || cod == 5 || cod == 9){
			  procedencia = "Sul";
		      frete = preco * 0.03;
			  valorFinal = preco + frete;
				} else if (cod == 3 || cod ==10 || cod == 11 || cod == 12 || cod == 13 || cod == 15) {
				  procedencia = "Leste";
			      frete = preco * 0.012;
				  valorFinal = preco + frete;
						} else if (cod == 7 || cod == 20){
						procedencia = "Oeste";
						frete = preco * 0.073;
						valorFinal = preco + frete;
							} else {
							procedencia = "Importado";
							frete = preco * 0.222;
							valorFinal = preco + frete;
							}
			System.out.println ("Procedencia: " + procedencia);
			System.out.println ("Frete R$: " + frete);
			System.out.println ("Valor Final R$: " + valorFinal); 
		}
	}


