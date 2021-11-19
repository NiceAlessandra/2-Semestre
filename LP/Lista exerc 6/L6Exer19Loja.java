/*
19) O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. 
Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS 
MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em 
estoque.
 */
import java.util.Scanner;
public class L6Exer19Loja {
	
	public static void main (String[] args) {
		
	Scanner leia    = new Scanner (System.in);
	Scanner leiaStr = new Scanner (System.in);
		
		double soma = 0;
		double valor = 0;
		double media = 0;
		char resposta = ' ';
		int contador = 0;
				
		do { 
			System.out.print ("Digite o valor da mercadoria R$: ");
			valor = leia.nextDouble ();
			contador++;	
			soma = soma + valor;
													
			System.out.print ("Mais mercadorias? (S/N) : ");
			resposta = leiaStr.nextLine().toLowerCase().charAt(0);
					
			} while( resposta == 's' || resposta == 'S'); {
				
				media = (double) soma / contador; //cast para possivel numero fracionado
				System.out.println ("\nValor total em estoque R$: " + soma);
				System.out.println ("Media do valor das mercadorias R$: " + media);
		}
	}
}

	

		
	

		

