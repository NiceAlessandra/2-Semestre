/*
 10 - Crie um arquivo chamado OperadoresRelacionais.java. 
 * Complete o código, substituindo a seqüência xxxxx com 
 * operações de comparação. O programa deve exibir os 
 * valores false, false, true, true, false e true nessa 
 * ordem. Não utilize o mesmo operador duas ou mais vezes. 
 * 
 */


public class OperadoresRelacionais {
	
	public static void main (String[] args) {
		
		int a = 1;
		int b = 2;
		// <  >=
		// <= >
		// == !=
		System.out.println ("a: " + a);
		System.out.println ("b: " + b);
		System.out.println("a >  b : " + (a >  b)); //false
		System.out.println("a >= b : " + (a >= b)); //false
		System.out.println("a <  b : " + (a <  b)); //true
		System.out.println("a <= b : " + (a <= b)); //true 
		System.out.println("a == b : " + (a == b)); //false
		System.out.println("a != b : " + (a != b)); //true
		
	}
}

