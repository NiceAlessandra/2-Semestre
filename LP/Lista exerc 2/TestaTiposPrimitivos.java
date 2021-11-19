/*
9  - Crie um arquivo chamado TestaTiposPrimitivos.java. 
* Implemente um programa em Java que declare uma variável 
* de cada um dos tipos primitivos da linguagem Java. Essas 
* variáveis devem ser inicializadas com valores adequados. 
* Por fim, exiba os valores dessas variáveis na saída padrão
 */

public class TestaTiposPrimitivos {
	
	public static void main (String[] args) {
		//Tipos primitivos
		int numero = 10;
		char  letra = 'N'; 
		
		System.out.println ("Numero: " + numero);
		System.out.println ("Caracter: " + letra);
		
		//Booleanos (verdadeiro ou falso)
		System.out.println ("T ou F = " + ( 1==2 )); // false
		System.out.println ("1==2 = " + ( 1==2 )); // false
		System.out.println ("!1==2 = " + !( 1==2 ));
		
		// Tipos primitivos inteiros
		byte valorMinimoB = -128;
		byte valorMaximoB =  127;
		
		System.out.println ("Byte valor minimo: " + valorMinimoB);
		System.out.println ("Byte valor maximo: " + valorMaximoB);
		
		short valorMinimoS = -32768;
		short valorMaximoS = 32767;
		
		System.out.println ("Short valor minimo: " + valorMinimoS);
		System.out.println ("Short valor maximo: " + valorMaximoS);
		
		int valorMinimoI = -2147483648;
		int valorMaximoI = 2147483647;
		
		System.out.println ("Inteiro valor minimo: " + valorMinimoI);
		System.out.println ("Inteiro valor maximo: " + valorMaximoI);
		
		
		long valorMinimoL = -922337203685475808L;
		long valorMaximoL =  922337203685475807L;
				
		System.out.println ("\nLong valor minimo: " + valorMinimoL);
		System.out.println ("\nLong valor maximo: " + valorMaximoL);
		
		//Tipos primitivos - ponto flutuante
		
		float numeroFloat = 3.14f;
		double numeroDouble = 3.14;
		
		System.out.println ("\tFloat: " + numeroFloat);
		System.out.println ("\\Double: " + numeroDouble);
		
		
		
		
		
		
		
		
	}
}

