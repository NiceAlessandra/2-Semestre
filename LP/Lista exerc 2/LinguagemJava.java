/*
7 – Indique os tipos da linguagem Java que aceitam cada valor 
* da lista abaixo. 
a. "Bom dia" // b. 3 // c. 235.13  // d. true  // e. -135  
* // f. 256.23F // g. 'A'  // h. 6463275245745L 
Obs: faça os testes necessários com um programa escrito 
* em Java para identificar os tipos.
*  
 */

public class LinguagemJava {
	
	public static void main (String[] args) {
		
		String palavra = "Bom dia";
		byte numero = 3;
		double numeroDouble = 235.13;
		boolean ok = true;
		short numeroNegativo = -135;
		float numeroFloat = 256.23F;
		char letra = 'A';
		long numeroLong = 6463275245745L;
		
		System.out.println ("a. Texto: " + palavra);
		System.out.println ("b. Numero: " + numero);
		System.out.println ("c. Numerod: " + numeroDouble);
		System.out.println ("d. Ok: " + true);
		System.out.println ("e. Numero negativo: " + numeroNegativo);
		System.out.println ("f. Numero float: " + numeroFloat);
		System.out.println ("g. Letra: " + letra);
		System.out.println ("h. Numero long: " + numeroLong);
		
	}
}

