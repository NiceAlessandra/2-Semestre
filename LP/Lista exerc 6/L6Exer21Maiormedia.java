/*
21) Escreva um programa em Java para * ler uma quantidade e a seguir ler esta quantidade de números. 
Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média 
dos números lidos. 
 */
import java.util.Scanner;

public class L6Exer21Maiormedia {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero   = 0;
		int maior    = 0;
		int soma     = 0;
		double media = 0;
		int leitura  = 0;
		
		System.out.print ("Digite a quantidade de numeros: ");
		numero = leia.nextInt ();
			
		for (int contador = 1 ; contador <= numero ; contador ++ ){
		
		System.out.println ("Numeros: ");
		leitura = leia.nextInt ();
		
		soma = soma + leitura;
		media = (double) soma / contador;
		
			if( leitura > maior ) {
            maior = leitura;
			} 
		}		System.out.println("\nMaior valor eh: " + maior);
				System.out.println ("Media da soma dos valorer: " + media);
	}
}
