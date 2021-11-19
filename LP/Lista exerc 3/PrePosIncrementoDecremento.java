/*
 14 - Crie um arquivo chamado PrePosIncrementoDecremento.java.
 *  Complete o código, substituindo a seqüência xxxxx com os 
 * operadores de incremento e decremento. O programa deve 
 * exibir os valores 1, 3, 3 e 1 nessa ordem. Não é necessário 
 * preencher todas as seqüências. 
 * 
 */


public class PrePosIncrementoDecremento {
	
	public static void main (String[] args) {
		
		int a = 1;
		
		System.out.println("a   : " + a); 
		System.out.println("a ++: " + a ++ ); //saída 1
		System.out.println("++ a: " + ++ a  ); //saída 3
		System.out.println("a --: " + a -- ); //saída 3
		System.out.println("-- a: " + -- a  ); //saída 1
		// Pós-fixados: O incremento ou decremento é feito após o uso da variável nas
		// outras expressões que envolvem a variável em questão.
		// Pré-Fixados: O incremento ou decremento é realizado antes que a variável
		// seja utilizada em qualquer outra operação.
		
		
	}
}

