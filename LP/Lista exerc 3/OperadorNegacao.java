/*
13 - Crie um arquivo chamado OperadorNegacao.java. 
* Complete o código, substituindo a seqüência xxxxx 
* com o operador de negação e parênteses. O programa 
* deve exibir os valores true e false nessa ordem. 
* Não é necessário preencher todas as seqüências.
 * 
 */


public class OperadorNegacao {
	
	public static void main (String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean ok = true;
		boolean naoOk = !ok;
		
		System.out.println( "Ok    : " +  (a < b) ); //true
		System.out.println( "Nao ok: " + !(a < b) ); //false
		
	}
}

