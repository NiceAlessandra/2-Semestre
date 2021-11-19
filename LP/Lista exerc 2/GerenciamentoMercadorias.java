/*
  10 - Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa
que declare variáveis para representar os seguintes dados: número do pedido, código do produto,
quantidade e valor total da compra. Inicialize essas variáveis com valores apropriados. Por fim,
exiba os valores armazenados.
 */


public class GerenciamentoMercadorias {
	
	public static void main (String[] args) {
		
		long numeroDoPedido = 2500L;
		int codigoDoProduto = 5; // nao utilizar zeros antes do numero de codios - sempre octal 0x - hexadecimal
		double quantidade = 10.50;
		double valorDaCompra = 200.50;
		
		System.out.println ("Numero do pedido: " + numeroDoPedido);
		System.out.printf  ("Codigo do produto: %0,4d\n", codigoDoProduto); //%4d mostra espaços vazios %0,4d mostra os zeros a esq no limite de 4 casas decimais
		System.out.println ("Quantidade: " + quantidade);
		System.out.println ("Valor da Compra: " + valorDaCompra);
	}
}

