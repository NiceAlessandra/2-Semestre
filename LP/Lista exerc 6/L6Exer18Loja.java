/*
18) Uma loja está levantando o valor total de todas as mercadorias em estoque. 
* Escreva um programa em Java que permita a entrada das seguintes informações: 
* a) o número total de mercadorias no estoque; 
* b) o valor de cada mercadoria. 
* Ao final imprimir o valor total em estoque e a média de valor das mercadorias. 
 */
import java.util.Scanner;
public class L6Exer18Loja {
	
	public static void main (String[] args) {
		
	Scanner leia = new Scanner (System.in);
		int mercadorias = 0;
		double soma = 0;
		double valor = 0;
		double media = 0;
		
		System.out.print ("Digite a quantidade de mercadorias: ");
		mercadorias = leia.nextInt ();
									
		for ( int contador = 1 ; contador <= mercadorias ; contador ++ ){
		
			System.out.print ("Digite o valor da mercadoria R$: ");
			valor = leia.nextInt ();
			soma = soma + valor;
			//System.out.println (">Acumulado>" + soma);//mostra o valor acumulado
			}
	    	
			media = (double) soma / mercadorias; //cast para possivel numero fracionado
			System.out.println ("\nValor total em estoque R$: " + soma);
			System.out.println ("Media do valor das mercadorias R$: " + media);
		}
		
	}

		

