/*
23) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em 
Java para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população;
b) Média do número de filhos;
c) Maior salário dos habitantes;
d) Percentual de pessoas com salário menor que R$ 150,00.
Obs.: O final das leituras dos dados se dará com a entrada de um salário negativo.
 */
import java.util.Scanner;

public class L6Exer23Pref {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int salario         = 0;
		int filhos          = 0;
		double soma         = 0;
		int somaFilhos      = 0;
		int maior           = 0;
		double percentual   = 0;
		double mediaSalario = 0;
		double mediaFilhos  = 0;
		
		for (int contador = 1 ; contador <= 5 ; contador ++ ){
				
		System.out.print ("Digite o salario R$: ");
		salario = leia.nextInt();
		contador++;
		soma = soma + salario;
		mediaSalario = (double) soma / salario;
				
		System.out.print ("Digite o numero de filhos: ");
		filhos = leia.nextInt ();
		contador++;
		somaFilhos = somaFilhos + filhos;
		mediaFilhos  = (double) somaFilhos / filhos;
						
			if( salario > maior && salario!=0 ) {
            maior = salario;
			} 
			if( salario < 150 && salario!=0 ) {
            percentual = salario * 0.1/soma;
			} 
		}		
				System.out.println("\nMaior Salario R$: " + maior);
				System.out.println ("Media dos salarios R$: " + mediaSalario);
				System.out.println ("Media filhos: " + mediaFilhos);
				System.out.println ("Percentual pessoas salario < R$ 150: " + percentual);
	}
}
