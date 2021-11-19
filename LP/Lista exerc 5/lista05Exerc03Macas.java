/*
3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra.. 
 */
import java.util.Scanner;

public class lista05Exerc03Macas {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int macas = 0;
		double valor = 0;
		
		System.out.print ("Digite a quantidade de macas: ");
		macas = leia.nextInt();
		
		if (macas < 12){
			valor = 1.30;
			System.out.println ("Valor total: " + valor * macas);
		} else {
			valor = 1;
			System.out.println ("Valor total: " + valor * macas);
		}
	}
}

