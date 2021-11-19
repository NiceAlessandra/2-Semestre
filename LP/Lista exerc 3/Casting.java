/*
 2 - Crie um arquivo chamado Casting.java. Crie uma variável 
 * chamada numero1 do tipo long e inicialize-a com o valor 
 * 2147483648L. Depois, crie uma variável chamada numero2 do 
 * tipo int e copie o valor da variável numero1 para a variável 
 * numero2. Por fim, exiba, na saída padrão, os valores 
 * dessas duas variáveis. 
 */


public class Casting {
	
	public static void main (String[] args) {
		
		long numero1 = 2147483648L;        
		int  numero2 = (int) 2147483648L;  
				
		System.out.println ("Numero 1: " + numero1); // saída 2147483648
		System.out.println ("Numero 2: " + numero2); // saída - 2147483648 (negativo!!) transbordou
		
	}
}

