/*
12) Escreva um programa em Java para ler 10 números e ao final 
* da leitura escrever a soma total dos 10 
números lidos.
 * 
 */
import java.util.Scanner;
public class L6Exer12Soma10 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numero   = 0;
		int contador = 1;
		double soma  = 0;
		
		while (contador <= 10 ) {
		System.out.print ("Digite 10 numeros: ");
		numero = leia.nextInt ();
		soma = soma + numero;
		contador++;
		}
		System.out.print ("Soma dos 10 numeros: " + soma);
	}
}

