/*
A condição de overflow ocorre quando o valor atribuído a uma variável é maior 
* que o maior valor que o tipo desta variável consegue representar. Por exemplo, 
* se houvesse um tipo decimal, que somente consegue representar os valores de 0 a 9, 
* no caso de tentarmos atribuir o resultado da operação 5+5 a uma variável deste tipo, 
* o resultado seria um overflow. Um underflow acontece nos casos em que o valor que 
* se tenta atribuir é menor que o menor valor que o tipo é capaz de representar.
* As conversões de tipos numéricos acontecem quando um valor é atribuído a uma variável 
* de um tipo diferente. Por exemplo, se atribuirmos o valor 10.0 (que é do tipo double) 
* a uma variável do tipo int, ou se for atribuído um valor do tipo long a uma variável 
* do tipo int. Todas esta situações podem resultar em falhas ou vulnerabilidades na 
* execução da aplicação, caso haja alguma suposição (mesmo que implícita) sobre a 
* magnitude ou sinal dos valores usados. Nos casos de conversões de tipos, o compilador 
* irá acusar apenas se as conversões implícitas tiverem risco de perda de informação. 
* No caso das conversões explícitas (casts), não há esta verificação pelo compilador 
* e o programador deve tomar as precauções necessárias. Todas as atribuições devem ser 
* verificadas quanto à possibilidade de gerar overflow, underflow ou perdas quando da 
* conversão de tipos.
 * 
 *7 - Crie um arquivo chamado OverflowUnderflow.java. Complete o código, substituindo a
seqüência xxxxx com valores literais. O programa deve exibir os números -2147483648 e
2147483647 nessa ordem. 

 */


public class OverflowUnderflow {
	
	public static void main (String[] args) {
				
		System.out.println (   2147483647 + 1); // soma    1 -> cai no primeiro numero negativo 
		System.out.println ( - 2147483648 - 1); // subtrai 1 -> volta para o primeiro numero positivo
 }
}		
		


