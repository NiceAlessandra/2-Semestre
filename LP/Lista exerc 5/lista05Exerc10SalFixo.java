/*
10) Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
salário total. 
 */

import java.util.Scanner;

public class lista05Exerc10SalFixo {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double salarioFixo  = 0;
		double valorVendas  = 0;
		double salarioTotal = 0;
		double vendasMaioresQue1500 = 0;
		double comissao = 0;
		
		System.out.print ("Digite o salario fixo R$: ");
		salarioFixo = leia.nextDouble ();
		
		System.out.print ("Digite o valor das vendas R$: ");
		valorVendas = leia.nextDouble ();
		
		if (valorVendas > 1500) {
			//valor final da comissão - consid 3% das vendas
			vendasMaioresQue1500 = valorVendas - 1500;
			valorVendas = 1500;
			} 
			
			comissao = valorVendas * 0.03 + vendasMaioresQue1500 * 0.05;
			salarioTotal = salarioFixo + comissao;			
			System.out.print ("Salario Total R$: " + salarioTotal);
			}
	}


