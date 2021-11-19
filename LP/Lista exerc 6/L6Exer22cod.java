/*
22) Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
- o maior preço lido;
- a média aritmética dos preços dos produtos.
 */
import java.util.Scanner;
public class L6Exer22cod {
	
	public static void main (String[] args) {
		
	Scanner leia = new Scanner (System.in);
		int codigo = 0;
		double soma = 0;
		double valor = 0;
		double media = 0;
		double maior = 0;
		
		for ( int contador = 1 ; contador <= 4 ; contador ++ ){
		
		System.out.print ("Digite o codigo do produto: ");
		codigo = leia.nextInt ();
		
		System.out.print ("Digite o valor da mercadoria R$: ");
		valor = leia.nextInt ();
		soma = soma + valor;
		media = (double) soma / contador; 
			
			} 	if( valor > maior && valor!=0 ) {
				maior = valor;
				
				}
					System.out.println ("\nMaior valor R$: " + maior);
					System.out.println ("Media do valor das mercadorias R$: " + media);
	}
}

		

